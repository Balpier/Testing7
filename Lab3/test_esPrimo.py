from esPrimo import esPrimo  

def test_es_primo():
    resultado = esPrimo(1)
    assert resultado == False 

def test_no_es_primo():
    resultado = esPrimo(10)
    assert resultado == False  

def test_primo():
    resultado = esPrimo(7)
    assert resultado == True  
