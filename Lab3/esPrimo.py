def esPrimo(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0: #agregar una comparativa == 0
            return False
    return True

    