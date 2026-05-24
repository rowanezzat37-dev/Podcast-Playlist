# 🎧 Podcast Episode Playlist Manager

A console-based Java application designed to manage a podcast playlist. This project demonstrates the practical implementation of **Data Structures**, specifically utilizing a custom **Singly Linked List** to handle dynamic data allocation efficiently without relying on built-in Java collections.

## 🚀 Features

- **Dynamic Memory Management:** Built entirely using custom `Node` and `Playlist` classes.
- **Add Episodes:** Append new episodes to the end of the playlist.
- **Insert at Position:** Insert an episode at a specific position within the playlist.
- **Delete by ID:** Remove a specific episode from the playlist using its unique ID, handling all edge cases (head, middle, tail).
- **Search by Category:** Filter and display episodes based on a specific category (e.g., "AI", "Business", "Data").
- **Play Next:** Traverse the playlist and display the currently playing episode.
- **Time Tracker:** Calculate and display the total listening time of all episodes in the playlist.

## 🛠️ Technologies & Concepts

- **Language:** Java
- **Core Concept:** Object-Oriented Programming (OOP)
- **Data Structure:** Singly Linked List (Pointers, Nodes, Head Management)

## 💻 How It Works

The system uses a `Node` class where each node represents a single podcast episode containing:
- `title` (String)
- `id` (Integer)
- `duration` (Integer - in minutes)
- `category` (String)
- `next` (Pointer to the next episode)

The `Playlist` class manages the `head` and `current` pointers, providing methods to traverse and manipulate the nodes safely.

## 👤 Author

**Rowan Ezzat** Software Engineer & Data Science Student  
- GitHub: [@rowanezzat37-dev](https://github.com/rowanezzat37-dev)
