Sure! Here's your complete **single-file `README.md`** with corrected instructions (server = `Dru.java`, client = `Ragul.java`) and your screenshots embedded:

---

````markdown
# 💬 Java Real-Time Chat Application (AWT + ServerSocket)

This is a **real-time chat application** built using Java's **AWT (Abstract Window Toolkit)** for GUI and **ServerSocket/Socket** for client-server communication.

Two users can chat with each other in real time using two separate Java programs: one acts as the **server** and the other as the **client**.

---

## 🖼️ Screenshots

### 🖥️ Server Side (Dru.java)
<img src="https://github.com/user-attachments/assets/6010b983-3de1-487d-a3d7-60c19259fd1c" width="500"/>

### 💻 Client Side (Ragul.java)
<img src="https://github.com/user-attachments/assets/66817144-05af-4ae8-8e96-15d6b51f58c7" width="500"/>

---

## 📁 Files Included

- `Dru.java` – Server side (starts ServerSocket and handles incoming messages)
- `Ragul.java` – Client side (connects to server and sends messages)
- `README.md` – Project documentation

---

## ⚙️ Technologies Used

- Java AWT (GUI)
- Java Networking (`ServerSocket`, `Socket`)
- Multi-threading for simultaneous send/receive

---

## 🚀 How to Run

1. **Compile both files:**

```bash
javac Dru.java
javac Ragul.java
````

2. **Run the server side first:**

```bash
java Dru
```

3. **Then run the client side:**

```bash
java Ragul
```

> ⚠️ Ensure both programs run on the same machine or are connected via the same network (LAN/Wi-Fi).

---

## 🧠 How It Works

* `Dru.java` sets up a server using `ServerSocket` and waits for a client to connect.
* `Ragul.java` connects to the server using `Socket`.
* Messages are exchanged in real time using input and output streams.
* GUI is built using AWT: `TextField`, `TextArea`, etc.

---

## 📂 Project Structure

```
Real_Time_Chat_Application/
├── Dru.java
├── Ragul.java
└── README.md
```

---
