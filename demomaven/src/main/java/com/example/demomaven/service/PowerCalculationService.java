package com.example.demomaven.service;

import com.example.demomaven.model.Component;
import com.example.demomaven.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerCalculationService {

    private final ComponentRepository componentRepository;
    
    // Safety margin for power supply (20%)
    private static final double SAFETY_MARGIN = 1.2;
    
    @Autowired
    public PowerCalculationService(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }
    
    /**
     * Calculate the total power consumption of the selected components
     * @param componentIds List of component IDs to include in calculation
     * @return Total power consumption in watts
     */
    public int calculateTotalPowerConsumption(List<Long> componentIds) {
        return componentRepository.findAllById(componentIds).stream()
                .mapToInt(Component::getPowerConsumption)
                .sum();
    }
    
    /**
     * Calculate the recommended power supply wattage based on components
     * @param componentIds List of component IDs to include in calculation
     * @return Recommended power supply wattage with safety margin
     */
    public int calculateRecommendedPowerSupply(List<Long> componentIds) {
        int totalPower = calculateTotalPowerConsumption(componentIds);
        return (int) Math.ceil(totalPower * SAFETY_MARGIN);
    }
    
    /**
     * Get all available components
     * @return List of all components
     */
    public List<Component> getAllComponents() {
        return componentRepository.findAll();
    }
    
    /**
     * Get components by type
     * @param type Component type (CPU, GPU, etc.)
     * @return List of components of the specified type
     */
    public List<Component> getComponentsByType(String type) {
        return componentRepository.findByType(type);
    }
    
    /**
     * Save a new component
     * @param component Component to save
     * @return Saved component
     */
    public Component saveComponent(Component component) {
        return componentRepository.save(component);
    }
}