from modelo import Universidad, Carrera

listaUniversidades = []

def agregarUniversidad():
    print("Agregar universidad")
    nombre = input("Ingrese el nombre: ")
    rector = input("Ingrese el rector: ")
    tipo = input("Ingrese el tipo: ")
    carrera_nombre = input("Ingrese el nombre de la carrera: ")
    carrera_duracion = input("Ingrese el duracion de la carrera: ")
    carrera_num_estudiantes = input("Ingrese el numero de estudiantes: ")
    # se crea el objeto
    c = Carrera(carrera_nombre, carrera_duracion, carrera_num_estudiantes)
    u = Universidad(nombre, rector, tipo)
    u.obtener_carreras().append(c)
    listaUniversidades.append(u)
    

def desplegarUniversidades():
    registro=0
    while registro < len(listaUniversidades):
        print("-------------------------------------------------------")
        print("Nombre: ",listaUniversidades[registro].obtener_nombre())
        print("Rector: ",listaUniversidades[registro].obtener_rector())
        print("Tipo: ",listaUniversidades[registro].obtener_nombre())
        print("Nombre de carrera: ",listaUniversidades[registro].obtener_carreras()[0].obtener_nombre())
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
