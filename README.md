# Lovable Clone – Backend (Ongoing)

A **Lovable-like backend system** built using **Spring Boot**, focused on clean architecture, scalability, and real-world backend design.

This is a **long-term project** under active development to deeply understand backend systems.

---

## 🛠 Tech Stack

- Java, Spring Boot
- Spring Security (JWT)
- Spring Data JPA, Hibernate
- MySQL / H2 (dev)
- Stripe API (Billing)
- SSE (Server-Sent Events)
- Redis (planned – rate limiting & caching)
- Zipkin (planned – tracing)

---

## 🔐 Authentication APIs

| Method | Endpoint |
|------|---------|
| POST | `/api/auth/login` |
| POST | `/api/auth/signup` |
| GET | `/api/auth/me` |

---

## 📁 Projects APIs

| Method | Endpoint |
|------|---------|
| POST | `/api/projects` |
| GET | `/api/projects/{id}` |
| PUT | `/api/projects/{id}` |
| DELETE | `/api/projects/{id}` |
| GET | `/api/projects` |

- One project can have multiple users
- Role-based access control

---

## 🗂 Files APIs

| Method | Endpoint |
|------|---------|
| GET | `/api/projects/{id}/files` |
| GET | `/api/projects/{id}/files/**` |
| GET | `/api/projects/{id}/download-zip` |

- File tree + metadata
- Single file download
- Download all files as ZIP

---

## 👥 Sharing & Permissions

| Method | Endpoint |
|------|---------|
| GET | `/api/projects/{id}/members` |
| POST | `/api/projects/{id}/members` |
| PATCH | `/api/projects/{id}/members/{userId}` |
| DELETE | `/api/projects/{id}/members/{userId}` |

---

## 💬 Chat & AI Generation

| Method | Endpoint |
|------|---------|
| GET | `/api/projects/{id}/chat-sessions` |
| POST | `/api/projects/{id}/chat-sessions` |
| GET | `/api/chat/sessions/{sessionId}/messages` |
| POST (SSE) | `/api/chat/stream` |

---

## ▶️ Preview & Runner

| Method | Endpoint |
|------|---------|
| POST | `/api/projects/{id}/preview` |
| GET | `/api/previews/{previewId}/status` |
| GET (SSE) | `/api/previews/{previewId}/logs` |
| DELETE | `/api/previews/{previewId}` |

Preview lifecycle:

---

## 💳 Subscription & Billing (Stripe)

| Method | Endpoint |
|------|---------|
| GET | `/api/plans` |
| GET | `/api/me/subscription` |
| POST | `/api/stripe/checkout` |
| POST | `/api/stripe/portal` |

Plans: **FREE**, **PRO**

---

## 📊 Usage & Quotas

| Method | Endpoint |
|------|---------|
| GET | `/api/usage/today` |
| GET | `/api/usage/limits` |

Tracked quotas:
- Tokens used
- Projects created
- Previews running

---

## 🚧 Project Status

- Core backend architecture in progress
- Features implemented incrementally
- Focus on correctness, scalability, and clean design

---

## 🎯 Key Concepts Implemented

- Layered Architecture (Controller / Service / Repository)
- DTO–Entity separation
- Global exception handling
- Service-layer business validation
- Role-based authorization
- External API integration (Stripe)
- Streaming APIs using SSE

---

> This project is built for **learning depth and backend expertise**, not as a rushed demo.
