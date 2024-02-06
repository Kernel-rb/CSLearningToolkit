import numpy as np
import matplotlib.pyplot as plt

def y_function(x):
    return x**2

def derivee_y(x):
    return 2*x

x = np.arange(-100, 100, 0.1)

y = y_function(x)

position_initial = (-75, y_function(-75))
learning_rate = 0.01

try:
    plt.ion()  
    fig, ax = plt.subplots()

    while True:
        for _ in range(1000):
            nouveau_x = position_initial[0] - learning_rate * derivee_y(position_initial[0])
            nouveau_y = y_function(nouveau_x)
            position_initial = (nouveau_x, nouveau_y)
            ax.plot(x, y)
            ax.scatter(position_initial[0], position_initial[1], color='red')
            plt.pause(0.01)
            ax.clear()
            print(position_initial)

            
            if abs(derivee_y(nouveau_x)) < 0.001:
                break

       
        break

except Exception as e:
    print(f"Error: {e}")
finally:
    plt.ioff()  
    plt.show()  
    plt.close(fig)  
