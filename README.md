# 🏞️ TrailTrack – Smart Outdoor Trail Tracking Platform

**TrailTrack** is a full-stack geospatial platform that helps outdoor enthusiasts **track, log, and discover hiking trails** with real-time location updates, analytics, and a scalable microservice-friendly architecture. Built with **Java 21**, **Spring Boot 3**, **PostgreSQL (with PostGIS)**, **Apache Pulsar**, and **BDD testing**, this project is a hands-on portfolio builder designed to deepen your backend and DevOps skills.

---

## 🔧 Tech Stack

### 🧠 Core Stack
- **Java 21** – Records, Sealed Classes, Virtual Threads
- **Spring Boot 3.2+** – Web, JPA, Actuator
- **Liquibase** – Database migrations
- **PostgreSQL + PostGIS** – Geospatial data support
- **Apache Pulsar** – Real-time event-driven messaging

### 🧪 Testing & Tooling
- **Testcontainers** – Spin up isolated Postgres + Pulsar for tests
- **Cucumber + Serenity BDD** – Behavioral and feature-based testing
- **Docker + Docker Compose** – Local dev and environment orchestration

### 🌐 (Optional) Frontend
- **React + Mapbox GL JS** or **SvelteKit + Leaflet.js** – for interactive map-based UI

---

## 📖 What the Application Will Do

- 🚶 Track and manage **hiking trails**, including name, location, distance, and difficulty.
- 🗺️ View trails near a user's live GPS coordinates.
- 🧭 Real-time **group tracking** using Pulsar location updates.
- 📊 Use Java Streams to generate stats like most popular trails, most active users, and total distance hiked.
- 📤 Publish events like `TrailCompletedEvent` or `UserLocationUpdateEvent` to Pulsar for consumption by downstream services (e.g., notification or leaderboard service).
- ✅ Automatically tested with real services (Postgres, Pulsar) using Testcontainers + BDD scenarios.

---

## 🗓️ Weekly Plan (4 Weeks, ~4–5 hrs/week)

### 📌 Week 1: Setup & Core Functionality
- [ ] Set up Spring Boot 3 project with Java 21 features
- [ ] Create entities: `Trail`, `User`, `HikeRecord`
- [ ] Configure Dockerized PostgreSQL + PostGIS
- [ ] Add Liquibase for DB migrations
- [ ] Implement CRUD APIs for trails and users
- [ ] Use Java Streams to filter trails (e.g. by difficulty or distance)

📚 **Resources**:
- [Java 21 Overview (Baeldung)](https://www.baeldung.com/java-21-new-features)
- [Liquibase with Spring Boot](https://www.liquibase.org/blog/springboot-liquibase)
- [PostGIS Intro](https://postgis.net/workshops/postgis-intro/)

---

### 📌 Week 2: Messaging with Pulsar + Integration Testing
- [ ] Dockerize Apache Pulsar (or use localstack/mockpulsar for dev)
- [ ] Publish event `TrailCompletedEvent` on hike completion
- [ ] Add Pulsar consumer (e.g. notification logger)
- [ ] Introduce Testcontainers for Postgres + Pulsar
- [ ] Write integration tests for trail creation & Pulsar publishing

📚 **Resources**:
- [Apache Pulsar Docker Quickstart](https://pulsar.apache.org/docs/next/getting-started-docker/)
- [Testcontainers for Spring Boot](https://www.testcontainers.org/modules/databases/postgres/)

---

### 📌 Week 3: Advanced Filtering & Insights
- [ ] Implement advanced filtering via Java Streams (e.g. trails < 10km & EASY)
- [ ] Add trail popularity and usage stats
- [ ] Add BDD test scenarios with Cucumber + Serenity
- [ ] Use DTOs and virtual threads for performance with larger datasets

📚 **Resources**:
- [Cucumber + Serenity Setup](https://serenity-bdd.github.io/docs/)
- [Java Streams Tutorial](https://www.baeldung.com/java-8-streams)

---

### 📌 Week 4: Dockerize & Frontend Kickoff (Optional)
- [ ] Write Dockerfile for Spring Boot app
- [ ] Add `docker-compose.yml` to run Postgres, Pulsar, App
- [ ] Add Swagger/OpenAPI docs for REST API
- [ ] (Optional) Scaffold React or Svelte frontend with Mapbox or Leaflet

📚 **Resources**:
- [Docker Compose for Java Projects](https://www.baeldung.com/docker-compose-for-spring-boot)
- [React + Mapbox Docs](https://docs.mapbox.com/help/tutorials/use-mapbox-gl-js-with-react/)
- [Leaflet Tutorial](https://leafletjs.com/examples/quick-start/)

---

## 🧪 Sample Cucumber Scenario

```gherkin
Feature: Discover nearby trails
  Scenario: User searches for trails within 5km
    Given the user is at coordinates 51.5074, -0.1278
    When they request nearby trails
    Then the system should return all trails within a 5km radius
