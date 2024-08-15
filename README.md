## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# Password Generator

A Java-based application with a graphical user interface for generating strong, customizable passwords.

## Features

- Generate passwords with customizable length
- Include or exclude uppercase letters, lowercase letters, numbers, and symbols
- User-friendly GUI built with Java Swing
- Copy-paste functionality for easy use of generated passwords

## Screenshots

![Password Generator GUI](/password_generator_screenshot.JPG)

*Caption: The main interface of the Password Generator application.*

[Add more screenshots and captions as needed]

## Components

The project consists of three main classes:

1. `App`: The entry point of the application
2. `PasswordGeneratorGUI`: Handles the graphical user interface
3. `PasswordGenerator`: The backend logic for generating passwords

### App

This class contains the `main` method that instantiates and displays the GUI.

### PasswordGeneratorGUI

This class extends `JFrame` and creates the graphical interface, including:

- Title label
- Password output area
- Password length input field
- Toggle buttons for character types (uppercase, lowercase, numbers, symbols)
- Generate button

### PasswordGenerator

This class contains the logic for generating passwords based on user preferences. It includes:

- Character pools for different types (lowercase, uppercase, numbers, symbols)
- A method to generate passwords based on specified criteria

## How to Use

1. Run the application
2. Enter the desired password length
3. Toggle on/off the character types you want to include
4. Click the "Generate" button
5. Copy the generated password from the output area

## Dependencies

- Java SE Development Kit (JDK)
- Java Swing library (included in JDK)

## Issues

If you encounter any problems or have suggestions for improvements, please file an issue on our GitHub issue tracker:

[Report an Issue](https://github.com/dhanarajrk/password-generator/issues)

## License

[MIT License](https://opensource.org/licenses/MIT)

Feel free to contribute to this project by submitting pull requests or reporting issues.

