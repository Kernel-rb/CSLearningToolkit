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
iterations = 100 

try:
    
    for _ in range(10) : 
            nouveau_x = position_initial[0] - learning_rate * derivee_y(position_initial[0])
            nouveau_y = y_function(nouveau_x)
            position_initial = (nouveau_x, nouveau_y)
            plt.plot(x, y)
            plt.scatter(position_initial[0], position_initial[1], color='red')
            plt.pause(0.01)
            plt.clf()
        



except Exception as e:
    print(f"Error: {e}")
