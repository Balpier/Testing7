def palindromo_o_capicua(dato):
    # Si es un número, convertirlo a string
    if isinstance(dato, int):
        dato = str(dato)
    
    #quitar espacios y convertir a minúsculas
    elif isinstance(dato, str):
        dato = dato.replace(" ", "").lower()
    else:
        return False  # no es número ni texto
    
    # Verificar si es palíndromo
    return dato == dato[::-1]

print(palindromo_o_capicua(121))  # True
print(palindromo_o_capicua("Anita lava la tina"))  # True
print(palindromo_o_capicua("Hola"))  # False
