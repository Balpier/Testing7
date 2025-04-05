def son_anagramas(text1: str, text2: str) -> bool:
    
    #quitar espacio y convertir a minúsculas
    text1 = text1.replace(" ", "").lower()
    text2 = text2.replace(" ", "").lower()

    #comparar palabras ordenadas algfabeticamente
    return sorted(text1) == sorted(text2)

print(son_anagramas("Roma", "Amor")) 
print(son_anagramas("Sergio", "Riesgo"))  
print(son_anagramas("Hola", "Mundo"))  #distintas palabras
print(son_anagramas("roma", "amor"))  #con minuscula 

