<img src="assets/img/logo-blanca.png" alt="LetItBeat!">
<br>
<h3>/// 1. Descripción del Proyecto</h3>

Toquen el DOM es una aplicación web interactiva para una <b>escuela de música online</b> que permite a los usuarios practicar con <b>instrumentos virtuales</b> (Piano, Marimba y Batería) mediante interacción con teclado y mouse. 
<br>Este proyecto fue desarrollado como parte del <b>Bootcamp P1 de FemCoders.</b> (Proyecto ficticio de uso educacional)
<br><br>

<h3>/// 2. Características Principales:</h3>
<b>De uno a tres instrumentos</b> con <b>sonidos realistas</b><br>
Interacción dual <b>(teclado físico + mouse)</b>

<b>Animaciones</b> visuales al tocar<br>
Diseño <b>responsive</b><br>
Fácil despliegue con <b>Docker</b>
<br><br>

<h3>/// 3. Contexto y Objetivos:</h3>
<b>Aplicar y consolidar</b> nuestros conocimientos en tecnologías como JavaScript, Docker, HTML y CSS, con el objetivo de crear una herramienta innovadora que facilite el aprendizaje de la música en línea, <b>sin importar la ubicación del estudiante.</b><br><br>

➡️ Crear una plataforma interactiva para práctica musical<br>
➡️ Implementar interacción mediante mouse y teclado<br>
➡️ Evaluar diferentes propuestas de desarrollo<br>
➡️ Cumplir con los requerimientos técnicos del bootcamp
<br><br>


<h3>/// 4. Requerimientos Técnicos</h3>

✅ <b>GitFlow</b> para gestión de versiones<br>
✅ De uno à tres instrumentos: <b>Piano, Marimba y Batería</b><br>
✅ Interacción con <b>mouse y teclado</b><br>
✅ <b>Sonidos realistas</b> y sincronizados<br>
✅ <b>Animaciones</b> al tocar<br>
✅ Código <b>limpio y semántico</b> (HTML5, CSS3, JS Vanilla)<br>
✅ <b>Dockerfile</b> para contenedorización<br>

<b>Bonus track </b> 🌟<br>
Diseño responsive<br>
Documentación de uso<br>
Tutoriales interactivos
<br><br>

<h3>/// 5. Vistas Principales:</h3>
<b>Vista de Piano</b> 🎹<br>
2 Octavas <b>completas</b> <br>
Teclas blancas/negras correctamente <b>afinadas</b><br>
Mapeo a <b>teclado</b> QWERTY<br>
<br><br>
<b>Vista de Marimba</b> 🎵<br>
Barras <b>organizadas</b> por tonalidad<br>
Sonidos percusivos <b>realistas</b><br>
Visualización de <b>notas activas</b><br>
<br><br>
<b>Vista de Batería 🥁</b><br>
Componentes <b>interactivos</b><br>
Efectos <b>visuales</b> al tocar<br>
<br>

<h3>/// 6. Herramientas Utilizadas</h3>

HTML5 semántico<br>
CSS3 (Flexbox + Grid)<br>
JavaScript vanilla<br>
Web Audio API<br>
Docker<br>
Nginx<br>
GitFlow<br><br>


<h3>/// 8. Instalación</h3>
<b>Opción 1:</b> Local (sin Docker)<br><br>
Clona tu repositorio en Git con:<br>
<code>git clone https://github.com/tu-usuario/toquen-el-dom.git</code><br>
<br>
Entra en la carpeta del proyecto:<br>
<code>cd toquen-el-dom</code><br><br>
Instala las dependencias necesarias:<br>
<code>npm install</code><br><br>
Inicia la aplicación<br>
<code>npm start</code><br>
<br>
<b>Opción 2: </b>Dockerfile<br>
Si prefieres usar Docker, crea un archivo llamado Dockerfile con este contenido:<br>
<code>FROM nginx:alpine<br>
COPY . /usr/share/nginx/html<br>
EXPOSE 80<br>
CMD ["nginx", "-g", "daemon off;"]</code><br>
<br>Luego, en tu terminal, construye tu image:<br>
<code>docker build -t toquen-el-dom .</code><br><br>
Y ejecuta el contenedor <br>
<code>docker run -p 8080:80 toquen-el-dom</code><br><br>
Después, abre tu navegador en:<br> 
<code>http://localhost:8080</code>




<br>-----------------------<br><br>


📧 <b>Hecho por:</b> <br>
Murry Alexandra Rojas Castro <br>
Bruna H. Sonda Santos <br>
Débora Rubio <br>
Mayleth Carrascal <br><br>

📅 Fecha de entrega: 24/04

🌐 <b>Repositorio:</b> [GitHub](https://github.com/debsrdev/toqueneldom)<br><br>

Gracias! ✨
