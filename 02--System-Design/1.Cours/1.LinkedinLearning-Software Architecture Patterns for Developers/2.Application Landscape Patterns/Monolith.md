# Monolith

- **definition** : A monolith in application landscape patterns refers to a software architecture where an entire application is built and deployed as a single, cohesive unit, without separating its components into independently deployable modules.
- **Example** :A basic website where the frontend, backend, and database are all bundled together and deployed as one entity, requiring updates to be made to the entire application at once.

## Advantages

- Easy to understand , implement and test.
- Easy deployment.
- Ideal for small applications.

## Disadvantages 
- Tight coupling : Changes in one part of the application can have unintended consequences in other parts.
- Easy leads to complexity : As the application grows, it becomes harder to maintain and scale.
- One size fits all : All components of the application must be updated at once, even if only one part requires changes.
