class Universidad:

    listaCarreras = []

    def __init__(self, nom, rec, tip):
        self.nombre = nom
        self.rector = rec
        self.tipo = tip

    def establecer_nombre(self, n):
        self.nombre = n

    def obtener_nombre(self):
        return self.nombre

    def establecer_rector(self, n):
        self.rector = n

    def obtener_rector(self):
        return self.rector

    def establecer_tipo(self, n):
        self.tipo = n

    def obtener_tipo(self):
        return self.tipo

    def establecer_carreras(self, n):
        self.listaCarreras = n

    def obtener_carreras(self):
        return self.listaCarreras

class Carrera:

    def __init__(self, nombre, duracion, num_estudiantes):
        self.nombre = nombre
        self.duracion = duracion
        self.num_estudiantes = num_estudiantes

    def establecer_nombre(self, n):
        self.nombre = n

    def obtener_nombre(self):
        return self.nombre

    def establecer_duracion(self, n):
        self.duracion = n

    def obtener_duracion(self):
        return self.duracion

    def establecer_num_estudiantes(self, n):
        self.num_estudiantes = n

    def obtener_num_estudiantes(self):
        return self.num_estudiantes
