# MVC , MVP and MVVM : Differences

|   | MVC | MVP | MVVM |
|---|-----|-----|------|
|User interaction handled by | Controller |View | View |
|Code in UI | Minimal | Yes | Minimal |
|View Aware of Model | Yes | Yes (supervising Controller) , No (passive View) | No |
|Data Binding | Basic | Basic(supervising Controller) , No (passive View) | Advanced |

## MVC , MVP and MVVM : Similarities

- Have the same goal : Decoupling view and model 
- Extra component in between 
- Increased testability 

## MVC , MVP and MVVM : What should i Choose

- `Web` : MVC
- `Basic data binding` : MVP
- `Advanced data binding` : MVVM

**( data binding is the process that establishes a connection between the application UI and business logic)**