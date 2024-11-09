# MicroKernel

- consists of a core system and a set of pluggable modules that extend the core system
- Task scheduling, memory management, file system, device drivers, and networking are examples of core system components
- Workflows, user interfaces, and data processing are examples of modules
- Data processing module can be further divided into modules for data validation, data transformation, and data storage
- Microkernel architecture is used in operating systems, web servers, and application servers

## Advantages

- Flexibility: New modules can be added without changing the core system
- Clean seperation of concerns: Core system is responsible for system-level tasks, while modules are responsible for application-level tasks
- Separate teams possible: Core system and modules can be developed by separate teams
- Add and remove modules: Modules can be added and removed without affecting the core system

## Disadvantages

- Core API might not fit all modules: Core API might not be suitable for all modules, leading to workarounds
- Can the plugin system be trusted?: Security concerns arise when modules are added from third-party sources
- Not always clear what belongs in the core system: Deciding what belongs in the core system and what belongs in a module can be difficult