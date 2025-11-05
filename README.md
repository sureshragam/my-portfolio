# My Portfolio

This repository contains the backend code for my personal portfolio. It is designed to showcase my skills, projects, and experiences.

## Features

- **Dynamic Content**: Easily update portfolio details.
- **API Integration**: Fetch data for projects, skills, and more.
- **Scalable Architecture**: Built with best practices for maintainability.

## Prerequisites

- **Java**: Ensure Java 11 or higher is installed.
- **Maven**: Build and dependency management.
- **Database**: MongoDB instance for data storage.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/my-portfolio.git
   ```
2. Navigate to the project directory:
   ```bash
   cd my-portfolio
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```

## Configuration

1. Update the `application.properties` file:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/portfolio
   ```
2. Ensure your MongoDB instance is running.

## Running the Application

Start the application using:

```bash
mvn spring-boot:run
```

## API Endpoints

| Method | Endpoint        | Description              |
| ------ | --------------- | ------------------------ |
| GET    | `/api/projects` | Fetch all projects       |
| POST   | `/api/contact`  | Submit a contact request |

## Contributing

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes and open a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For questions or feedback, reach out at [your-email@example.com](mailto:your-email@example.com).
