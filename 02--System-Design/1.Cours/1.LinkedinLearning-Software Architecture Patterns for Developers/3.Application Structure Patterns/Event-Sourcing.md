# Event Sourcing 

- Store events instead of current state  
- Event = something that happened in the past
- Rehydrating the state of the application by replaying the events 

## advantages

- Trace of everything that happened in the application
- Audit trail ( the ability to see what happened in the past)
- Busniss language (events are written in a business language)
- Event replay (replay events to see the state of the application at a certain point in time)

## disadvantages

- Replay and external systems (external systems might not be able to replay the events)
- Event structure changes (the structure of the events might change over time)
- Snapshots