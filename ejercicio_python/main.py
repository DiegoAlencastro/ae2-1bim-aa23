from modelo import Universidad, Carrera

listaUniversidades = []

def agregarUniversidad():
    print("Agregar universidad")
    nombre = input("Ingrese el nombre: ")
    rector = input("Ingrese el rector: ")
    tipo = input("Ingrese el tipo: ")
    # se crea el objeto
    u = Universidad(nombre, rector, tipo)
    listaUniversidades.append(u)
    

def desplegarUniversidades():
    registro=0
    while registro < len(listaUniversidades):
        print("-------------------------------------------------------")
        print("Nombre: ",listaUniversidades[registro].obtener_nombre())
        print("Rector: ",listaUniversidades[registro].obtener_rector())
        print("Tipo: ",listaUniversidades[registro].obtener_nombre())
        registro+=1
                        
def menuPrincipal():
    opcion = 0
    while opcion!=4:
        print("#################################################")
        print("SISTEMA DE GESTIÓN DE UNIVERSIDADES")
        print("1. Lista de Universidades registradas")
        print("2. Agregar Universidad")
        print("3. Salir")
        opcion = int(input())
        if opcion == 1:
            desplegarUniversidades()
        elif opcion == 2:
            agregarUniversidad()
        elif opcion == 3:
            print("Gracias por usar el sistema")
            exit()
                
if __name__ == "__main__":
	menuPrincipal()
