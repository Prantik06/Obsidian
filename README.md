# ◈ Obsidian

> A decentralized, end-to-end encrypted peer-to-peer communication experiment built in Java.

Obsidian is an experimental communication network designed to explore how secure messaging systems work beneath the interface.

Instead of starting with a traditional centralized chat server, Obsidian treats each running application as a network node.

### Architecture

```text
Alice
  │
  ▼
Obsidian Node
  │
  ├──── Peer A
  │
  ├──── Peer B
  │
  └──── Peer C
          │
          ▼
         Bob
```

### Current status

* [x] Maven project
* [x] Cryptographic identity
* [x] Message signatures
* [x] TCP peer communication
* [ ] Peer discovery
* [ ] Authenticated handshake
* [ ] Encrypted sessions
* [ ] Message persistence
* [ ] Relay nodes
* [ ] Desktop interface

Obsidian is a learning and research project. Its security properties should not be considered production-grade without independent security review.
