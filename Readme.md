# Tarea: arquitectura MVC

Tarea para implementar arquitectura MVC

Utiliza objetos coches, modifica la velocidad y la muestra

---

## Clases ```Controller``` y ```Model```

- Implementa la clase ```Controller``` y ```Model``` según el diagrama de clases.

- Implementa los métodos ```crearCoche()```, ```getCoche()```, ```cambiarVelocidad()``` y ```getVelocidad()```

- Realiza los test necesarios para comprobar que funcionan correctamente

### Diagrama de clases:

```mermaid
classDiagram
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
    class Controller{
        +main()
    }
    class View {+muestraVelocidad(String, Integer)}
    class Model {
        ArrayList~Coche~: parking
        +crearCoche(String, String, String)
        +getCoche(String)
        +subirVelocidad(String, Integer)
        +bajarVelocidad(String, Integer)
        +cambiarVelocidad(String, Integer)
        +getVelocidad(String)
        +addObserver(Observer)
        +removeObserver(Observer)
        +notifyObservers(Coche, Model)
    }
    class Observer {
        +update(Coche, Model)
    }
    class ObsLimite {
        +update(Coche, Model)
    }
    class ObsVelocidad {
        +update(Coche, Model)
    }
    class Observable {
        +addObserver(Observer)
        +removeObserver(Observer)
        +notifyObservers(Coche, Model)
    }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
    Model "1" *-- "1..n" Observer : association
    Observable "1" *-- "1..n" Observer : association
    ObsLimite --|> Observer
    ObsVelocidad --|> Observer
```

---

### Diagrama de Secuencia

Ejemplo básico del procedimiento, sin utilizar los nombres de los métodos


```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: Puedes crear un coche?
    activate Model
    Model-->>Controller: Creado!
    deactivate Model
    Controller->>+View: Muestra la velocidad, porfa
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo!
    deactivate View
```

El mismo diagrama con los nombres de los métodos

```mermaid
sequenceDiagram
    participant Controller
    participant Model
    participant Coche
    participant View
    participant ObsLimite
    participant ObsVelocidad
    Controller->>Model: crearCoche("Mercedes", "BXK 1234")
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>Model: cambiarVelocidad("BXK 1234", 150)
    activate Model
    Model->>Coche: getCoche("BXK 1234")
    activate Coche
    Coche-->>Model: Coche
    deactivate Coche
    Model->>Coche: setVelocidad(150)
    activate Coche
    Coche-->>Model: void
    deactivate Coche
    Model->>ObsLimite: notifyObservers(Coche, Model)
    activate ObsLimite
    ObsLimite-->>Model: void
    deactivate ObsLimite
    Model->>ObsVelocidad: notifyObservers(Coche, Model)
    activate ObsVelocidad
    ObsVelocidad-->>Model: void
    deactivate ObsVelocidad
    Model-->>Controller: void
    deactivate Model
    Controller->>+View: muestraVelocidad("BXK 1234", 150)
    activate View
    View->>-View: System.out.println()
    View-->>Controller: void
    deactivate View
```