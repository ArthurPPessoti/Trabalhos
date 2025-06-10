import numpy as np
import matplotlib.pyplot as plt

# Parâmetros físicos
m = 0.5
g = 9.81
l = 0.1
I = 0.002
I3 = 0.001
omega3 = 100.0

# Momentos conjugados
p_psi = I3 * omega3
p_phi = 0.02

def V_eff(theta):
  sin_theta = np.sin(theta)
  cos_theta = np.cos(theta)
  with np.errstate(divide='ignore', invalid='ignore'):
    V = ((p_phi - p_psi * cos_theta)**2) / (2 * I * sin_theta**2) + m * g * l * cos_theta
  V[theta == 0] = np.nan
  V[theta == np.pi] = np.nan
  return V

theta = np.linspace(np.radians(5), np.radians(175), 1000)
V = V_eff(theta)

plt.figure(figsize=(10, 6))
plt.plot(np.degrees(theta), V)
plt.xlabel("Ângulo θ (graus)")
plt.ylabel("Potencial Efetivo (J)")
plt.title("Potencial Efetivo do Giroscópio")
plt.grid(True)
plt.show()
