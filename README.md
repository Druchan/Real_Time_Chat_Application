# 💬 Java Real-Time Chat Application (AWT + ServerSocket)

This is a **real-time chat application** built using Java's **AWT (Abstract Window Toolkit)** for the graphical user interface and **ServerSocket/Socket** for client-server communication.

Two users can chat with each other in real time using two separate Java programs running on the same or different machines (over LAN or localhost).

---

## 🖼️ Screenshots

### 🧑‍💻 Client 1 (Dru.java) -> Server
<img src="https://github.com/user-attachments/assets/66817144-05af-4ae8-8e96-15d6b51f58c7" width="500"/>

### 👨‍💻 Client 2 (Ragul.java) -> Client
<img src="https://github.com/user-attachments/assets/6010b983-3de1-487d-a3d7-60c19259fd1c" width="500"/>
---

## 📁 Files Included

- `Dru.java` – Chat Window 1 (Server)
- `Ragul.java` – Chat Window 2 (Client)
- `README.md` – This file

---

## ⚙️ Technologies Used

- Java AWT for GUI
- Java Networking (`ServerSocket`, `Socket`)
- Multi-threading to handle sending and receiving messages

---

## 🚀 How to Run

1. **Compile both files**:

```bash
javac Dru.java
javac Ragul.java
