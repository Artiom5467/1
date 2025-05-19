package com.example.demomaven.controller;

import com.example.demomaven.model.Component;
import com.example.demomaven.service.PowerCalculationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/power-calculator")
@Tag(name = "Power Calculator API", description = "API для розрахунку потужності блоку живлення для комп'ютерних компонентів")
public class PowerCalculatorController {

    private final PowerCalculationService powerCalculationService;

    @Autowired
    public PowerCalculatorController(PowerCalculationService powerCalculationService) {
        this.powerCalculationService = powerCalculationService;
    }

    @Operation(summary = "Отримати всі компоненти", description = "Повертає список всіх доступних комп'ютерних компонентів")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Успішно отримано список компонентів",
                content = @Content(mediaType = "application/json", schema = @Schema(implementation = Component.class)))
    })
    @GetMapping("/components")
    public ResponseEntity<List<Component>> getAllComponents() {
        return ResponseEntity.ok(powerCalculationService.getAllComponents());
    }

    @Operation(summary = "Отримати компоненти за типом", description = "Повертає список компонентів певного типу")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Успішно отримано список компонентів за типом",
                content = @Content(mediaType = "application/json", schema = @Schema(implementation = Component.class)))
    })
    @GetMapping("/components/type/{type}")
    public ResponseEntity<List<Component>> getComponentsByType(
            @Parameter(description = "Тип компонента (CPU, GPU, RAM, тощо)") @PathVariable String type) {
        return ResponseEntity.ok(powerCalculationService.getComponentsByType(type));
    }

    @Operation(summary = "Створити новий компонент", description = "Додає новий комп'ютерний компонент до бази даних")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Компонент успішно створено",
                content = @Content(mediaType = "application/json", schema = @Schema(implementation = Component.class)))
    })
    @PostMapping("/components")
    public ResponseEntity<Component> createComponent(
            @Parameter(description = "Дані нового компонента") @RequestBody Component component) {
        return ResponseEntity.ok(powerCalculationService.saveComponent(component));
    }

    @Operation(summary = "Розрахувати потужність", description = "Розраховує загальне споживання енергії та рекомендовану потужність блоку живлення")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Успішно розраховано потужність",
                content = @Content(mediaType = "application/json", schema = @Schema(implementation = Map.class)))
    })
    @PostMapping("/calculate")
    public ResponseEntity<Map<String, Integer>> calculatePowerRequirements(
            @Parameter(description = "Список ID компонентів для розрахунку") @RequestBody List<Long> componentIds) {
        int totalPower = powerCalculationService.calculateTotalPowerConsumption(componentIds);
        int recommendedPower = powerCalculationService.calculateRecommendedPowerSupply(componentIds);

        Map<String, Integer> result = new HashMap<>();
        result.put("totalPowerConsumption", totalPower);
        result.put("recommendedPowerSupply", recommendedPower);

        return ResponseEntity.ok(result);
    }
}