Public Class Usuario


    Private mUsuario As String
    Public Property Usuario() As String
        Get
            Return mUsuario
        End Get
        Set(ByVal value As String)
            mUsuario = value
        End Set
    End Property


    Private mContraseña As String
    Public Property Contraseña() As String
        Get
            Return mContraseña
        End Get
        Set(ByVal value As String)
            mContraseña = value
        End Set
    End Property


    Private mNombre As String
    Public Property Nombre() As String
        Get
            Return mNombre
        End Get
        Set(ByVal value As String)
            mNombre = value
        End Set
    End Property


    Private mListaMaterias As List(Of Materia)
    Public Property ListaMaterias() As List(Of Materia)
        Get
            Return mListaMaterias
        End Get
        Set(ByVal value As List(Of Materia))
            mListaMaterias = value
        End Set
    End Property

    Public Sub agregarMateria(ByVal pMateria As Materia)
        mListaMaterias.Add(pMateria)
    End Sub

    Public Sub New()
        mListaMaterias = New List(Of Materia)
    End Sub

End Class
