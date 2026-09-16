# Library Management System

A desktop library management application built with Java Swing for a school project. It provides a graphical interface for organizing printed books and eBooks.

## Features

- Add printed books with a page count or eBooks with a file size
- View and remove books from the collection
- Search for books by title or author
- Save the collection when exiting and load it when the application starts
- Export the collection to a CSV file

## Technologies

- Java 17
- Java Swing
- Apache Ant and NetBeans

## Run the project

Open the project folder in NetBeans and run `LibraryManagementSystem.java`. The application opens with a start screen and main menu.

## Data storage

The application loads and saves its book collection using `books.ser`. When saving, it also exports the collection to `books.csv`.
