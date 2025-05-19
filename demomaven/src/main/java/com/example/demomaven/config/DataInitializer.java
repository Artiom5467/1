package com.example.demomaven.config;

import com.example.demomaven.model.Component;
import com.example.demomaven.repository.ComponentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(ComponentRepository componentRepository) {
        return args -> {
            // Clear existing data
            componentRepository.deleteAll();

            // CPUs - AMD Ryzen
            componentRepository.save(new Component("AMD Ryzen 3 1300X", "CPU", 65, "4-core, 4-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 5 1600X", "CPU", 95, "6-core, 12-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 7 1800X", "CPU", 95, "8-core, 16-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 5 2600", "CPU", 65, "6-core, 12-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 7 2700X", "CPU", 105, "8-core, 16-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 5 3600", "CPU", 65, "6-core, 12-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 7 3700X", "CPU", 65, "8-core, 16-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 9 3900X", "CPU", 105, "12-core, 24-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 5 5600X", "CPU", 65, "6-core, 12-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 7 5800X", "CPU", 105, "8-core, 16-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 9 5950X", "CPU", 105, "16-core, 32-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 5 7600X", "CPU", 105, "6-core, 12-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 7 7700X", "CPU", 105, "8-core, 16-thread desktop processor"));
            componentRepository.save(new Component("AMD Ryzen 9 7950X", "CPU", 170, "16-core, 32-thread desktop processor"));

            // CPUs - Intel
            componentRepository.save(new Component("Intel Core i5-8400", "CPU", 65, "6-core, 6-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i7-8700K", "CPU", 95, "6-core, 12-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i5-9600K", "CPU", 95, "6-core, 6-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i7-9700K", "CPU", 95, "8-core, 8-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i9-9900K", "CPU", 95, "8-core, 16-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i5-10600K", "CPU", 125, "6-core, 12-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i7-10700K", "CPU", 125, "8-core, 16-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i9-10900K", "CPU", 125, "10-core, 20-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i5-11600K", "CPU", 125, "6-core, 12-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i7-11700K", "CPU", 125, "8-core, 16-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i9-11900K", "CPU", 125, "8-core, 16-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i5-12600K", "CPU", 125, "10-core, 16-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i7-12700K", "CPU", 125, "12-core, 20-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i9-12900K", "CPU", 125, "16-core, 24-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i5-13600K", "CPU", 125, "14-core, 20-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i7-13700K", "CPU", 125, "16-core, 24-thread desktop processor"));
            componentRepository.save(new Component("Intel Core i9-13900K", "CPU", 253, "24-core, 32-thread desktop processor"));

            // GPUs - AMD
            componentRepository.save(new Component("AMD Radeon RX 480", "GPU", 150, "8GB GDDR5 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 580", "GPU", 185, "8GB GDDR5 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 590", "GPU", 225, "8GB GDDR5 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 5500 XT", "GPU", 130, "8GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 5600 XT", "GPU", 150, "6GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 5700 XT", "GPU", 225, "8GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 6600", "GPU", 132, "8GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 6600 XT", "GPU", 160, "8GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 6700 XT", "GPU", 230, "12GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 6800", "GPU", 250, "16GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 6800 XT", "GPU", 300, "16GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 6900 XT", "GPU", 300, "16GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 7600", "GPU", 165, "8GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 7700 XT", "GPU", 245, "12GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 7800 XT", "GPU", 263, "16GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 7900 XT", "GPU", 315, "20GB GDDR6 graphics card"));
            componentRepository.save(new Component("AMD Radeon RX 7900 XTX", "GPU", 355, "24GB GDDR6 graphics card"));

            // GPUs - NVIDIA
            componentRepository.save(new Component("NVIDIA GeForce GTX 1060", "GPU", 120, "6GB GDDR5 graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce GTX 1070", "GPU", 150, "8GB GDDR5 graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce GTX 1070 Ti", "GPU", 180, "8GB GDDR5 graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce GTX 1080", "GPU", 180, "8GB GDDR5X graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce GTX 1080 Ti", "GPU", 250, "11GB GDDR5X graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 2060", "GPU", 160, "6GB GDDR6 graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 2070", "GPU", 175, "8GB GDDR6 graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 2080", "GPU", 215, "8GB GDDR6 graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 2080 Ti", "GPU", 250, "11GB GDDR6 graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 3060", "GPU", 170, "12GB GDDR6 graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 3070", "GPU", 220, "8GB GDDR6 graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 3080", "GPU", 320, "10GB GDDR6X graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 3090", "GPU", 350, "24GB GDDR6X graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 4060", "GPU", 115, "8GB GDDR6 graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 4070", "GPU", 200, "12GB GDDR6X graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 4080", "GPU", 320, "16GB GDDR6X graphics card"));
            componentRepository.save(new Component("NVIDIA GeForce RTX 4090", "GPU", 450, "24GB GDDR6X graphics card"));

            // RAM
            componentRepository.save(new Component("Corsair Vengeance LPX 16GB", "RAM", 10, "2x8GB DDR4-3200MHz"));
            componentRepository.save(new Component("G.Skill Trident Z RGB 32GB", "RAM", 15, "2x16GB DDR4-3600MHz"));

            // Storage
            componentRepository.save(new Component("Samsung 970 EVO Plus 1TB", "Storage", 8, "NVMe M.2 SSD"));
            componentRepository.save(new Component("Western Digital Blue 2TB", "Storage", 6, "7200RPM HDD"));

            // Motherboards
            componentRepository.save(new Component("ASUS ROG Strix Z690-E Gaming", "Motherboard", 45, "Intel LGA 1700 ATX gaming motherboard"));
            componentRepository.save(new Component("MSI MPG B550 Gaming Edge WiFi", "Motherboard", 35, "AMD AM4 ATX gaming motherboard"));

            // Cooling
            componentRepository.save(new Component("NZXT Kraken X63", "Cooling", 30, "280mm AIO liquid CPU cooler"));
            componentRepository.save(new Component("Noctua NH-D15", "Cooling", 5, "Dual-tower CPU air cooler"));

            // Case Fans
            componentRepository.save(new Component("Corsair LL120 RGB (3-pack)", "Fan", 15, "120mm RGB case fans"));
            componentRepository.save(new Component("be quiet! Silent Wings 4", "Fan", 5, "140mm PWM case fan"));

            // Optical Drives
            componentRepository.save(new Component("ASUS DRW-24B1ST", "Optical", 25, "DVD-RW optical drive"));

            // Other peripherals
            componentRepository.save(new Component("RGB LED Strip", "Peripheral", 5, "Addressable RGB LED strip"));
            componentRepository.save(new Component("Internal Card Reader", "Peripheral", 3, "USB 3.0 internal card reader"));
        };
    }
}
