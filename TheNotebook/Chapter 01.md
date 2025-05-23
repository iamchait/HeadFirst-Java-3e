# 🌊 Breaking the Surface

## 📘 Introduction to Java
- **Java**, released on **January 23, 1996**, has been a key player in the software development world for **over 29 years**.
- Over these years, **Java has evolved significantly**, with the **Java API** growing to offer vast libraries and functionality.
- Over these years, **Java has evolved significantly**, with the **Java API** growing to offer vast libraries and functionality.
- Although **Java’s performance was once criticized** due to the reliance on interpreted bytecode, modern JVMs use **JIT (Just-In-Time) compilation** and advanced optimizations to make Java applications run faster.
- **Java is known for using more memory** compared to some other languages, though its features (such as automatic memory management) often justify this trade-off.

## ⚙️ The Way Java Works
- **Source File**: Write Java code and save it with the `.java` extension.
- **Compilation**: The `javac` compiler checks for syntax errors and, if the code is error-free, it generates **platform-independent bytecode** in `.class` files.
- **Execution**: The **JVM** loads and executes the bytecode, checking for **runtime errors** and running the program.

**Summary**:
```MD
Source File ----compiler----> Bytecode ----Interpreter (JVM)----> Execution
```
## 🧬 Java Program Anatomy
- **Source File**: Contains one or more classes. If there is a public class, the file is typically named after that class (with `.java` extension).
- **Class**: A blueprint for creating objects. It contains **properties/attributes** (fields) that store data, and **methods** (functions) that define behavior.
- **Method**: Contains **statements**—the instructions that define program behavior. Every statement ends with a **semicolon**.

-**Summary**:
```MD
Source File ----contains----> Class ----contains----> Method(s) ----contains----> Statement(s) ----made up of----> Tokens
```

### 🧱 Java Application Anatomy
**Application**: A typical Java application contains at least one **package**, which groups related classes.
**Package**: A collection of related classes. Packages help organize code and prevent naming conflicts.
**Class**: A Java application contains one main class with the `main()` method, which is the entry point for execution. Other classes define the program's behavior and data structures.
#### 🔄 Application Execution Flow
Execution starts in the `main()` method, and the program runs sequentially until completion.

**Summary**:
```MD
Application ----contains----> Package(s) ----Contains----> Class(es)

Application ----contains----> Only 1 Main Class ---Contains----> main() Method

Application ----starts by----> Executing instructions inside main()
```

## 🧪 Compiler vs JVM
### 🛠️ Compiler:
- **The Compiler's Role:** The compiler translates Java source code into machine independent **bytecode**, ensuring that the code follows Java's syntax and rules. It catches errors before the program runs and optimizes the code for efficiency.
- **Responsibilities**: 
	- **Syntax Checking:** Ensures the code follows Java's rules.
	- **Type Checking:** Verifies correct usage of variables and methods.
	- **Bytecode Generation:** Converts Java code from `.java` files into `.class` files.
	- **Optimization:** Improves efficiency before execution.
### 🔍 JVM (Interpreter)
- **The JVM's Role:** The JVM takes the compiled bytecode and **executes** it, making Java programs platform-independent. It manages memory, optimizes performance, and ensures security while running the program.
- **Responsibilities**:
	- **Class Loading:** Loads `.class` files into memory.
	- **Bytecode Execution:** Converts bytecode into machine-specific instructions.
	- **Memory Management:** Handles heap and stack memory.
	- **Garbage Collection:** Automatically removes unused objects.
	- **Security & Optimization:** Ensures safe execution and improves performance.
#### 🧩 JVM components
- **Class Loader:** Loads `.class` files.
- **Execution Engine:** Runs bytecode using an interpreter or JIT compiler.
- **Heap & Stack:** Manages memory allocation.
- **Garbage Collector:** Frees unused memory.
### 📊Summary
| Feature                 | **Compiler** (Javac)                            | **JVM** (Java)                                                 |
| ----------------------- | ----------------------------------------------- | -------------------------------------------------------------- |
| **Purpose**             | Translates Java code to bytecode                | Executes bytecode and runs the program                         |
| **Execution Time**      | Before running the program                      | During program execution                                       |
| **Platform Dependency** | Generates platform-independent bytecode         | Converts bytecode to platform-specific machine code            |
| **Error Detection**     | Detects syntax and type errors before execution | Handles runtime errors                                         |
| **Optimization**        | May optimize bytecode before execution          | Uses JIT compilation and runtime optimizations for performance |
| **Memory Management**   | Not involved in memory management               | Manages memory and performs garbage collection                 |
## 🧠 What Goes Inside `main()` Method?
In Java everything begins with `main()` or any other methods. Methods contain all normal things that can say in the most of the programming languages to **make the computer do something**.
**These things might be**
- **Expressions**: A combination of **variables**, **operators**, and **values** that evaluate to a single result.
- **Statements**: The smallest executable unit, such as assignments, method calls, or control structures.
- **Control Structures**: These dictate the flow of execution in a program. Common control structures include:
	- **Conditional Statements**: `if`, `else-if`, `switch`, `continue`
	- **Looping Statements**: `for`, `while`, `do-while`, enhanced `for` loop

## 🎵 First Program - 10 Green Bottles
```java
public class TenGreenBottles {  
    public static void main(String[] args) {  
  
        int numberOfBottles = 20;  
        String word = "bottles";  
  
        while (numberOfBottles > 0) {  
  
            if (numberOfBottles == 1) {  
                word = "bottle";  
            }  
            System.out.println(numberOfBottles + " green " + word + ", hanging on the wall");  
            System.out.println(numberOfBottles + " green " + word + ", hanging on the wall");  
            System.out.println("And if one green bottle should accidentally fall,");  
            numberOfBottles = numberOfBottles -1;  
  
            if (numberOfBottles > 0) {  
                System.out.println("There'll be " + numberOfBottles + " green " + word +  
                        ", hanging on the wall \n");  
            } else {  
                System.out.println("There'll be no green bottles, hanging on the wall");  
            }  
        }  
    }  
}
```

### 📖 Explanation:
This program simulates the lyrics of the "10 Green Bottles" song. It uses a `while` loop to iterate through the song lyrics until no bottles remain on the wall.
##### 🔢 Variables:
There are two variables declared inside the program as follows:
- **`numberOfBottles`** an **integer** type initially set to **`10`**, representing total number of bottles hanging on the wall.
- **`word`** a **String** type initially holds the value **`bottles`** then changes to **`bottle`** when the **`numberOfBottles`** count reaches to 1.
##### 🔁 While Loop
- The loop runs as long as **`numberOfBottles > 0`**, meaning it will continue until all the bottles have fallen.
- On each iteration, the program prints:
	- The number of bottles and the word ("bottle" or "bottles").
	- A line describing the bottle falling.
	- A final line that either tells the number of bottles left or says "no bottles" when the count reaches zero.
##### 🪵 IF-Condition
- The first `if` condition inside the `while` loop checks if **`numberOfBottles == 1`**. When this is true, it updates the **`word`** variable from **`"bottles"`** to **`"bottle"`** to reflect the singular form.
##### 🪵 IF-ELSE Condition
- After updating the number of bottles, the program checks if there are still bottles remaining. If **`numberOfBottles > 0`**, it prints how many bottles are left.
- If there are no bottles left (**`numberOfBottles == 0`**), the program prints **`"There'll be no green bottles, hanging on the wall"`**.

## 🧙‍♂️ Second Program - Phrase-O-Matic
```java
public class PhraseOMatic {
	// Method to build a phrase by randomly selecting one word from each of the three word lists
	private static String phraseBuilder(String[] listOne, String[] listTwo, String[] listThree) {

		// Get the length of each list
		int oneLength = listOne.length;
		int twoLength = listTwo.length;
		int threeLength = listThree.length;

		// Generate random indices for each list
		java.util.Random randomNumberGenerator = new java.util.Random();
		int randOne = randomNumberGenerator.nextInt(oneLength);
		int randTwo = randomNumberGenerator.nextInt(twoLength);
		int randThree = randomNumberGenerator.nextInt(threeLength);

		// Construct and return phrase
		return listOne[randOne] + " " + listTwo[randTwo] + " " + listThree[randThree];
	}

	public static void main(String[] a) {

		// Define three lists of words to choose from  
		String[] wordListOne = {  
        "agnostic", "opinionated", "voice activated", "haptically driven",  
        "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"  
		};  
		String[] wordListTwo = {  
        "loosely coupled", "six sigma", "asynchronous", "event driven",  
        "pub-sub", "IoT", "cloud native", "service oriented",  
        "containerized", "serverless", "microservices", "distributed ledger"  
		};
		String[] wordListThree = {  
        "framework", "library", "DSL", "REST API", "repository", "pipeline",  
        "service mesh", "architecture", "perspective", "design", "orientation"  
		};
		
		// Call the buildPhrase method with the three word lists and store the result
		String phrase = phraseBuilder(wordListOne, wordListTwo, wordListThree);
		
		// Output the generated phrase to the console
		System.out.println("What we need is a " + phrase);
	}
}
```

### 🗣️ Explanation:
This program is a simple phrase generator that randomly combines one word from each of three separate word lists to produce a tech-sounding phrase like: `"What we need is a reactive cloud native repository"`. It demonstrates how random selection and string concatenation can be used to create dynamic output.
##### 🔧 Variables and Structures
-  **`wordListOne`, `wordListTwo`, `wordListThree`**
	Three arrays of type `String` are declared in the `main` method. Each list holds different types of tech jargon or buzzwords:
	- `wordListOne`: Descriptive adjectives or phrases.
	- `wordListTwo`: Technical descriptors or methodologies.
	- `wordListThree`: Nouns typically used in software/tech contexts.


-  **`phraseBuilder()` Method
	This method accepts the three word lists as parameters and performs the following:
	- **Finds the length** of each list.    
	- **Generates one random index** for each list using Java's `Random` class.    
	- **Builds a phrase** by selecting one word from each list using the random indices.    
	- **Returns** the phrase as a single `String`.
#####  🔁 Execution Flow:
1. Program execution starts with the `main()` method.
2. It defines the three word lists (`wordListOne`, `wordListTwo`, `wordListThree`).
3. It calls the `phraseBuilder()` method, passing these three lists as arguments.
4. Inside `phraseBuilder()`:
	1. A random word is selected from each list.
	2. A phrase is formed by joining the three words with spaces.
	3. This phrase is returned to the caller.
5. The returned phrase is stored in the variable `phrase`.
6. The program prints: `"What we need is a " + phrase`.
##### 🧠 Key Concepts Demonstrated:
- **Array usage** to store multiple values.
- **Random number generation** for selecting random words.
- **String concatenation** to build phrases.
- **Methods and parameters** to modularize functionality.
## 🧾 Chapter Summary
- Since Java is an **Object-Oriented Programming Language**, everything you write goes inside a class. A class is a blueprint for creating objects (e.g., `User`, `Application`, `BankAccount`).
- A typical Java application might have dozens or hundreds of classes, but you’ll only have one class with a `main` method—the one that starts the program running.
- Unlike some other languages, Java does not support integers (0 or 1) for **Boolean** testing. It only supports either `true` or `false`.