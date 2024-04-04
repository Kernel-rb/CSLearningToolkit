# CQRS 

- Command Query Responsibility Segregation 
- Two models : read / query and write command 
- Allows for scenario-specific queries
- Synchronization between the two models is done through events
- Different from event sourcing, as it does not store the state of the application, but rather the events that led to the state

## advantages

- Simpler Queries
- Faster and more scalable
- Easier to maintain

## disadvantages

- Added complexity (two models)
- Learning curve (new concepts)
- Possibility of data inconsistencies (eventual consistency)
- Eventual consistency (data might not be up-to-date)