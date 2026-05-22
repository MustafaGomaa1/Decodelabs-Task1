Number Guessing Game
A Java-based console application where players try to guess a randomly generated hidden number. The game provides real-time feedback on whether the guess is too high or too low, making for an engaging CLI experience. This project was developed as a technical task for the DecodeLab internship.

🚀 Features
Random Number Generation: Dynamically generates a secret number within a specified range (e.g., 1 to 100) for every new game.

Interactive Feedback: Tells the player if their guess is "Too High" or "Too Low" to help guide their next move.

Score & Attempt Tracking: Keeps track of the total number of attempts the player took to find the correct answer.

Game Loop Integration: Allows the user to play multiple rounds without restarting the application.

🛠️ Tech Stack
Language: Java (JDK 8 or higher)

Core Libraries: java.util.Scanner (for user input) and java.util.Random (for generating the hidden number)

🎮 How to Play
The system selects a random number within a predefined range.

Enter your guess in the console interface.

Read the feedback hint (Too High or Too Low).

Keep guessing until you crack the correct number!

💻 How to Run
Clone the repository:

Bash
git clone https://github.com/MustafaGomaa1/Decodelabs-Task1.git

2. **Navigate to the directory:**
   ```bash
   cd Decodelabs-Task1
   
Compile the Java file:

Bash
javac NumberGuessingGame.java

4. **Run the application:**
   ```bash
   java NumberGuessingGame
   
(Note: If your main class file is named differently, just replace NumberGuessingGame with your actual file name during compilation and execution).

📂 Project Structure
Plaintext
Decodelabs-Task1/
└── NumberGuessingGame.java  # Main game loop and logic
🤝 Contributing
Contributions, issues, and feature requests are welcome! Feel free to check the issues page if you want to contribute.

Developed by Mustafa Gomaa as part of the DecodeLab Technical Tasks.
