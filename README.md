# BRN-Quiz Starter Code

Welcome to the **Starter Code for BRN-Quiz**!  
This repository contains the base code you’ll need to complete your upcoming test.

## Features
BRN-Quiz is a state-of-the-art Quiz App that:
- Selects and displays one multiple-choice question, 
- Lets the user select an answer from a ListView, and 
- Shows whether the selected answer is correct upon pressing a Submit Button. 
- It uses solid-state-quantum technology to keep track of how many times you have selected the correct answer.

## Make sure you:
1) Fork this repository 
2) Have a working local copy of your forked project ready to go **before test day**

## 🍴 Forking the Repository

1. Click the **“Fork”** button in the upper-right corner of this repository’s GitHub page.
2. This creates **your own copy** of the repository under your GitHub account.

Your forked repo will be located at:
https://github.com/\<your-username\>/\<BRNQuiz\>

**Note:** Double-check that you cloned your fork, not the starter repository.
If you fork the starter repository you will be unable to push your changes and unable to submit your test, resulting in a zero.

## 🧠 Need Help?

If you have any issues , reach out to your instructor before test day.


if you want to change the text of the multiple chocie answers and the answers you should:

In QuestionFragment.java
//NEW: Example question and 6 options
private String question = "Which planet is known as the Red Planet?";
private String[] answers = {"Earth", "Venus", "Mars", "Jupiter", "Saturn", "Mercury"};

Just replace the string in question:
private String question = "What is the capital of France?";