# Pokepedia 2.0

Pokepedia 2.0 is an enhanced version of the Pokepedia application that allows users to explore information about first-generation Pokémon. This version implements the Model-View-Controller (MVC) design pattern for better organization and scalability.

**[Pokepedia 1.0 Reference](https://github.com/OscarNavarrolol/PokePedia-1.0.git)**

[![PokeImg](https://i.postimg.cc/k490WrtH/descargar.png)](https://postimg.cc/R3spzDd1)

## Features

- **Data Exploration:** Retrieve detailed data for each Pokémon from the PokeAPI.
- **User Interface:** Display Pokémon details including names, types, and front sprite images.
- **Search Functionality:** Find specific Pokémon by name or ID.
- **Error Handling:** Manage cases where API requests fail or data is unavailable.

## Implementation Details

### Model
- Handles data retrieval from the PokeAPI.
- Parses and manages Pokémon information (name, types, images).
- Manages interactions with the data source.

### View
- Represents the user interface elements.
- Displays Pokémon details fetched from the Model.
- Allows user interaction for searching and viewing Pokémon data.

### Controller
- Mediates between the Model and View components.
- Processes user inputs and updates data accordingly.
- Orchestrates the flow of information between Model and View.

## Technologies Used

- **Java:** Core programming language used for the application.
- **HTTP Libraries:** Utilized for making requests to the PokeAPI.
- **GUI Framework:** Java Swing/JavaFX for the graphical user interface.

## Setup Instructions

1. Clone the repository: `git clone https://github.com/your_username/pokepedia-2.0.git`
2. Open the project in your preferred Java IDE.
3. Ensure necessary dependencies are installed.
4. Run the application.

## Contributions

Contributions are welcome! If you'd like to contribute to Pokepedia 2.0, feel free to fork the repository and create a pull request.

## Acknowledgments

- This project utilizes the PokeAPI for Pokémon data retrieval.
- Thanks to the contributors and developers of the libraries used.

## License

This project is licensed under the [MIT License](LICENSE).
