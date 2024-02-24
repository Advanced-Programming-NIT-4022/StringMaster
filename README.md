
# First Assignment #

Welcome to your first coding challenge. In this challenge, you need to complete 10 functions which we will explain later.

## Getting Started With Git & GitHub
Before getting started, please make sure that you've installed Git correctly on your system. To find it out, let's open the terminal in your Windows and write this command:

`git --version`

If you got some errors and didn't find your Git version or Git command, you can use this [LINK](https://git-scm.com/downloads) to download the appropriate Git version related to your system.

So it's time to open the project in our own system.

In the first step, fork this repo from the top right option called "Fork" and create a copy of it in your own repo.

Now get back to your own repo and select the option called "Code" and copy the link of your repo.

It's time to bring the files to your system and start coding! Let's find a place in your PC where you want to place the project. Open the terminal in that folder and write this command:

`git clone the-link-you've-just-copied`

Alright, it seems that your project is now added to your system! Let's start coding.

## Functions
In this section, we want to explain the functions that you need to complete for this assignment.

Functions are divided into 3 classes and we want to explain them one by one.

### wordFinder(String sentence, int number)
This function will take a sentence and a number. Let's assume that the number is equal to 3, in this case, this function has to return the third word of this sentence. The number and the sentence will change in testing.

#### Examples
```
sentence = Hello Everyone My Name Is Aryan
number = 6

Output: Aryan
```
```
sentence = Hello World
number = 1

Output: Hello
```
Don't forget special conditions:
```
sentence = Welcome To NIT
number = 4

Output: Number = 4 is out Of Bound
```

### oddEvenCounter(String number, boolean searchForEven)
This function will take a String of numbers and a boolean.
When the searchForEven is true, it will count even numbers in that string and when it is false, it would search for odd numbers in the string.

#### Examples
```
Input:
number = 123456
searchForEven = true

Output: 3
```
```
Input:
number = 1234567
searchForEven = false

Output: 4
```

### firstWord(String wordA, String wordB)
In this function, you have 2 words, and your objective is to return the word that is alphabetically earlier than the other one.

NOTE: Don't use pre-built functions for sorting.

#### Examples
```
Input:
wordA = Aryan
wordB = Kianmehr

Output: Aryan
```
```
Input:
wordA = Amir
wordB = AmirMohammad

Output: Amir
```

### wordCensor(String sentence, String word, String newWord)
In this function, you will have a sentence. The task of this function is to get one word and change this word to the newWord in that sentence.

NOTE: You can't use pre-built methods like replace or replaceAll etc that replace the words by their own for this assignment.
#### Examples
```
Input:
sentence = Welcome To Sharif 
word = Sharif
newWord = NIT

Output: Welcome To NIT
```
```
Input:
sentence = I'm coding in C++
word = C++
newWord = Java

Output: I'm coding in Java
```

### normalizingName(String firstName, String lastName)
In this function, you will receive a firstname and a lastname and your task is to make a normal full name.

A normal fullname is a name that both of its firstname and lastname starts with a capital letter and other letters are lowercase.
#### Examples
```
Input:
firstName = ArYan
lastName = nOUrBAKHsh

Output: Aryan Nourbakhsh
```
#### Examples
```
Input:
firstName = MATIN
lastName = babki

Output: Matin Babaki
```

### doubleChar(String word)
In this function, you will receive a word. The task of this function is to remove consecutive repeated letters and put just one of them in the word and return it.

#### Examples
```
Input:
word = Aryanoor

Output: Aryanor
```
```
Input:
word = Mohammad

Output: Mohamad
```