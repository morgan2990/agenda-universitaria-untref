Imports System.Web.Services
Imports System.Web.Services.Protocols
Imports System.ComponentModel
Imports ClasesAgendaUniversitaria

<System.Web.Services.WebService(Namespace:="http://tempuri.org/")> _
<System.Web.Services.WebServiceBinding(ConformsTo:=WsiProfiles.BasicProfile1_1)> _
<ToolboxItem(False)> _
Public Class ServicioAgendaUniversitaria
    Inherits System.Web.Services.WebService
    'probandoooo
    'prueba2
    <WebMethod()> _
    Public Function loguear(ByVal pUsuario As String, ByVal pPassword As String) As Usuario
        Dim dt As DataTable
        Dim mSQL As String
        Dim mUsuario As Usuario
        Dim mMateria As Materia

        Try

            mSQL = "SELECT u.nombre nombre_usuario, m.materia, m.nombre nombre_materia FROM usuarios u, materiasxusuario mu, materias m " & _
                    "WHERE u.usuario = mu.usuario AND mu.materia = m.materia " & _
                    "AND u.usuario = '" & pUsuario & "' AND u.contraseña = '" & pPassword & "'"
            dt = ServiciosSQL.seleccionarDatos(mSQL)

            If Not IsNothing(dt) Then

                mUsuario = New Usuario
                mUsuario.Usuario = pUsuario
                mUsuario.Nombre = dt(0)("nombre_usuario").ToString.Trim

                For Each unaFila As DataRow In dt.Rows

                    mMateria = New Materia
                    mMateria.Codigo = unaFila("materia").ToString.Trim
                    mMateria.Nombre = unaFila("nombre_materia").ToString.Trim

                    mUsuario.agregarMateria(mMateria)

                Next

                Return mUsuario

            Else

                Return Nothing

            End If

        Catch ex As Exception

            Return Nothing

        End Try

    End Function

    <WebMethod()> _
 Public Function obtenerDocumentos(ByVal pMateria As String) As List(Of Documento)
        Dim dt As DataTable
        Dim mSQL As String
        Dim mDocumento As Documento
        Dim mMateria As Materia
        Dim mListaDocumentos As List(Of Documento)

        Try

            mSQL = "SELECT d.documento, d.nombre nombre_documento, d.link, m.nombre nombre_materia FROM documentos d, materias m " & _
                    "WHERE d.materia = m.materia AND d.materia = '" & pMateria & "'"
            dt = ServiciosSQL.seleccionarDatos(mSQL)

            If Not IsNothing(dt) Then

                mListaDocumentos = New List(Of Documento)

                For Each unaFila As DataRow In dt.Rows

                    mMateria = New Materia
                    mMateria.Codigo = pMateria
                    mMateria.Nombre = unaFila("nombre_materia").ToString.Trim

                    mDocumento = New Documento
                    mDocumento.Codigo = unaFila("documento").ToString.Trim
                    mDocumento.Nombre = unaFila("nombre_documento").ToString.Trim
                    mDocumento.Link = unaFila("link").ToString.Trim
                    mDocumento.Materia = mMateria

                    mListaDocumentos.Add(mDocumento)

                Next

                Return mListaDocumentos

            Else

                Return Nothing

            End If

        Catch ex As Exception

            Return Nothing

        End Try

    End Function


    <WebMethod()> _
    Public Sub agregarUsuario(ByVal pUsuario As Usuario)
        Dim mSQL As String

        mSQL = "INSERT INTO usuarios (usuario, nombre, contraseña) VALUES " & _
                "('" & pUsuario.Usuario & "','" & pUsuario.Nombre & "','" & pUsuario.Contraseña & "')"
        ServiciosSQL.ejecutarSQL(mSQL)

    End Sub

    <WebMethod()> _
    Public Sub agregarMateria(ByVal pMateria As Materia)
        Dim mSQL As String

        mSQL = "INSERT INTO materias (materia, nombre) VALUES " & _
                "('" & pMateria.Codigo & "','" & pMateria.Nombre & "')"
        ServiciosSQL.ejecutarSQL(mSQL)

    End Sub

    <WebMethod()> _
    Public Sub agregarDocumento(ByVal pDocumento As Documento)
        Dim mSQL As String

        mSQL = "INSERT INTO documentos (documento, nombre, link, materia) VALUES " & _
                "(" & pDocumento.Codigo & ",'" & pDocumento.Nombre & "','" & pDocumento.Link & "','" & pDocumento.Materia.Codigo & "')"
        ServiciosSQL.ejecutarSQL(mSQL)


    End Sub

    <WebMethod()> _
    Public Sub agregarMateriaAUsuario(ByVal pUsuario As String, ByVal pMateria As String)
        Dim mSQL As String

        mSQL = "INSERT INTO materiasxusuario (usuario, materia) VALUES " & _
                "('" & pUsuario & "','" & pMateria & "')"
        ServiciosSQL.ejecutarSQL(mSQL)

    End Sub


End Class