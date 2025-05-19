# Power Supply Calculator

This application calculates the required power supply wattage based on computer components. It uses a PostgreSQL database running in Docker to store component information including type (CPU, GPU, RAM, etc.) and power consumption.

## Features

- Store and manage computer components with their power consumption values
- Calculate total power consumption of selected components
- Calculate recommended power supply wattage with safety margin (20%)
- RESTful API for component management and power calculations
- Simple web interface for component selection and power calculation

## Technologies Used

- Java with Spring Boot
- Spring Data JPA for database access
- PostgreSQL database (running in Docker)
- Maven for dependency management and building
- Docker and Docker Compose for containerization
- HTML, CSS, and JavaScript for the frontend

## Prerequisites

- Java 17 or higher
- Maven
- Docker and Docker Compose

## Running the Application

### 1. Start the PostgreSQL Database

```bash
docker-compose up -d
```

This will start a PostgreSQL database container with the following configuration:
- Database name: power_calculator
- Username: postgres
- Password: postgres
- Port: 5432

### 2. Build and Run the Application

```bash
./mvnw spring-boot:run
```

The application will start on port 8080 and automatically create the necessary database tables and populate them with sample component data.

### 3. Access the Application

Open your browser and navigate to:
```
http://localhost:8080
```

## API Endpoints

- `GET /api/power-calculator/components` - Get all components
- `GET /api/power-calculator/components/type/{type}` - Get components by type
- `POST /api/power-calculator/components` - Create a new component
- `POST /api/power-calculator/calculate` - Calculate power requirements for selected components

## How to Use

1. Open the web interface at http://localhost:8080
2. Select the components you want to include in your system
3. Click the "Calculate Power Requirements" button
4. View the total power consumption and recommended power supply wattage

## Sample Component Data

The application is pre-loaded with sample components including:
- CPUs (Intel Core i5/i7/i9, AMD Ryzen)
- GPUs (NVIDIA GeForce RTX series, AMD Radeon)
- RAM modules
- Storage devices (SSDs, HDDs)
- Motherboards
- Cooling solutions
- Case fans and other peripherals

## Power Calculation Logic

The power calculation uses the following formula:
1. Sum the power consumption of all selected components
2. Apply a 20% safety margin to account for power spikes and future upgrades

This ensures that the recommended power supply will have sufficient capacity for the system.