# CORS and Event Sourcing Combined 

- Two different concepts
- Powerful combination

## Advantages

- Simple and faster queries
- Scalable 
- Trace of everything that happened in the application
- Audit trail ( the ability to see what happened in the past)
- Busniss language (events are written in a business language)

## Disadvantages

- Added complexity
- Learning curve
- Data inconsistencies
- Event structure changes (the structure of the events might change over time)

## CQRS and/or Event Sourcing

- Not for simple domains
- Start with event sourcing
- Add CQRS later 