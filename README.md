# Min Heap Based Priority Queue – Java

## Overview
This project implements a **custom Min Heap data structure** in Java that functions as a
**priority-based queue**. The heap always ensures that the element with the **highest priority
(lowest value)** is available in constant time.

This implementation is designed as a **core backend component** for real-time and
priority-driven systems rather than as a standalone academic exercise.

---

## Why Min Heap?
A Min Heap is ideal when the system must always process the **most critical task first**.

This implementation guarantees:
- **Insertion:** O(log n)
- **Removal (minimum):** O(log n)
- **Peek (minimum):** O(1)

Such guarantees are essential in **real-time systems** where predictable performance
matters more than raw throughput.

---

## Key Features
- Custom heap implementation without using Java’s built-in `PriorityQueue`
- Efficient priority-based insertion and removal
- Deterministic behavior suitable for real-time backends
- Lightweight and memory-efficient design

---

## Core Operations

### add(int data)
Inserts a new element into the heap and restores the heap property using upward heapification.

### peek()
Returns the minimum (highest priority) element without removing it.

### remove()
Removes and returns the minimum element while maintaining the heap structure using heapify.

### heapify(int index)
Restores the Min Heap property after deletion by comparing parent and child nodes.

---

## Real-World Applications

This Min Heap can act as a **core building block** in:

- Priority-based task schedulers
- Satellite command execution systems
- Space weather alert processing pipelines
- Defence radar signal prioritization
- Real-time telemetry and event-handling systems
- Pathfinding and navigation algorithms (Dijkstra, A*)

---

## Backend & System Design Relevance

In backend architectures, especially those dealing with:
- real-time data
- mission-critical workflows
- deterministic execution order

priority queues are preferred over simple lists or queues.

This implementation can be directly integrated into:
- Spring Boot services
- Microservice-based scheduling engines
- Event-driven architectures

---

## Design Philosophy
- Explicit control over data structure behavior
- Avoidance of black-box abstractions
- Focus on correctness, predictability, and performance

This aligns with backend systems used in **space and defence-grade software** where
custom data handling is often preferred over generic utilities.

---

## Possible Enhancements
- Make the heap generic (`Heap<T>`)
- Add thread safety for concurrent environments
- Expose heap operations via REST APIs
- Integrate with a task scheduler microservice

---

## Author
**Apurv Sinha**  
B.Tech – Computer Science with Applied Mathematics  
Backend Development | System Design | Space-Oriented Projects
