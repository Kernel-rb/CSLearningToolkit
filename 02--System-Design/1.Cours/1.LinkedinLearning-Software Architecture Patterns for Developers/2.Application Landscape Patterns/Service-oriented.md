# Service-Oriented Architecture

- Multiple services
- Each service is  a buisniess activity
- Services composability (can be combined to create new services)
- Contract standardization (services communicate through contracts)
- Enterprise service bus (ESB) (services communicate through a bus)

## Example 
- A banking application where each service is a different banking activity (e.g. deposit, withdrawal, transfer)
- Each service can be combined to create new services (e.g. deposit + transfer = deposit and transfer)
- Each service communicates through a contract (e.g. deposit service contract)
- Each service communicates through an enterprise service bus (e.g. deposit service sends a message to the ESB, which then sends it to the transfer service)

## Advantages
- Scalability
- Services are loosely coupled (changes in one service do not affect other services)
- No duplication of functionality (each service performs a specific task)

## Disadvantages
- Reduced agility and team autonomy (teams must coordinate changes to contracts)
- Costly to implement and maintain (requires an ESB and contract standardization)
- Isn't a clear view of the entire system (services are independent and may not work together as expected)