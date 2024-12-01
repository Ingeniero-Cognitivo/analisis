package com.calendario.espartano;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.*;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.net.Socket;
import android.os.Handler;
import java.lang.Runnable;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.util.Formatter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraAccessException;
import java.io.*;
import java.util.concurrent.TimeUnit;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {
	
	public final int REQ_CD_FICHERO = 101;
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double x = 0;
	private double y = 0;
	private String ruta = "";
	private String notas = "";
	private double contador = 0;
	private boolean veropciones = false;
	private String nombrenota = "";
	private String dato = "";
//
	private String str = "";
	private String metodo = "";
	private boolean editando = false;
	private boolean cargar = false;
	private String primeralineacomonombre = "";
	private String notatemporal = "";
	private String hora = "";
	private String minutos = "";
	private String segundos = "";
	private String dia = "";
	private String mes = "";
	private String ano = "";
	private String ultimotexto = "";
	private String find = "";
	private String text = "";
	private String col_find = "";
	private String textobuscar1 = "";
	private String textobuscar = "";
	private double textobuscar2 = 0;
	private String word = "";
	private String palabra = "";
	private double x1 = 0;
	private String textotemporal = "";
	private double posicioncursor = 0;
	private double prueba1 = 0;
	private double contadorbuscar = 0;
	private double position = 0;
	private double caracteres = 0;
	private double ascii = 0;
	private boolean parar = false;
	private double maximo = 0;
	private double valorcaracter = 0;
	private String Path = "";
	private String a = "";
	private String b = "";
	private String textorecibir = "";
	private String action = "";
	private String type = "";
	private String sharedText = "";
	private String share = "";
	private String recibido = "";
	private String shared = "";
	private String action1 = "";
	private String type1 = "";
	private String Tag = "";
	private double elementos = 0;
	private double alto1 = 0;
	private double ancho1 = 0;
	private double anchoeditar = 0;
	private double altoeditar = 0;
	private double contadorabajo = 0;
	private double contadormover = 0;
	private double contadormaximo = 0;
	private HashMap<String, Object> encriptarmapa = new HashMap<>();
	private double contadorarriba = 0;
	private double contadorizquierda = 0;
	private double contadorverticalbarra = 0;
	private double contadorhorizontalbarra = 0;
	private double veces = 0;
	private double contadorcargar = 0;
	private double contadorconfigurarnota = 0;
	private double contador1 = 0;
	private double contadorregistrofiltrotexto = 0;
	private String registro1 = "";
	private double ficherosregistro = 0;
	private HashMap<String, Object> variablebidimensional = new HashMap<>();
	private double limite = 0;
	private double inicio = 0;
	private double fin = 0;
	private double len = 0;
	private double total = 0;
	private double ancho = 0;
	private String edittext = "";
	private String edit = "";
	private double posicionhorizontal = 0;
	private double posicionvertical = 0;
	private double contadordia = 0;
	private double contadormes = 0;
	private double contadorano = 0;
	private double toque = 0;
	private double textodia = 0;
	private String date = "";
	private boolean continuar = false;
	private double contadorsegundos = 0;
	private double contadorminutos = 0;
	private String diadelasemana = "";
	private double numeromes = 0;
	private double diasmes = 0;
	private double diasemana = 0;
	private double operardia = 0;
	private double operarmes = 0;
	private double operarano = 0;
	private double cada = 0;
	private String rutaficheros = "";
	private String datos = "";
	private double vecesseleccionaviso = 0;
	
	private ArrayList<String> ficheros = new ArrayList<>();
	private ArrayList<String> lista = new ArrayList<>();
//
	private ArrayList<String> slist = new ArrayList<>();
	private ArrayList<String> listanotas = new ArrayList<>();
	private ArrayList<String> textocambiado = new ArrayList<>();
	private ArrayList<String> registro = new ArrayList<>();
	private ArrayList<String> listaorden = new ArrayList<>();
	private ArrayList<Double> posicionx = new ArrayList<>();
	private ArrayList<Double> posicionx1 = new ArrayList<>();
	private ArrayList<Double> matrizcursor = new ArrayList<>();
	private ArrayList<String> posicion = new ArrayList<>();
	private ArrayList<String> arr1 = new ArrayList<>();
	private ArrayList<String> listacaracteres = new ArrayList<>();
	private ArrayList<String> lineas = new ArrayList<>();
	private ArrayList<String> listasecciones = new ArrayList<>();
	private ArrayList<String> listainsertar = new ArrayList<>();
	private ArrayList<String> listaedicion = new ArrayList<>();
	private ArrayList<String> listamover = new ArrayList<>();
	private ArrayList<String> arr2 = new ArrayList<>();
	private ArrayList<String> listatipoconfiguracion = new ArrayList<>();
	private ArrayList<String> listabuscar = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> registrobidimensional = new ArrayList<>();
	private ArrayList<String> listatiporegistro = new ArrayList<>();
	private ArrayList<String> listatemporal = new ArrayList<>();
	private ArrayList<String> slist1 = new ArrayList<>();
	private ArrayList<String> listatipocita = new ArrayList<>();
	private ArrayList<String> diasfestivossemana = new ArrayList<>();
	private ArrayList<String> listatiposuceso = new ArrayList<>();
	private ArrayList<String> listahorario = new ArrayList<>();
	private ArrayList<String> horariodesdehora = new ArrayList<>();
	private ArrayList<String> horariohastahora = new ArrayList<>();
	private ArrayList<Double> listadia = new ArrayList<>();
	private ArrayList<Double> listaano = new ArrayList<>();
	private ArrayList<Double> listames = new ArrayList<>();
	private ArrayList<String> informacionfecha = new ArrayList<>();
	private ArrayList<String> fechalibre = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> horario = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> fecha = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> estado = new ArrayList<>();
	private ArrayList<String> listafecha = new ArrayList<>();
	private ArrayList<String> listaestado = new ArrayList<>();
	private ArrayList<Double> listahoradesde = new ArrayList<>();
	private ArrayList<Double> listahorahasta = new ArrayList<>();
	private ArrayList<Double> horadesde = new ArrayList<>();
	private ArrayList<Double> horahasta = new ArrayList<>();
	private ArrayList<String> listahorariodesde = new ArrayList<>();
	private ArrayList<String> listahorariohasta = new ArrayList<>();
	private ArrayList<String> partes = new ArrayList<>();
	private ArrayList<Double> horadesdepersonalizado = new ArrayList<>();
	private ArrayList<Double> horahastapersonalizado = new ArrayList<>();
	private ArrayList<String> nombrehorariopersonalizado = new ArrayList<>();
	private ArrayList<String> listanombrehorario = new ArrayList<>();
	private ArrayList<String> horarioseleccionado = new ArrayList<>();
	private ArrayList<String> comentarios = new ArrayList<>();
	private ArrayList<Double> mesexcepcional = new ArrayList<>();
	private ArrayList<Double> diaexcepcional = new ArrayList<>();
	private ArrayList<Double> anoexcepcional = new ArrayList<>();
	private ArrayList<String> diasseleccionados = new ArrayList<>();
	private ArrayList<Double> diaencontrado = new ArrayList<>();
	private ArrayList<Double> mesencontrado = new ArrayList<>();
	private ArrayList<Double> anoencontrado = new ArrayList<>();
	private ArrayList<Double> listasolodia = new ArrayList<>();
	private ArrayList<Double> listasolomes = new ArrayList<>();
	private ArrayList<Double> listasoloano = new ArrayList<>();
	private ArrayList<String> listacriterios = new ArrayList<>();
	private ArrayList<String> listanombrecriterios = new ArrayList<>();
	private ArrayList<Double> avisodia = new ArrayList<>();
	private ArrayList<Double> avisomes = new ArrayList<>();
	private ArrayList<Double> avisoano = new ArrayList<>();
	private ArrayList<String> fechasencontradas = new ArrayList<>();
	private ArrayList<String> mensaje = new ArrayList<>();
	private ArrayList<String> avisoevento = new ArrayList<>();
	private ArrayList<String> avisomomento = new ArrayList<>();
	private ArrayList<String> avisoforma = new ArrayList<>();
	private ArrayList<String> objetivos = new ArrayList<>();
	private ArrayList<String> avisocomentario = new ArrayList<>();
	private ArrayList<String> descripcionavisofiltrotipo = new ArrayList<>();
	private ArrayList<String> descripcionavisofiltrocomentario = new ArrayList<>();
	private ArrayList<String> avisotipo = new ArrayList<>();
	private ArrayList<String> listaavisoeventos = new ArrayList<>();
	private ArrayList<String> listaavisomomento = new ArrayList<>();
	private ArrayList<String> listaavisoformas = new ArrayList<>();
	private ArrayList<String> listaavisoseventospersonalizados = new ArrayList<>();
	private ArrayList<String> listaavisosmomentospersonalizados = new ArrayList<>();
	private ArrayList<String> listaavisosformaspersonalizadas = new ArrayList<>();
	private ArrayList<String> listaavisosfiltros = new ArrayList<>();
	private ArrayList<String> listaavisosfiltrospersonalizados = new ArrayList<>();
	private ArrayList<String> avisosfiltrotemporal = new ArrayList<>();
	private ArrayList<String> avisoseventostemporal = new ArrayList<>();
	private ArrayList<String> avisosmomentostemporal = new ArrayList<>();
	private ArrayList<String> avisosformastemporal = new ArrayList<>();
	private ArrayList<String> repetidos = new ArrayList<>();
	private ArrayList<String> listalimitelineas = new ArrayList<>();
	private ArrayList<String> listaaudio = new ArrayList<>();
	private ArrayList<String> avisoaudiotemporal = new ArrayList<>();
	private ArrayList<String> listaavisosaudiopersonalizados = new ArrayList<>();
	
	private LinearLayout linear1;
	private ScrollView barraherramientas;
	private TextView separador2;
	private HorizontalScrollView cuadrosecciones;
	private TextView separador3;
	private LinearLayout deslizarherramientas;
	private HorizontalScrollView cuadropantalla;
	private HorizontalScrollView edicion;
	private HorizontalScrollView cuadroficheros;
	private HorizontalScrollView cuadrobuscar;
	private TextView separador;
	private HorizontalScrollView cuadrocargar;
	private TextView separadorbarra;
	private TextView separador1;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private TextView separadoropciones;
	private HorizontalScrollView cuadrocalendario;
	private TextView separadoropciones1;
	private LinearLayout linearmover;
	private Button cerrarherramientapantalla;
	private TextView textopantalla;
	private Spinner parte;
	private Spinner tipoconfiguracion;
	private TextView textodimensiones;
	private LinearLayout dimensiones;
	private Button button30;
	private Button button28;
	private Button abajo;
	private Button arriba;
	private Button botonguardarconfiguracion;
	private Button button20;
	private LinearLayout cuadroedicion;
	private Button button24;
	private TextView textnotas;
	private EditText nombre;
	private Button botonguardar;
	private Button button32;
	private Button button33;
	private Button button39;
	private Button button11;
	private Button button7;
	private Spinner spinerinsertar;
	private Spinner masopcionesedicion;
	private Button button23;
	private LinearLayout linear44;
	private Button button31;
	private TextView textonotas;
	private Button button4;
	private Button button38;
	private Spinner opcionesnotas;
	private LinearLayout linear48;
	private Button button10;
	private TextView separadorbuscar1;
	private LinearLayout opcionbuscarcalendario;
	private TextView separadorbuscar2;
	private LinearLayout seccionbuscartexto;
	private Button registroizquierda;
	private Spinner spinnerbusqueda;
	private Button registroderecha;
	private CheckBox checkbox4;
	private EditText edittext2;
	private Button button9;
	private TextView encontrados;
	private Button button37;
	private EditText textoposicion;
	private EditText edittext1;
	private LinearLayout linear51;
	private Button button34;
	private TextView textocargar;
	private LinearLayout linear59;
	private Button button51;
	private Button botonguardarcalendario;
	private Button button50;
	private Button botonbuscar;
	private Button button52;
	private Button button53;
	private Button borrarevento;
	private Button button63;
	private Button button61;
	private Button button62;
	private Button button49;
	private LinearLayout horizontal;
	private LinearLayout buscarlista;
	private LinearLayout principal1;
	private LinearLayout seccioncalendario;
	private LinearLayout editar;
	private LinearLayout configuracion;
	private LinearLayout linearnotas;
	private LinearLayout cuadroeditar;
	private LinearLayout general;
	private LinearLayout linearregistro;
	private LinearLayout alarma;
	private LinearLayout linear52;
	private TextView separadorbuscar;
	private ListView buscarporlista;
	private Button button35;
	private TextView textview8;
	private Button guardarbuscar;
	private TextView separadornotas1;
	private ListView listview1;
	private TextView separadorcalendario26;
	private TextView separadorcalendario27;
	private LinearLayout linear58;
	private TextView separadorcalendario2;
	private LinearLayout linear55;
	private TextView separadorcalendario3;
	private ScrollView vscroll2;
	private TextView textview10;
	private TextView textview11;
	private CalendarView calendarview1;
	private TextView textview9;
	private TextView textobusqueda;
	private LinearLayout linear56;
	private TextView separadorcalendario32;
	private LinearLayout linear61;
	private Spinner tipocita;
	private TextView separadorcalendario33;
	private LinearLayout linear62;
	private TextView separadorcalendario;
	private LinearLayout cuadrohorario;
	private TextView horariopersonalizado;
	private EditText nombrehorario;
	private Spinner personalizado1;
	private DatePicker datepicker2;
	private Button botonfinseleccion;
	private CheckBox opciones;
	private CheckBox checkcopiar;
	private TextView separadorcalendario25;
	private LinearLayout cuadrodesdehasta;
	private EditText separadorcalendario4;
	private TextView separadorcalendario8;
	private LinearLayout linear57;
	private TextView separadorcalendario9;
	private CheckBox sustituir;
	private TextView separadorcalendario21;
	private LinearLayout cuadroaviso;
	private TextView separadorcalendario34;
	private LinearLayout linear60;
	private TextView separadorcalendario31;
	private LinearLayout cuadrocriteriosaviso;
	private CheckBox eventoproximo;
	private TextView separadorcalendario23;
	private RadioGroup cuadroeventos;
	private TextView separadorcalendario24;
	private TextView textofechasaviso;
	private TextView separadorcalendario22;
	private LinearLayout cuadromomento;
	private TextView formaaviso;
	private LinearLayout cuadroformasaviso;
	private TextView separadorcalendario20;
	private RadioGroup cuadrocriteriosgenerales;
	private TextView separadorcalendario1;
	private LinearLayout linear64;
	private CheckBox checkbox15;
	private CheckBox diasdelmes;
	private TextView separadorcalendario17;
	private LinearLayout cuadrodiasdelasemana;
	private TextView separadorcalendario15;
	private LinearLayout cuadrosolodias;
	private TextView separadorcalendario14;
	private TextView textoexceptodiasdelmes;
	private CheckBox solodiassemana;
	private CheckBox diasemanaexcepcionales;
	private CheckBox exceptodiasdelmes;
	private CheckBox solodatos;
	private TextView separadorcalendario11;
	private LinearLayout cuadrodatos;
	private TextView separadorcalendario12;
	private LinearLayout cuadrodatos3;
	private TextView separadorcalendario16;
	private LinearLayout cuadrocriterios;
	private TextView separadorcalendario19;
	private LinearLayout cuadrodatos1;
	private TextView separadorcalendario13;
	private LinearLayout cuadrodatos2;
	private TextView separadorcalendario5;
	private LinearLayout excepciones;
	private TextView separadorcalendario6;
	private LinearLayout excepciones1;
	private TextView separadorcalendario7;
	private CheckBox domingo;
	private TextView separadorcalendario10;
	private TextView separadorcalendario18;
	private Spinner tiposuceso;
	private Button button56;
	private EditText comentario;
	private Button button57;
	private TextView textohorario;
	private Spinner spunnerdesdehora;
	private TextView textoa;
	private Spinner spinnerhastahora;
	private Button button43;
	private Button button40;
	private Button button41;
	private Spinner spinnerhoradesdepersonalizado;
	private TextView textview15;
	private Spinner spinnerhorahastapersonalizado;
	private CheckBox aviso1;
	private Button guardaraviso;
	private Button button55;
	private CheckBox avisoeventos;
	private TextView separadorcalendario35;
	private LinearLayout cuadroeventosaviso;
	private TextView separadorcalendario28;
	private LinearLayout cuadromomentosaviso;
	private TextView separadorcalendario29;
	private LinearLayout cuadroformaaviso;
	private TextView separadorcalendario30;
	private LinearLayout linear63;
	private TextView separadorcalendario36;
	private TextView separadoravisos;
	private LinearLayout linear68;
	private TextView separadorcalendario37;
	private TextView textview20;
	private Spinner spinneravisoeventos;
	private Button borraravisoevento;
	private TextView textview24;
	private Spinner spinneravisomomento;
	private Button borraravisomomento;
	private TextView textview25;
	private Spinner spinneravisoforma;
	private Button borraravisoforma;
	private TextView textview26;
	private Spinner spinnerfiltrosaviso;
	private Button button58;
	private TextView textview30;
	private Spinner spinneraudioaviso;
	private RadioButton eventosseleccionados;
	private RadioButton todoseventos;
	private CheckBox mostraraplicacion;
	private CheckBox horainicio;
	private CheckBox notificacion;
	private CheckBox checkbox17;
	private CheckBox decir;
	private RadioButton proximoevento;
	private RadioButton seguncriterio;
	private CheckBox filtro;
	private Spinner spinnerfiltroobjetivo;
	private CheckBox diasdelmesexcepcionales;
	private Button button44;
	private CheckBox solodias;
	private Button button45;
	private CheckBox filtrotipocita;
	private CheckBox filtrohoradesde;
	private CheckBox filtrohastahora;
	private CheckBox filtrocomentario;
	private TextView textview19;
	private Spinner criterios;
	private Button button46;
	private Button button47;
	private CheckBox checkbox11;
	private CheckBox checkbox12;
	private CheckBox checkbox13;
	private CheckBox checkbox14;
	private CheckBox lunes;
	private CheckBox martes;
	private CheckBox miercoles;
	private CheckBox jueves;
	private CheckBox viernes;
	private CheckBox sabado;
	private ListView seleccionar;
	private ListView seleccionados;
	private TextView separadorconfiguracion;
	private LinearLayout linear66;
	private TextView separadorconfiguracion1;
	private ScrollView vscroll3;
	private TextView textview17;
	private TextView textview6;
	private TextView textview2;
	private Button button59;
	private LinearLayout linear65;
	private CheckBox cargaautomatica;
	private CheckBox checkbox18;
	private CheckBox checkbox19;
	private CheckBox checkbox20;
	private CheckBox checkbox16;
	private TextView textview16;
	private CheckBox checkbox1;
	private LinearLayout barra;
	private CheckBox checkbox2;
	private LinearLayout linear43;
	private CheckBox checkbox3;
	private LinearLayout linear67;
	private Spinner limitelineas;
	private TextView textview5;
	private LinearLayout linear30;
	private LinearLayout opcionestexto;
	private ScrollView vscroll1;
	private LinearLayout linear24;
	private Button button14;
	private Button button8;
	private CheckBox checkdetalles;
	private LinearLayout lineardetalles;
	private CheckBox insertar;
	private LinearLayout linearinsertar;
	private Button button18;
	private Button button15;
	private Button button12;
	private Spinner version;
	private TextView textodetalles;
	private Button button16;
	private Button button17;
	private Button button19;
	private TextView separador4;
	private LinearLayout linearprogreso;
	private TextView separador5;
	private ScrollView deslizartexto;
	private LinearLayout linear35;
	private TextView textoprogreso;
	private LinearLayout linear37;
	private Button button13;
	private ProgressBar progressbar1;
	private EditText texto;
	private TextView separadorregistro;
	private HorizontalScrollView hscroll1;
	private TextView separadorregistro1;
	private ListView listviewregistro;
	private LinearLayout linear53;
	private Button button36;
	private Spinner tiporegistro;
	private Button botonagregarregistro;
	private Button button60;
	
	private TimerTask temporizador;
	private SharedPreferences transferencias;
	private AlertDialog.Builder aviso;
	private Calendar calendario = Calendar.getInstance();
	private AlertDialog.Builder dialogobuscar;
	private Intent progreso = new Intent();
	private Intent principal = new Intent();
	private Intent intbarra = new Intent();
	private Intent fichero = new Intent(Intent.ACTION_GET_CONTENT);
	private TimerTask temporizadorcargar;
	private AlertDialog.Builder editartexto;
	private AlertDialog.Builder textoeditar;
	private TimerTask temporizadorbuscar;
	private Spannable marcarrojo;
	private TextToSpeech voz;
	private AlertDialog.Builder dialog;
	private Calendar componentecalendario = Calendar.getInstance();
	private TimerTask segundoplano;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear1 = findViewById(R.id.linear1);
		barraherramientas = findViewById(R.id.barraherramientas);
		separador2 = findViewById(R.id.separador2);
		cuadrosecciones = findViewById(R.id.cuadrosecciones);
		separador3 = findViewById(R.id.separador3);
		deslizarherramientas = findViewById(R.id.deslizarherramientas);
		cuadropantalla = findViewById(R.id.cuadropantalla);
		edicion = findViewById(R.id.edicion);
		cuadroficheros = findViewById(R.id.cuadroficheros);
		cuadrobuscar = findViewById(R.id.cuadrobuscar);
		separador = findViewById(R.id.separador);
		cuadrocargar = findViewById(R.id.cuadrocargar);
		separadorbarra = findViewById(R.id.separadorbarra);
		separador1 = findViewById(R.id.separador1);
		linear49 = findViewById(R.id.linear49);
		linear50 = findViewById(R.id.linear50);
		separadoropciones = findViewById(R.id.separadoropciones);
		cuadrocalendario = findViewById(R.id.cuadrocalendario);
		separadoropciones1 = findViewById(R.id.separadoropciones1);
		linearmover = findViewById(R.id.linearmover);
		cerrarherramientapantalla = findViewById(R.id.cerrarherramientapantalla);
		textopantalla = findViewById(R.id.textopantalla);
		parte = findViewById(R.id.parte);
		tipoconfiguracion = findViewById(R.id.tipoconfiguracion);
		textodimensiones = findViewById(R.id.textodimensiones);
		dimensiones = findViewById(R.id.dimensiones);
		button30 = findViewById(R.id.button30);
		button28 = findViewById(R.id.button28);
		abajo = findViewById(R.id.abajo);
		arriba = findViewById(R.id.arriba);
		botonguardarconfiguracion = findViewById(R.id.botonguardarconfiguracion);
		button20 = findViewById(R.id.button20);
		cuadroedicion = findViewById(R.id.cuadroedicion);
		button24 = findViewById(R.id.button24);
		textnotas = findViewById(R.id.textnotas);
		nombre = findViewById(R.id.nombre);
		botonguardar = findViewById(R.id.botonguardar);
		button32 = findViewById(R.id.button32);
		button33 = findViewById(R.id.button33);
		button39 = findViewById(R.id.button39);
		button11 = findViewById(R.id.button11);
		button7 = findViewById(R.id.button7);
		spinerinsertar = findViewById(R.id.spinerinsertar);
		masopcionesedicion = findViewById(R.id.masopcionesedicion);
		button23 = findViewById(R.id.button23);
		linear44 = findViewById(R.id.linear44);
		button31 = findViewById(R.id.button31);
		textonotas = findViewById(R.id.textonotas);
		button4 = findViewById(R.id.button4);
		button38 = findViewById(R.id.button38);
		opcionesnotas = findViewById(R.id.opcionesnotas);
		linear48 = findViewById(R.id.linear48);
		button10 = findViewById(R.id.button10);
		separadorbuscar1 = findViewById(R.id.separadorbuscar1);
		opcionbuscarcalendario = findViewById(R.id.opcionbuscarcalendario);
		separadorbuscar2 = findViewById(R.id.separadorbuscar2);
		seccionbuscartexto = findViewById(R.id.seccionbuscartexto);
		registroizquierda = findViewById(R.id.registroizquierda);
		spinnerbusqueda = findViewById(R.id.spinnerbusqueda);
		registroderecha = findViewById(R.id.registroderecha);
		checkbox4 = findViewById(R.id.checkbox4);
		edittext2 = findViewById(R.id.edittext2);
		button9 = findViewById(R.id.button9);
		encontrados = findViewById(R.id.encontrados);
		button37 = findViewById(R.id.button37);
		textoposicion = findViewById(R.id.textoposicion);
		edittext1 = findViewById(R.id.edittext1);
		linear51 = findViewById(R.id.linear51);
		button34 = findViewById(R.id.button34);
		textocargar = findViewById(R.id.textocargar);
		linear59 = findViewById(R.id.linear59);
		button51 = findViewById(R.id.button51);
		botonguardarcalendario = findViewById(R.id.botonguardarcalendario);
		button50 = findViewById(R.id.button50);
		botonbuscar = findViewById(R.id.botonbuscar);
		button52 = findViewById(R.id.button52);
		button53 = findViewById(R.id.button53);
		borrarevento = findViewById(R.id.borrarevento);
		button63 = findViewById(R.id.button63);
		button61 = findViewById(R.id.button61);
		button62 = findViewById(R.id.button62);
		button49 = findViewById(R.id.button49);
		horizontal = findViewById(R.id.horizontal);
		buscarlista = findViewById(R.id.buscarlista);
		principal1 = findViewById(R.id.principal1);
		seccioncalendario = findViewById(R.id.seccioncalendario);
		editar = findViewById(R.id.editar);
		configuracion = findViewById(R.id.configuracion);
		linearnotas = findViewById(R.id.linearnotas);
		cuadroeditar = findViewById(R.id.cuadroeditar);
		general = findViewById(R.id.general);
		linearregistro = findViewById(R.id.linearregistro);
		alarma = findViewById(R.id.alarma);
		linear52 = findViewById(R.id.linear52);
		separadorbuscar = findViewById(R.id.separadorbuscar);
		buscarporlista = findViewById(R.id.buscarporlista);
		button35 = findViewById(R.id.button35);
		textview8 = findViewById(R.id.textview8);
		guardarbuscar = findViewById(R.id.guardarbuscar);
		separadornotas1 = findViewById(R.id.separadornotas1);
		listview1 = findViewById(R.id.listview1);
		separadorcalendario26 = findViewById(R.id.separadorcalendario26);
		separadorcalendario27 = findViewById(R.id.separadorcalendario27);
		linear58 = findViewById(R.id.linear58);
		separadorcalendario2 = findViewById(R.id.separadorcalendario2);
		linear55 = findViewById(R.id.linear55);
		separadorcalendario3 = findViewById(R.id.separadorcalendario3);
		vscroll2 = findViewById(R.id.vscroll2);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		calendarview1 = findViewById(R.id.calendarview1);
		textview9 = findViewById(R.id.textview9);
		textobusqueda = findViewById(R.id.textobusqueda);
		linear56 = findViewById(R.id.linear56);
		separadorcalendario32 = findViewById(R.id.separadorcalendario32);
		linear61 = findViewById(R.id.linear61);
		tipocita = findViewById(R.id.tipocita);
		separadorcalendario33 = findViewById(R.id.separadorcalendario33);
		linear62 = findViewById(R.id.linear62);
		separadorcalendario = findViewById(R.id.separadorcalendario);
		cuadrohorario = findViewById(R.id.cuadrohorario);
		horariopersonalizado = findViewById(R.id.horariopersonalizado);
		nombrehorario = findViewById(R.id.nombrehorario);
		personalizado1 = findViewById(R.id.personalizado1);
		datepicker2 = findViewById(R.id.datepicker2);
		botonfinseleccion = findViewById(R.id.botonfinseleccion);
		opciones = findViewById(R.id.opciones);
		checkcopiar = findViewById(R.id.checkcopiar);
		separadorcalendario25 = findViewById(R.id.separadorcalendario25);
		cuadrodesdehasta = findViewById(R.id.cuadrodesdehasta);
		separadorcalendario4 = findViewById(R.id.separadorcalendario4);
		separadorcalendario8 = findViewById(R.id.separadorcalendario8);
		linear57 = findViewById(R.id.linear57);
		separadorcalendario9 = findViewById(R.id.separadorcalendario9);
		sustituir = findViewById(R.id.sustituir);
		separadorcalendario21 = findViewById(R.id.separadorcalendario21);
		cuadroaviso = findViewById(R.id.cuadroaviso);
		separadorcalendario34 = findViewById(R.id.separadorcalendario34);
		linear60 = findViewById(R.id.linear60);
		separadorcalendario31 = findViewById(R.id.separadorcalendario31);
		cuadrocriteriosaviso = findViewById(R.id.cuadrocriteriosaviso);
		eventoproximo = findViewById(R.id.eventoproximo);
		separadorcalendario23 = findViewById(R.id.separadorcalendario23);
		cuadroeventos = findViewById(R.id.cuadroeventos);
		separadorcalendario24 = findViewById(R.id.separadorcalendario24);
		textofechasaviso = findViewById(R.id.textofechasaviso);
		separadorcalendario22 = findViewById(R.id.separadorcalendario22);
		cuadromomento = findViewById(R.id.cuadromomento);
		formaaviso = findViewById(R.id.formaaviso);
		cuadroformasaviso = findViewById(R.id.cuadroformasaviso);
		separadorcalendario20 = findViewById(R.id.separadorcalendario20);
		cuadrocriteriosgenerales = findViewById(R.id.cuadrocriteriosgenerales);
		separadorcalendario1 = findViewById(R.id.separadorcalendario1);
		linear64 = findViewById(R.id.linear64);
		checkbox15 = findViewById(R.id.checkbox15);
		diasdelmes = findViewById(R.id.diasdelmes);
		separadorcalendario17 = findViewById(R.id.separadorcalendario17);
		cuadrodiasdelasemana = findViewById(R.id.cuadrodiasdelasemana);
		separadorcalendario15 = findViewById(R.id.separadorcalendario15);
		cuadrosolodias = findViewById(R.id.cuadrosolodias);
		separadorcalendario14 = findViewById(R.id.separadorcalendario14);
		textoexceptodiasdelmes = findViewById(R.id.textoexceptodiasdelmes);
		solodiassemana = findViewById(R.id.solodiassemana);
		diasemanaexcepcionales = findViewById(R.id.diasemanaexcepcionales);
		exceptodiasdelmes = findViewById(R.id.exceptodiasdelmes);
		solodatos = findViewById(R.id.solodatos);
		separadorcalendario11 = findViewById(R.id.separadorcalendario11);
		cuadrodatos = findViewById(R.id.cuadrodatos);
		separadorcalendario12 = findViewById(R.id.separadorcalendario12);
		cuadrodatos3 = findViewById(R.id.cuadrodatos3);
		separadorcalendario16 = findViewById(R.id.separadorcalendario16);
		cuadrocriterios = findViewById(R.id.cuadrocriterios);
		separadorcalendario19 = findViewById(R.id.separadorcalendario19);
		cuadrodatos1 = findViewById(R.id.cuadrodatos1);
		separadorcalendario13 = findViewById(R.id.separadorcalendario13);
		cuadrodatos2 = findViewById(R.id.cuadrodatos2);
		separadorcalendario5 = findViewById(R.id.separadorcalendario5);
		excepciones = findViewById(R.id.excepciones);
		separadorcalendario6 = findViewById(R.id.separadorcalendario6);
		excepciones1 = findViewById(R.id.excepciones1);
		separadorcalendario7 = findViewById(R.id.separadorcalendario7);
		domingo = findViewById(R.id.domingo);
		separadorcalendario10 = findViewById(R.id.separadorcalendario10);
		separadorcalendario18 = findViewById(R.id.separadorcalendario18);
		tiposuceso = findViewById(R.id.tiposuceso);
		button56 = findViewById(R.id.button56);
		comentario = findViewById(R.id.comentario);
		button57 = findViewById(R.id.button57);
		textohorario = findViewById(R.id.textohorario);
		spunnerdesdehora = findViewById(R.id.spunnerdesdehora);
		textoa = findViewById(R.id.textoa);
		spinnerhastahora = findViewById(R.id.spinnerhastahora);
		button43 = findViewById(R.id.button43);
		button40 = findViewById(R.id.button40);
		button41 = findViewById(R.id.button41);
		spinnerhoradesdepersonalizado = findViewById(R.id.spinnerhoradesdepersonalizado);
		textview15 = findViewById(R.id.textview15);
		spinnerhorahastapersonalizado = findViewById(R.id.spinnerhorahastapersonalizado);
		aviso1 = findViewById(R.id.aviso1);
		guardaraviso = findViewById(R.id.guardaraviso);
		button55 = findViewById(R.id.button55);
		avisoeventos = findViewById(R.id.avisoeventos);
		separadorcalendario35 = findViewById(R.id.separadorcalendario35);
		cuadroeventosaviso = findViewById(R.id.cuadroeventosaviso);
		separadorcalendario28 = findViewById(R.id.separadorcalendario28);
		cuadromomentosaviso = findViewById(R.id.cuadromomentosaviso);
		separadorcalendario29 = findViewById(R.id.separadorcalendario29);
		cuadroformaaviso = findViewById(R.id.cuadroformaaviso);
		separadorcalendario30 = findViewById(R.id.separadorcalendario30);
		linear63 = findViewById(R.id.linear63);
		separadorcalendario36 = findViewById(R.id.separadorcalendario36);
		separadoravisos = findViewById(R.id.separadoravisos);
		linear68 = findViewById(R.id.linear68);
		separadorcalendario37 = findViewById(R.id.separadorcalendario37);
		textview20 = findViewById(R.id.textview20);
		spinneravisoeventos = findViewById(R.id.spinneravisoeventos);
		borraravisoevento = findViewById(R.id.borraravisoevento);
		textview24 = findViewById(R.id.textview24);
		spinneravisomomento = findViewById(R.id.spinneravisomomento);
		borraravisomomento = findViewById(R.id.borraravisomomento);
		textview25 = findViewById(R.id.textview25);
		spinneravisoforma = findViewById(R.id.spinneravisoforma);
		borraravisoforma = findViewById(R.id.borraravisoforma);
		textview26 = findViewById(R.id.textview26);
		spinnerfiltrosaviso = findViewById(R.id.spinnerfiltrosaviso);
		button58 = findViewById(R.id.button58);
		textview30 = findViewById(R.id.textview30);
		spinneraudioaviso = findViewById(R.id.spinneraudioaviso);
		eventosseleccionados = findViewById(R.id.eventosseleccionados);
		todoseventos = findViewById(R.id.todoseventos);
		mostraraplicacion = findViewById(R.id.mostraraplicacion);
		horainicio = findViewById(R.id.horainicio);
		notificacion = findViewById(R.id.notificacion);
		checkbox17 = findViewById(R.id.checkbox17);
		decir = findViewById(R.id.decir);
		proximoevento = findViewById(R.id.proximoevento);
		seguncriterio = findViewById(R.id.seguncriterio);
		filtro = findViewById(R.id.filtro);
		spinnerfiltroobjetivo = findViewById(R.id.spinnerfiltroobjetivo);
		diasdelmesexcepcionales = findViewById(R.id.diasdelmesexcepcionales);
		button44 = findViewById(R.id.button44);
		solodias = findViewById(R.id.solodias);
		button45 = findViewById(R.id.button45);
		filtrotipocita = findViewById(R.id.filtrotipocita);
		filtrohoradesde = findViewById(R.id.filtrohoradesde);
		filtrohastahora = findViewById(R.id.filtrohastahora);
		filtrocomentario = findViewById(R.id.filtrocomentario);
		textview19 = findViewById(R.id.textview19);
		criterios = findViewById(R.id.criterios);
		button46 = findViewById(R.id.button46);
		button47 = findViewById(R.id.button47);
		checkbox11 = findViewById(R.id.checkbox11);
		checkbox12 = findViewById(R.id.checkbox12);
		checkbox13 = findViewById(R.id.checkbox13);
		checkbox14 = findViewById(R.id.checkbox14);
		lunes = findViewById(R.id.lunes);
		martes = findViewById(R.id.martes);
		miercoles = findViewById(R.id.miercoles);
		jueves = findViewById(R.id.jueves);
		viernes = findViewById(R.id.viernes);
		sabado = findViewById(R.id.sabado);
		seleccionar = findViewById(R.id.seleccionar);
		seleccionados = findViewById(R.id.seleccionados);
		separadorconfiguracion = findViewById(R.id.separadorconfiguracion);
		linear66 = findViewById(R.id.linear66);
		separadorconfiguracion1 = findViewById(R.id.separadorconfiguracion1);
		vscroll3 = findViewById(R.id.vscroll3);
		textview17 = findViewById(R.id.textview17);
		textview6 = findViewById(R.id.textview6);
		textview2 = findViewById(R.id.textview2);
		button59 = findViewById(R.id.button59);
		linear65 = findViewById(R.id.linear65);
		cargaautomatica = findViewById(R.id.cargaautomatica);
		checkbox18 = findViewById(R.id.checkbox18);
		checkbox19 = findViewById(R.id.checkbox19);
		checkbox20 = findViewById(R.id.checkbox20);
		checkbox16 = findViewById(R.id.checkbox16);
		textview16 = findViewById(R.id.textview16);
		checkbox1 = findViewById(R.id.checkbox1);
		barra = findViewById(R.id.barra);
		checkbox2 = findViewById(R.id.checkbox2);
		linear43 = findViewById(R.id.linear43);
		checkbox3 = findViewById(R.id.checkbox3);
		linear67 = findViewById(R.id.linear67);
		limitelineas = findViewById(R.id.limitelineas);
		textview5 = findViewById(R.id.textview5);
		linear30 = findViewById(R.id.linear30);
		opcionestexto = findViewById(R.id.opcionestexto);
		vscroll1 = findViewById(R.id.vscroll1);
		linear24 = findViewById(R.id.linear24);
		button14 = findViewById(R.id.button14);
		button8 = findViewById(R.id.button8);
		checkdetalles = findViewById(R.id.checkdetalles);
		lineardetalles = findViewById(R.id.lineardetalles);
		insertar = findViewById(R.id.insertar);
		linearinsertar = findViewById(R.id.linearinsertar);
		button18 = findViewById(R.id.button18);
		button15 = findViewById(R.id.button15);
		button12 = findViewById(R.id.button12);
		version = findViewById(R.id.version);
		textodetalles = findViewById(R.id.textodetalles);
		button16 = findViewById(R.id.button16);
		button17 = findViewById(R.id.button17);
		button19 = findViewById(R.id.button19);
		separador4 = findViewById(R.id.separador4);
		linearprogreso = findViewById(R.id.linearprogreso);
		separador5 = findViewById(R.id.separador5);
		deslizartexto = findViewById(R.id.deslizartexto);
		linear35 = findViewById(R.id.linear35);
		textoprogreso = findViewById(R.id.textoprogreso);
		linear37 = findViewById(R.id.linear37);
		button13 = findViewById(R.id.button13);
		progressbar1 = findViewById(R.id.progressbar1);
		texto = findViewById(R.id.texto);
		separadorregistro = findViewById(R.id.separadorregistro);
		hscroll1 = findViewById(R.id.hscroll1);
		separadorregistro1 = findViewById(R.id.separadorregistro1);
		listviewregistro = findViewById(R.id.listviewregistro);
		linear53 = findViewById(R.id.linear53);
		button36 = findViewById(R.id.button36);
		tiporegistro = findViewById(R.id.tiporegistro);
		botonagregarregistro = findViewById(R.id.botonagregarregistro);
		button60 = findViewById(R.id.button60);
		transferencias = getSharedPreferences("datos", Activity.MODE_PRIVATE);
		aviso = new AlertDialog.Builder(this);
		dialogobuscar = new AlertDialog.Builder(this);
		fichero.setType("*/*");
		fichero.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		editartexto = new AlertDialog.Builder(this);
		textoeditar = new AlertDialog.Builder(this);
		voz = new TextToSpeech(getApplicationContext(), null);
		dialog = new AlertDialog.Builder(this);
		
		separador3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "7");
			}
		});
		
		cerrarherramientapantalla.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cuadropantalla.setVisibility(View.GONE);
				_controlopciones();
			}
		});
		
		parte.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (listasecciones.get((int)(_position)).equals("Parte")) {
					cuadroeditar.setBackgroundColor(0xFFFFFFFF);
				}
				else {
					tipoconfiguracion.setVisibility(View.VISIBLE);
					transferencias.edit().putString("Parte", listasecciones.get((int)(_position))).commit();
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("2")) {
						if (transferencias.getString("Sección", "").equals("Editar")) {
							
						}
						else {
							_ocultarsecciones();
							barraherramientas.setVisibility(View.VISIBLE);
							cuadroeditar.setVisibility(View.VISIBLE);
						}
						if (transferencias.getString("Parte", "").equals("Cuadro de edición")) {
							cuadroeditar.setBackgroundColor(0xFFFF5722);
						}
						else {
							
						}
					}
					else {
						
					}
					if (transferencias.getString("Parte", "").equals("Lista de notas")) {
						listview1.setBackgroundColor(0xFFFF5722);
					}
					else {
						
					}
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		tipoconfiguracion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (listatipoconfiguracion.get((int)(_position)).equals("Dimensiones")) {
					
				}
				else {
					transferencias.edit().putString("Tipo configuración", listatipoconfiguracion.get((int)(_position))).commit();
					textodimensiones.setVisibility(View.VISIBLE);
					if (transferencias.getString("Parte", "").equals("Lista de notas")) {
						
					}
					else {
						
					}
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		button30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Mover", "Mover herramientas izquierda").commit();
			}
		});
		
		button28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Mover", "Mover herramientas derecha").commit();
			}
		});
		
		abajo.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				transferencias.edit().putString("Dirección", "Abajo").commit();
				if (contadormover < contadormaximo) {
					contadormover = contadormover * 2;
				}
				else {
					
				}
				if (transferencias.getString("Configuración cambiada", "").equals("No")) {
					botonguardarconfiguracion.setVisibility(View.VISIBLE);
					transferencias.edit().putString("Configuración cambiada", "Si").commit();
				}
				else {
					
				}
				_moverposicion();
				return true;
			}
		});
		
		abajo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				contadormover = 10;
				transferencias.edit().putString("Dirección", "Abajo").commit();
				_moverposicion();
				if (transferencias.getString("Configuración cambiada", "").equals("No")) {
					botonguardarconfiguracion.setVisibility(View.VISIBLE);
					transferencias.edit().putString("Configuración cambiada", "Si").commit();
				}
				else {
					
				}
			}
		});
		
		arriba.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				arriba.setOnLongClickListener(new View.OnLongClickListener() {
					@Override
					public boolean onLongClick(View _view) {
						transferencias.edit().putString("Dirección", "Arriba").commit();
						if (contadormover < contadormaximo) {
							contadormover = contadormover * 2;
						}
						else {
							
						}
						_moverposicion();
						if (transferencias.getString("Configuración cambiada", "").equals("No")) {
							botonguardarconfiguracion.setVisibility(View.VISIBLE);
							transferencias.edit().putString("Configuración cambiada", "Si").commit();
						}
						else {
							
						}
						return true;
					}
				});
				return true;
			}
		});
		
		arriba.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				contadormover = 10;
				transferencias.edit().putString("Dirección", "Arriba").commit();
				_moverposicion();
				if (transferencias.getString("Configuración cambiada", "").equals("No")) {
					botonguardarconfiguracion.setVisibility(View.VISIBLE);
					transferencias.edit().putString("Configuración cambiada", "Si").commit();
				}
				else {
					
				}
			}
		});
		
		botonguardarconfiguracion.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_guardarconfiguracionpantalla();
			}
		});
		
		button20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button20.setVisibility(View.GONE);
				listview1.setBackgroundColor(Color.TRANSPARENT);
			}
		});
		
		button24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ocultaropciones();
				if (transferencias.getString("Sección", "").equals("Calendario")) {
					transferencias.edit().putString("Mostrar opción", "Calendario").commit();
					_mostraropcion();
				}
				else {
					
				}
			}
		});
		
		nombre.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.equals("")) {
					
				}
				else {
					if (_charSeq.equals("(No)")) {
						aviso.setTitle("Nombre");
						aviso.setMessage("Nombre no válido");
						aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						aviso.create().show();
					}
					else {
						transferencias.edit().putString("Último nombre", _charSeq).commit();
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Método", "").equals("2")) {
							if (transferencias.getString("Último nombre", "").equals(_charSeq)) {
								transferencias.edit().putString("Nombre cambiado", "No").commit();
							}
							else {
								transferencias.edit().putString("Nombre cambiado", "Si").commit();
								transferencias.edit().putString("Nombre nota", _charSeq).commit();
							}
							if (transferencias.getString("Nombre nota", "").equals("")) {
								transferencias.edit().putString("Nombre cambiado", "No").commit();
								if (transferencias.getString("Cambiado", "").equals("No")) {
									
								}
								else {
									
								}
							}
							else {
								transferencias.edit().putString("Último nombre", _charSeq).commit();
								transferencias.edit().putString("Nombre cambiado", "Si").commit();
							}
						}
						else {
							
						}
					}
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		botonguardar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				//inicio registro 
				_fechayhora();
				transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Inicio botón guardar archivo. ".concat(""))))).commit();
				if (registro.size() > 0) {
					registro.set((int)0, transferencias.getString("Registro", ""));
				}
				else {
					registro.add(transferencias.getString("Registro", ""));
				}
				transferencias.edit().putString("Registro", "").commit();
				if (transferencias.getString("Guardar registro automáticamente", "").equals("Si") || transferencias.getString("Registrar en archivo", "").equals("Si")) {
					if (transferencias.getString("Guardando registro", "").equals("No")) {
						transferencias.edit().putString("Guardando registro", "Si").commit();
						transferencias.edit().putString("Datos", "").commit();
						transferencias.edit().putString("Contador registro", "0").commit();
						if (registro.size() > 0) {
							for(int _repeat2429 = 0; _repeat2429 < (int)(registro.size()); _repeat2429++) {
								if (Double.parseDouble(transferencias.getString("Contador registro", "")) < registro.size()) {
									transferencias.edit().putString("Datos", transferencias.getString("Datos", "").concat(registro.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))).concat("\n"))).commit();
									transferencias.edit().putString("Contador registro", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador registro", "")) + 1))).commit();
								}
								else {
									
								}
							}
						}
						else {
							transferencias.edit().putString("Datos", transferencias.getString("Datos", "").concat(registro.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))).concat("\n"))).commit();
						}
						FileUtil.writeFile(transferencias.getString("Ruta registros", "").concat("/registro general.txt"), transferencias.getString("Datos", ""));
					}
					else {
						
					}
					listviewregistro.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, registro));
					((BaseAdapter)listviewregistro.getAdapter()).notifyDataSetChanged();
					transferencias.edit().putString("Guardando registro", "No").commit();
				}
				else {
					
				}
				//fin de registro 
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("1")) {
					transferencias.edit().putString("Continuar", "Si").commit();
					if (transferencias.getString("Aviso guardado", "").equals("No")) {
						aviso.setTitle("Atención ");
						aviso.setMessage("Los cambios en los críticos de aviso no se han guardado. Si continúa, se perderán los criterios. ¿Continuar?. ".concat("".concat("".concat(""))));
						aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								transferencias.edit().putString("Continuar", "Si").commit();
							}
						});
						aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								transferencias.edit().putString("Continuar", "No").commit();
							}
						});
						aviso.create().show();
					}
					else {
						
					}
					if (transferencias.getString("Continuar", "").equals("Si")) {
						transferencias.edit().putString("Cambiado1", "No").commit();
						transferencias.edit().putString("Dato", "No existen datos\n (Fin)").commit();
						//guardar datos
						if (listadia.size() > 0) {
							transferencias.edit().putString("Mostrar opción", "Cargar").commit();
							_mostraropcion();
							contador = 0;
							transferencias.edit().putString("Dato", "(Calendario)\n").commit();
							if (listanombrehorario.size() > 0) {
								transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Horario personalizado)".concat("\n"))).commit();
								transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(String.valueOf((long)(listanombrehorario.size())).concat("\n"))).commit();
								contador1 = 0;
								for(int _repeat1877 = 0; _repeat1877 < (int)(listanombrehorario.size()); _repeat1877++) {
									if (contador1 < listanombrehorario.size()) {
										transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listanombrehorario.get((int)(contador1)).concat("\n"))).commit();
										transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(nombrehorariopersonalizado.get((int)(contador1)).concat("\n"))).commit();
										transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(String.valueOf((long)(horadesdepersonalizado.get((int)(contador1)).doubleValue())).concat("\n"))).commit();
										transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(String.valueOf((long)(horahastapersonalizado.get((int)(contador1)).doubleValue())).concat("\n"))).commit();
									}
									else {
										
									}
									contador1++;
									try {
										                        Thread.sleep(1); // Espera 1 segundo antes de continuar
										                    } catch (InterruptedException e) {
										                        e.printStackTrace();
										                    }
								}
							}
							else {
								
							}
							for(int _repeat1911 = 0; _repeat1911 < (int)(listadia.size()); _repeat1911++) {
								//poner cada lectura de matriz en una condición para evitar errores por falta de datos
								if (contador < listadia.size()) {
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Día)".concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(String.valueOf((long)(listadia.get((int)(contador)).doubleValue())).concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Mes)".concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Año)".concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Estado)".concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaestado.get((int)(contador)).concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Comentario)".concat("\n"))).commit();
									if (contador < comentarios.size()) {
										transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(comentarios.get((int)(contador)).concat("\n"))).commit();
									}
									else {
										transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(No)".concat("\n"))).commit();
									}
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Hora desde)".concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(String.valueOf((long)(horadesde.get((int)(contador)).doubleValue())).concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Hora hasta)".concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(String.valueOf((long)(horahasta.get((int)(contador)).doubleValue())).concat("\n"))).commit();
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Horario seleccionado)".concat("\n"))).commit();
									if (contador < horarioseleccionado.size()) {
										transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(horarioseleccionado.get((int)(contador)).concat("\n"))).commit();
									}
									else {
										transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(No)".concat("\n"))).commit();
									}
									transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Fin registro)".concat("\n"))).commit();
									textocargar.setText("Guardando. ".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(listadia.size())).concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat("")))))))))))));
									try {
										                        Thread.sleep(1); // Espera 1 segundo antes de continuar
										                    } catch (InterruptedException e) {
										                        e.printStackTrace();
										                    }
								}
								else {
									
								}
								contador++;
							}
							//guardar criterios de aviso
							//cuando mostrar aviso
							//forma de aviso 
							//criterio evento
							//tipo criterio
							if (listacriterios.size() > 0) {
								transferencias.edit().putString("Datos criterios", "").commit();
								contador1 = 0;
								for(int _repeat2048 = 0; _repeat2048 < (int)(listacriterios.size()); _repeat2048++) {
									if (contador1 < listacriterios.size()) {
										transferencias.edit().putString("Datos criterios", transferencias.getString("Datos criterios", "").concat(listacriterios.get((int)(contador1)).concat("\n".concat(listanombrecriterios.get((int)(contador1)).concat("\n"))))).commit();
									}
									else {
										
									}
									contador1++;
								}
								try {
									                        Thread.sleep(1); // Espera 1 segundo antes de continuar
									                    } catch (InterruptedException e) {
									                        e.printStackTrace();
									                    }
							}
							else {
								transferencias.edit().putString("Datos criterios", "0\n").commit();
							}
							if (avisodia.size() > 0) {
								transferencias.edit().putString("Datos fechas", "").commit();
								contador1 = 0;
								for(int _repeat2072 = 0; _repeat2072 < (int)(avisodia.size()); _repeat2072++) {
									if (contador1 < avisodia.size()) {
										transferencias.edit().putString("Datos fechas", transferencias.getString("Datos fechas", "").concat(String.valueOf((long)(avisodia.get((int)(contador1)).doubleValue())).concat("\n".concat(String.valueOf((long)(avisomes.get((int)(contador1)).doubleValue())).concat("\n".concat(String.valueOf((long)(avisoano.get((int)(contador1)).doubleValue())).concat("\n"))))))).commit();
									}
									else {
										
									}
									contador1++;
									try {
										                        Thread.sleep(1); // Espera 1 segundo antes de continuar
										                    } catch (InterruptedException e) {
										                        e.printStackTrace();
										                    }
								}
							}
							else {
								transferencias.edit().putString("Datos fechas", "0\n").commit();
							}
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Aviso)\n".concat(transferencias.getString("Aviso", "").concat("\n")))).commit();
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Cuando mostrar aviso)\n".concat(transferencias.getString("Cuando mostrar aviso", "").concat("\n")))).commit();
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Notificación)\n".concat(transferencias.getString("Notificación", "").concat("\n(Ventana)\n".concat(transferencias.getString("Ventana", "").concat("\n(Decir)\n".concat(transferencias.getString("Decir", "").concat("\n")))))))).commit();
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Criterio evento)\n".concat(transferencias.getString("Criterio evento", "").concat("\n(Datos)\n".concat(String.valueOf((long)(avisodia.size())).concat("\n".concat(transferencias.getString("Datos fechas", "")))))))).commit();
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Evento próximo)\n".concat(transferencias.getString("Evento próximo", "").concat("\n")))).commit();
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Tipo criterio)\n".concat(transferencias.getString("Tipo criterio", "").concat("\n(Datos)\n".concat(String.valueOf((long)(listacriterios.size())).concat(transferencias.getString("Datos criterios", ""))))))).commit();
							textocargar.setText("Fin. ".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(listadia.size())).concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat("")))))))))))));
							//fin 
							//avisos nuevo. 18/7/24
							transferencias.edit().putString("Método", "1").commit();
							if (transferencias.getString("Método", "").equals("2")) {
								//habilitar si no se usa el código proporcionado por el asistente 
								transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Avisos1)\n".concat("(Eventos)\n".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat("\n"))))).commit();
							}
							else {
								
							}
							transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Número de eventos: ".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat("")))))).commit();
							_actualizarregistroreciente();
							if (listaavisoseventospersonalizados.size() > 0) {
								if (listaavisosmomentospersonalizados.size() > 0) {
									if (listaavisosformaspersonalizadas.size() > 0) {
										if (listaavisosfiltrospersonalizados.size() > 0) {
											if (listaavisosaudiopersonalizados.size() > 0) {
												//no es necesario leer el número de eventos
												//prueba para guardar avisos mediante asistente 11/11/24
												
												// Inicializa el StringBuilder para construir los datos
												StringBuilder datos = new StringBuilder();
												
												// Mantén los datos preexistentes sin añadir un salto de línea adicional
												datos.append(transferencias.getString("Dato", ""));
												
												// Añade la categoría (Eventos) y el número de elementos
												datos.append("(Avisos1)\n");
												datos.append("(Eventos)\n");
												datos.append(listaavisoseventospersonalizados.size()).append("\n");
												for (String evento : listaavisoseventospersonalizados) {
													    datos.append(evento).append("\n");
												}
												transferencias.edit().putString("Dato", datos.toString()).commit();
												
												// Añade la categoría (Momentos) y sus datos
												datos.append("(Momentos)\n");
												for (String momento : listaavisosmomentospersonalizados) {
													    datos.append(momento).append("\n");
												}
												transferencias.edit().putString("Dato", datos.toString()).commit();
												
												// Añade la categoría (Formas) y sus datos
												datos.append("(Formas)\n");
												for (String forma : listaavisosformaspersonalizadas) {
													    datos.append(forma).append("\n");
												}
												transferencias.edit().putString("Dato", datos.toString()).commit();
												
												// Añade la categoría (Filtros) y sus datos
												datos.append("(Filtros)\n");
												for (String filtro : listaavisosfiltrospersonalizados) {
													    datos.append(filtro).append("\n");
												}
												transferencias.edit().putString("Dato", datos.toString()).commit();
												
												// Añade la categoría (Audios) y sus datos
												datos.append("(Audios)\n");
												for (String audio : listaavisosaudiopersonalizados) {
													    datos.append(audio).append("\n");
												}
												transferencias.edit().putString("Dato", datos.toString()).commit();
												
												
												/*
// Inicializa el StringBuilder para construir los datos
StringBuilder datos = new StringBuilder();

// Mantén los datos preexistentes
datos.append(transferencias.getString("Dato", "")).append("\n");

// Añade la categoría (Eventos) y el número de elementos
//datos.append("(Eventos)\n");
//datos.append(listaavisoseventospersonalizados.size()).append("\n");
for (String evento : listaavisoseventospersonalizados) {
    datos.append(evento).append("\n");
}
transferencias.edit().putString("Dato", datos.toString()).commit();

// Añade la categoría (Momentos) y sus datos
datos.append("(Momentos)\n");
for (String momento : listaavisosmomentospersonalizados) {
    datos.append(momento).append("\n");
}
transferencias.edit().putString("Dato", datos.toString()).commit();

// Añade la categoría (Formas) y sus datos
datos.append("(Formas)\n");
for (String forma : listaavisosformaspersonalizadas) {
    datos.append(forma).append("\n");
}
transferencias.edit().putString("Dato", datos.toString()).commit();

// Añade la categoría (Filtros) y sus datos
datos.append("(Filtros)\n");
for (String filtro : listaavisosfiltrospersonalizados) {
    datos.append(filtro).append("\n");
}
transferencias.edit().putString("Dato", datos.toString()).commit();

// Añade la categoría (Audios) y sus datos
datos.append("(Audios)\n");
for (String audio : listaavisosaudiopersonalizados) {
    datos.append(audio).append("\n");
}
transferencias.edit().putString("Dato", datos.toString()).commit();

*/
												transferencias.edit().putString("Método", "1").commit();
												if (transferencias.getString("Método", "").equals("2")) {
													transferencias.edit().putString("Fase", "1").commit();
													for(int _repeat2216 = 0; _repeat2216 < (int)(5); _repeat2216++) {
														if (transferencias.getString("Fase", "").equals("2")) {
															transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Momentos)".concat("\n"))).commit();
														}
														else {
															
														}
														if (transferencias.getString("Fase", "").equals("3")) {
															transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Formas)".concat("\n"))).commit();
														}
														else {
															
														}
														if (transferencias.getString("Fase", "").equals("4")) {
															transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Filtros)".concat("\n"))).commit();
														}
														else {
															
														}
														if (transferencias.getString("Fase", "").equals("5")) {
															transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Audios)".concat("\n"))).commit();
														}
														else {
															
														}
														contador1 = 0;
														for(int _repeat2246 = 0; _repeat2246 < (int)(listaavisoseventospersonalizados.size()); _repeat2246++) {
															if (transferencias.getString("Fase", "").equals("1")) {
																if (contador1 < listaavisoseventospersonalizados.size()) {
																	transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisoseventospersonalizados.get((int)(contador1)).concat("\n"))).commit();
																}
																else {
																	
																}
															}
															else {
																
															}
															if (transferencias.getString("Fase", "").equals("2")) {
																if (contador1 < listaavisosmomentospersonalizados.size()) {
																	transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosmomentospersonalizados.get((int)(contador1)).concat("\n"))).commit();
																}
																else {
																	
																}
															}
															else {
																
															}
															if (transferencias.getString("Fase", "").equals("3")) {
																if (contador1 < listaavisosformaspersonalizadas.size()) {
																	transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosformaspersonalizadas.get((int)(contador1)).concat("\n"))).commit();
																}
																else {
																	
																}
															}
															else {
																
															}
															if (transferencias.getString("Fase", "").equals("4")) {
																if (contador1 < listaavisosfiltrospersonalizados.size()) {
																	transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosfiltrospersonalizados.get((int)(contador1)).concat("\n"))).commit();
																}
																else {
																	
																}
															}
															else {
																
															}
															if (transferencias.getString("Fase", "").equals("5")) {
																if (contador1 < listaavisosaudiopersonalizados.size()) {
																	transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosaudiopersonalizados.get((int)(contador1)).concat("\n"))).commit();
																}
																else {
																	
																}
															}
															else {
																
															}
															contador1++;
														}
														transferencias.edit().putString("Fase", String.valueOf((long)(Double.parseDouble(transferencias.getString("Fase", "")) + 1))).commit();
													}
												}
												else {
													
												}
											}
											else {
												
											}
										}
										else {
											
										}
									}
									else {
										
									}
								}
								else {
									
								}
							}
							else {
								
							}
							//fin 
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Fin de avisos)".concat("\n"))).commit();
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Fin)".concat("\n"))).commit();
							transferencias.edit().putString("Método", "1").commit();
							if (transferencias.getString("Método", "").equals("2")) {
								listaavisoeventos.add("Seleccione tipo de evento/s");
								listaavisoeventos.add("Todos");
								listaavisoeventos.add("Siguiente");
								listaavisoeventos.add("Día siguiente");
								listaavisoeventos.add("Seleccionados");
								listaavisoeventos.add("Coinciden con texto personalizado");
								listaavisomomento.add("Seleccione momento/s de aviso");
								listaavisomomento.add("Al inicio");
								listaavisomomento.add("Al mostrar aplicación");
								listaavisomomento.add("A la hora de inicio del evento");
								listaavisomomento.add("A la hora de fin del evento");
								listaavisoformas.add("Seleccione forma/s de aviso");
								listaavisoformas.add("Notificación completa");
								listaavisoformas.add("Ventana emergente");
								listaavisosfiltros.add("Seleccione filtro/s de aviso");
								listaavisosfiltros.add("Solo días de la semana");
								listaavisosfiltros.add("Excepto días de la semana");
							}
							else {
								
							}
							//fin de almacenamiento de datos en variables 
						}
						else {
							//sin datos en las matrices 
						}
						FileUtil.writeFile(transferencias.getString("Ruta fichero", "").concat("/".concat(nombre.getText().toString().concat(".txt"))), transferencias.getString("Dato", ""));
						botonguardar.setVisibility(View.GONE);
						setTitle(transferencias.getString("Sección", "").concat(" (".concat(nombre.getText().toString().concat(") "))));
						SketchwareUtil.showMessage(getApplicationContext(), "Guardado");
						if (nombre.getText().toString().equals(transferencias.getString("Último nombre", ""))) {
							
						}
						else {
							aviso.setTitle("Nota con texto duplicado");
							aviso.setMessage("¿Borrar nota anterior? (".concat(transferencias.getString("Último nombre", "").concat(") ".concat(""))));
							aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									FileUtil.deleteFile(transferencias.getString("Ruta fichero", "").concat("/".concat(transferencias.getString("Último nombre", "").concat(".txt"))));
									SketchwareUtil.showMessage(getApplicationContext(), "Cambiado nombre de nota".concat(""));
									transferencias.edit().putString("Último nombre", transferencias.getString("Nombre nota", "")).commit();
								}
							});
							aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							aviso.create().show();
						}
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Método", "").equals("2")) {
							aviso.setTitle("Nota (");
							aviso.setMessage("Nombre nota (".concat(nombre.getText().toString().concat("). Nombre anterior (".concat(transferencias.getString("Último nombre", "").concat(") ".concat(""))))));
							aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							aviso.create().show();
						}
						else {
							
						}
						_actualizarlistanotas();
					}
					else {
						
					}
				}
				else {
					
				}
				//registro 
				_fechayhora();
				transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Fin de botón guardar archivo. ".concat(""))))).commit();
				if (registro.size() > 0) {
					registro.set((int)0, transferencias.getString("Registro", ""));
				}
				else {
					registro.add(transferencias.getString("Registro", ""));
				}
				transferencias.edit().putString("Registro", "").commit();
				if (transferencias.getString("Guardar registro automáticamente", "").equals("Si") || transferencias.getString("Registrar en archivo", "").equals("Si")) {
					if (transferencias.getString("Guardando registro", "").equals("No")) {
						transferencias.edit().putString("Guardando registro", "Si").commit();
						transferencias.edit().putString("Datos", "").commit();
						transferencias.edit().putString("Contador registro", "0").commit();
						if (registro.size() > 0) {
							for(int _repeat2558 = 0; _repeat2558 < (int)(registro.size()); _repeat2558++) {
								if (Double.parseDouble(transferencias.getString("Contador registro", "")) < registro.size()) {
									transferencias.edit().putString("Datos", transferencias.getString("Datos", "").concat(registro.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))).concat("\n"))).commit();
									transferencias.edit().putString("Contador registro", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador registro", "")) + 1))).commit();
								}
								else {
									
								}
							}
						}
						else {
							transferencias.edit().putString("Datos", transferencias.getString("Datos", "").concat(registro.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))).concat("\n"))).commit();
						}
						FileUtil.writeFile(transferencias.getString("Ruta registros", "").concat("/registro general.txt"), transferencias.getString("Datos", ""));
					}
					else {
						
					}
					listviewregistro.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, registro));
					((BaseAdapter)listviewregistro.getAdapter()).notifyDataSetChanged();
					transferencias.edit().putString("Guardando registro", "No").commit();
				}
				else {
					
				}
				//fin de registro 
			}
		});
		
		button32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (texto.getText().toString().equals("")) {
					
				}
				else {
					if (transferencias.getString("Texto seleccionado", "").equals("")) {
						dato = texto.getText().toString();
					}
					else {
						dato = transferencias.getString("Texto seleccionado", "");
					}
					ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE); 
					ClipData clip = ClipData.newPlainText("label", dato);
					clipboard.setPrimaryClip(clip);
					SketchwareUtil.showMessage(getApplicationContext(), "Copiado");
				}
			}
		});
		
		button33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ClipboardManager paste = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				texto.setText(paste.getText());
			}
		});
		
		button39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (voz.isSpeaking()) {
					voz.stop();
				}
				else {
					if (texto.getText().toString().equals("")) {
						SketchwareUtil.showMessage(getApplicationContext(), "No hay texto que decir");
					}
					else {
						if (transferencias.getString("Tipo de búsqueda", "").equals("Texto")) {
							voz.speak(texto.getText().toString(), TextToSpeech.QUEUE_ADD, null);
						}
						else {
							voz.speak(transferencias.getString("Texto seleccionado", ""), TextToSpeech.QUEUE_ADD, null);
						}
					}
				}
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				posicionx.clear();
				posicionx1.clear();
				transferencias.edit().putString("Buscando", "Si").commit();
				_ocultaropciones();
				
				cuadrobuscar.setVisibility(View.VISIBLE);
				
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (button7.getText().toString().equals("Opciones")) {
					button7.setText("Ocultar opiniones");
					opcionestexto.setVisibility(View.VISIBLE);
				}
				else {
					button7.setText("Opciones");
					opcionestexto.setVisibility(View.GONE);
				}
			}
		});
		
		spinerinsertar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (listainsertar.get((int)(_position)).equals("Insertar")) {
					
				}
				else {
					if (listainsertar.get((int)(_position)).equals("Fecha")) {
						
					}
					else {
						
					}
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		masopcionesedicion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (listaedicion.get((int)(_position)).equals("+")) {
					
				}
				else {
					
				}
				if (listaedicion.get((int)(_position)).equals("Ir al inicio del texto")) {
					((EditText)texto).setSelection((int)1, (int)1);
					textoposicion.setText("11");
					int position = textoposicion.length();
					Editable etext = edittext1.getText(); Selection.setSelection(etext, position);
					int deslizartextovar = (int) 1;
					deslizartexto.scrollTo(0, deslizartextovar);
					SketchwareUtil.showMessage(getApplicationContext(), "Inicio");
				}
				else {
					
				}
				if (listaedicion.get((int)(_position)).equals("Ir al final del texto")) {
					int deslizartextovar = (int) texto.getText().toString().length();
					deslizartexto.scrollTo(0, deslizartextovar);
					SketchwareUtil.showMessage(getApplicationContext(), "Final");
				}
				else {
					
				}
				if (listaedicion.get((int)(_position)).equals("Copiar")) {
					dato = texto.getText().toString();
					ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE); 
					ClipData clip = ClipData.newPlainText("label", dato);
					clipboard.setPrimaryClip(clip);
				}
				else {
					
				}
				if (listaedicion.get((int)(_position)).equals("Importar texto desde fichero")) {
					dato = texto.getText().toString();
					button23.performClick();
				}
				else {
					
				}
				if (listaedicion.get((int)(_position)).equals("Encriptar")) {
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("2")) {
						str = texto.getText().toString();
						slist.clear();
						encriptarmapa.clear();
						String [] arr = str.split("\n");
						for (int i = 0; i < arr.length; i++) {
							slist.add(arr[i]);
						}
						contador = 0;
						for(int _repeat55 = 0; _repeat55 < (int)(slist.size()); _repeat55++) {
							if (contador < slist.size()) {
								encriptarmapa.put(String.valueOf((long)(contador)), slist.get((int)(contador)));
							}
							else {
								contador++;
							}
						}
					}
					else {
						
					}
					transferencias.edit().putString("Encriptar", "Si").commit();
					//Módulo Encriptar
				}
				else {
					
				}
				if (listaedicion.get((int)(_position)).equals("Desencriptar")) {
					transferencias.edit().putString("Encriptar", "No").commit();
					//Módulo Encriptar
				}
				else {
					
				}
				if (listaedicion.get((int)(_position)).equals("Información de la nota")) {
					aviso.setTitle(listaedicion.get((int)(_position)).concat("".concat("".concat(""))));
					aviso.setMessage("Líneas: ".concat(String.valueOf((long)(lineas.size())).concat("".concat(""))));
					aviso.setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
				}
				else {
					
				}
				masopcionesedicion.setSelection((int)(0));
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		button23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				barraherramientas.setVisibility(View.GONE);
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					_controlopciones();
				}
				else {
					
				}
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editando = true;
				transferencias.edit().putString("Nota", "Nueva").commit();
				transferencias.edit().putString("Enviado", "Si").commit();
				transferencias.edit().putString("Editando", "Si").commit();
				_configurarnotas();
			}
		});
		
		button38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (voz.isSpeaking()) {
					voz.stop();
				}
				else {
					if (transferencias.getString("Nombre nota", "").equals("(No)")) {
						SketchwareUtil.showMessage(getApplicationContext(), "Nota seleccionada: ".concat(transferencias.getString("Nombre nota", "").concat(". Seleccione archivo")));
					}
					else {
						voz.speak(FileUtil.readFile(transferencias.getString("Ruta ficheros", "").concat("/".concat(transferencias.getString("Nombre nota", "").concat(".txt")))), TextToSpeech.QUEUE_ADD, null);
					}
				}
			}
		});
		
		opcionesnotas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				transferencias.edit().putString("Sección", listasecciones.get((int)(_position))).commit();
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Fin", "Si").commit();
				transferencias.edit().putString("Sección opciones", "Buscar calendario").commit();
				_controlopciones();
			}
		});
		
		registroizquierda.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((contadorbuscar - 1) > -1) {
					registroderecha.setVisibility(View.VISIBLE);
					contadorbuscar--;
					spinnerbusqueda.setSelection((int)(contadorbuscar));
					transferencias.edit().putString("Día seleccionado", String.valueOf((long)(diaencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
					transferencias.edit().putString("Mes seleccionado", String.valueOf((long)(mesencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
					transferencias.edit().putString("Año seleccionado", String.valueOf((long)(anoencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
					_comprobarfecha();
					textobusqueda.setText(String.valueOf((long)(diaencontrado.get((int)(contadorbuscar)).doubleValue())).concat("/".concat(String.valueOf((long)(mesencontrado.get((int)(contadorbuscar)).doubleValue())).concat("/".concat(String.valueOf((long)(anoencontrado.get((int)(contadorbuscar)).doubleValue())).concat(" (".concat(String.valueOf((long)(contadorbuscar)).concat(String.valueOf((long)(diaencontrado.size())).concat(") ".concat(""))))))))));
				}
				else {
					registroizquierda.setVisibility(View.GONE);
				}
			}
		});
		
		spinnerbusqueda.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				contadorbuscar = _position;
				transferencias.edit().putString("Día seleccionado", String.valueOf((long)(listadia.get((int)(diaencontrado.get((int)(_position)).doubleValue())).doubleValue()))).commit();
				transferencias.edit().putString("Mes seleccionado", String.valueOf((long)(listames.get((int)(mesencontrado.get((int)(_position)).doubleValue())).doubleValue()))).commit();
				transferencias.edit().putString("Año seleccionado", String.valueOf((long)(listaano.get((int)(anoencontrado.get((int)(_position)).doubleValue())).doubleValue()))).commit();
				_comprobarfecha();
				textobusqueda.setText("Registro ".concat(String.valueOf((long)(diaencontrado.get((int)(_position)).doubleValue())).concat("/".concat(String.valueOf((long)(diaencontrado.size())).concat("")))));
				
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		registroderecha.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((contadorbuscar + 1) < diaencontrado.size()) {
					registroizquierda.setVisibility(View.VISIBLE);
					contadorbuscar++;
					spinnerbusqueda.setSelection((int)(contadorbuscar));
					textobusqueda.setText("Registro ".concat(String.valueOf((long)(diaencontrado.get((int)(contadorbuscar)).doubleValue())).concat("/".concat(String.valueOf((long)(diaencontrado.size())).concat("")))));
					transferencias.edit().putString("Día seleccionado", String.valueOf((long)(diaencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
					transferencias.edit().putString("Mes seleccionado", String.valueOf((long)(mesencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
					transferencias.edit().putString("Año seleccionado", String.valueOf((long)(anoencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
					_comprobarfecha();
				}
				else {
					registroderecha.setVisibility(View.GONE);
				}
			}
		});
		
		checkbox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Tipo de búsqueda", "Lista").commit();
				}
				else {
					transferencias.edit().putString("Tipo de búsqueda", "Texto").commit();
				}
				if (transferencias.getString("Tipo de búsqueda", "").equals("Lista")) {
					if (transferencias.getString("Sección", "").equals("Editar")) {
						transferencias.edit().putString("Mostrar sección", "Buscar por lista").commit();
						_mostrarseccion();
						SketchwareUtil.showMessage(getApplicationContext(), "Cambiado ".concat(transferencias.getString("Cambiado", "")));
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Cambiado", "").equals("Si")) {
							str = texto.getText().toString();
							slist.clear();
							String [] arr = str.split("\n");
							for (int i = 0; i < arr.length; i++) {
								slist.add(arr[i]);
							}
							lineas.clear();
							listabuscar.clear();
							contador = 0;
							transferencias.edit().putString("Cargando", "Si").commit();
							temporizadorcargar = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											if (contador < slist.size()) {
												listabuscar.add("(".concat(String.valueOf((long)(contador + 1)).concat(") ".concat(slist.get((int)(contador))))));
												lineas.add(slist.get((int)(contador)));
												textocargar.setText("Cargando (".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(""))))));
												contador++;
											}
											else {
												transferencias.edit().putString("Mostrar opción", "Editar").commit();
												_mostraropcion();
												buscarporlista.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, listabuscar));
												((BaseAdapter)buscarporlista.getAdapter()).notifyDataSetChanged();
												textview8.setText("Buscar en lista. Elementos: ".concat(String.valueOf((long)(listabuscar.size()))));
												textocargar.setText("Cargado: ".concat(String.valueOf((long)(listabuscar.size()))));
												_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) - 100, buscarlista);
												transferencias.edit().putString("Cargando", "No").commit();
												temporizadorcargar.cancel();
											}
										}
									});
								}
							};
							_timer.scheduleAtFixedRate(temporizadorcargar, (int)(10), (int)(10));
						}
						else {
							transferencias.edit().putString("Cargando", "Si").commit();
							transferencias.edit().putString("Mostrar opción", "Buscar").commit();
							_mostraropcion();
							buscarporlista.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, listabuscar));
							((BaseAdapter)buscarporlista.getAdapter()).notifyDataSetChanged();
							textview8.setText("Buscar en lista. Elementos: ".concat(String.valueOf((long)(listabuscar.size()))));
							textocargar.setText("Cargado: ".concat(String.valueOf((long)(listabuscar.size()))));
							encontrados.setText("Encontrados: (0/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(""))));
							transferencias.edit().putString("Cargando", "No").commit();
							temporizadorcargar = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), buscarlista.getHeight(), buscarlista);
											temporizadorcargar.cancel();
										}
									});
								}
							};
							_timer.schedule(temporizadorcargar, (int)(10));
						}
					}
					else {
						
					}
					if (transferencias.getString("Sección", "").equals("Notas")) {
						transferencias.edit().putString("Mostrar sección", "Lista de notas").commit();
						_mostrarseccion();
					}
					else {
						
					}
				}
				else {
					
				}
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				find = _charSeq;
				if (transferencias.getString("Última búsqueda", "").equals(_charSeq)) {
					transferencias.edit().putString("Marcar", "No").commit();
				}
				else {
					textobuscar = _charSeq;
					contadorbuscar = 0;
					posicioncursor = 1;
					contador = 0;
					transferencias.edit().putString("Marcar", "Si").commit();
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_fechayhora();
				if (edittext2.getText().toString().equals("")) {
					
				}
				else {
					if (transferencias.getString("Tipo de búsqueda", "").equals("Texto")) {
						_ocultaropciones();
						barraherramientas.setVisibility(View.VISIBLE);
						cuadrocargar.setVisibility(View.VISIBLE);
						if (texto.getText().toString().equals("")) {
							
						}
						else {
							//marcar texto
							transferencias.edit().putString("Método", "1").commit();
							if (transferencias.getString("Método", "").equals("1")) {
								transferencias.edit().putString("Buscando", "Si").commit();
								text = texto.getText().toString();
								Spannable spannable1 = new SpannableString(text);
								android.text.style.ForegroundColorSpan fgSpan = new android.text.style.ForegroundColorSpan(Color.parseColor("#ffffff"));
								android.text.style.BackgroundColorSpan bgSpan = new android.text.style.BackgroundColorSpan(Color.parseColor("#4c91df"));
								len = edittext2.getText().toString().length();
								y = 0;
								total = 0;
								if (text.contains(edittext2.getText().toString()) && (len > 0)) {
									for(int _repeat4501 = 0; _repeat4501 < (int)(((text.length() - len) + 1)); _repeat4501++) {
										if (text.substring((int)(y), (int)(y + len)).equals(edittext2.getText().toString())) {
											y++;
											total++;
										}
										else {
											y++;
										}
									}
									int x = 0;
									for(int _repeat4520 = 0; _repeat4520 < (int)(total); _repeat4520++) {
										int n = text.indexOf(edittext2.getText().toString(), x);
										x = n+1;
										spannable1.setSpan(android.text.style.CharacterStyle.wrap(fgSpan), n, n + edittext2.getText().length(), 0);
										spannable1.setSpan(android.text.style.CharacterStyle.wrap(bgSpan), n, n + edittext2.getText().length(), 0);
									}
								}
								texto.setText(spannable1);
							}
							else {
								
							}
							transferencias.edit().putString("Buscando", "No").commit();
							//fin de marcar 
							texto.setTextIsSelectable(true);
							texto.requestFocus();
							//Buscar posición de palabra 
							if (contador == 0) {
								transferencias.edit().putString("Límite", String.valueOf((long)(caracteres + edittext2.getText().toString().length()))).commit();
								transferencias.edit().putString("Filtro", "").commit();
								transferencias.edit().putString("Texto", "").commit();
								transferencias.edit().putString("Posición encontrada", "0").commit();
								str = texto.getText().toString();
								slist1.clear();
								//calcular número de caracteres. Restar 1
								//String data = "1,2,3,,5,6,,";
								String[] arr1 = str.split("");
								for (int i=0; i<arr1.length; i++){
									slist1.add(arr1[i]);
									//System.out.println(split[i]);
								} 
								//System.out.println("Done");
								
							}
							else {
								
							}
							transferencias.edit().putString("Fin", "No").commit();
							veces = 0;
							temporizadorbuscar = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											if (transferencias.getString("Buscando", "").equals("No")) {
												if (transferencias.getString("Fin", "").equals("No")) {
													if ((contador + edittext2.getText().toString().length()) < slist1.size()) {
														transferencias.edit().putString("Límite", String.valueOf((long)(contador + edittext2.getText().toString().length()))).commit();
														transferencias.edit().putString("Filtro", texto.getText().toString().substring((int)(contador), (int)(contador + edittext2.getText().toString().length()))).commit();
														contadorregistrofiltrotexto++;
														registrobidimensional.get((int)0).put("Registros de filtro de texto", String.valueOf((long)(contadorregistrofiltrotexto)));
														{
															HashMap<String, Object> _item = new HashMap<>();
															_item.put("Filtro de texto", transferencias.getString("Hora completa", "").concat(". Buscando (".concat(transferencias.getString("Filtro", "").toLowerCase().concat("). Longitud: ".concat(String.valueOf((long)(transferencias.getString("Filtro", "").length())).concat(". Carácter (".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") ".concat("")))))))))));
															registrobidimensional.add(_item);
														}
														
														textocargar.setText("1 Buscando  (".concat(String.valueOf((long)(contador + 1)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") (".concat(transferencias.getString("Filtro", "").concat(" = ".concat(edittext2.getText().toString().concat("). Fin ".concat(transferencias.getString("Fin", "").concat("")))))))))));
														encontrados.setText("1 Buscando (".concat(String.valueOf((long)(contador + 1)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") (".concat(transferencias.getString("Filtro", "").concat(" = ".concat(edittext2.getText().toString().concat("). Fin ".concat(transferencias.getString("Fin", "").concat("")))))))))));
														if (edittext2.getText().toString().toLowerCase().equals(transferencias.getString("Filtro", "").toLowerCase())) {
															transferencias.edit().putString("Texto", transferencias.getString("Filtro", "")).commit();
															transferencias.edit().putString("Posición encontrada", String.valueOf((long)(contador))).commit();
															transferencias.edit().putString("Fin", "Si").commit();
															textocargar.setText("Fin (".concat(String.valueOf((long)(contador + 1)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") (".concat(transferencias.getString("Filtro", "").concat(" = ".concat(edittext2.getText().toString().concat("). Fin ".concat(transferencias.getString("Fin", "").concat("")))))))))));
															encontrados.setText("Fin (".concat(String.valueOf((long)(contador + 1)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") (".concat(transferencias.getString("Filtro", "").concat(" = ".concat(edittext2.getText().toString().concat("). Fin ".concat(transferencias.getString("Fin", "").concat("")))))))))));
														}
														else {
															
														}
														//contador de caracteres 
														contador++;
														//fin de contador de caracteres aquí por probable fallo del compilador en else
														if ((contador + edittext2.getText().toString().length()) < slist1.size()) {
															
														}
														else {
															transferencias.edit().putString("Fin", "Si").commit();
															contador = 0;
														}
													}
													else {
														//fallo de contador. Nada entra aquí aunque el contador deje de ser menor que el criterio establecido 
													}
													//
												}
												else {
													if (veces < 1) {
														if (Double.parseDouble(transferencias.getString("Posición encontrada", "")) > 0) {
															textocargar.setText("Encontrado (".concat(String.valueOf((long)(contador + 1)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") (".concat(transferencias.getString("Filtro", "").concat(" = ".concat(edittext2.getText().toString().concat("). Fin ".concat(transferencias.getString("Fin", "").concat(". Temporizador activo: ".concat(String.valueOf((long)(veces)).concat("")))))))))))));
															encontrados.setText("Encontrado (".concat(String.valueOf((long)(contador + 1)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") (".concat(transferencias.getString("Filtro", "").concat(" = ".concat(edittext2.getText().toString().concat("). Fin ".concat(transferencias.getString("Fin", "").concat(". Temporizador activo: ".concat(String.valueOf((long)(veces)).concat("")))))))))))));
														}
														else {
															textocargar.setText("Fin de búsqueda. No encontrado (".concat(String.valueOf((long)(contador + 1)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") (".concat(transferencias.getString("Filtro", "").concat("). Fin ".concat(transferencias.getString("Fin", "").concat(". Temporizador activo: ".concat(String.valueOf((long)(veces)).concat("")))))))))));
															encontrados.setText("Fin de búsqueda. No encontrado (".concat(String.valueOf((long)(contador + 1)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") (".concat(transferencias.getString("Filtro", "").concat("). Fin ".concat(transferencias.getString("Fin", "").concat(". Temporizador activo: ".concat(String.valueOf((long)(veces)).concat("")))))))))));
														}
														//posición de cursor
														textoposicion.setText("");
														posicioncursor = 0;
														for(int _repeat4364 = 0; _repeat4364 < (int)(Double.parseDouble(transferencias.getString("Posición encontrada", ""))); _repeat4364++) {
															if (posicioncursor < Double.parseDouble(transferencias.getString("Posición encontrada", ""))) {
																posicioncursor++;
																textoposicion.setText(textoposicion.getText().toString().concat(String.valueOf((long)(1))));
															}
															else {
																
															}
														}
														int p = textoposicion.length();
														texto.setSelection(p);
														
														// Start Button :
														//texto.setSelection(p);
														
														texto.requestFocus();
														((EditText)texto).setSelection((int)Double.parseDouble(transferencias.getString("Posición encontrada", "")), (int)Double.parseDouble(transferencias.getString("Posición encontrada", "")) + edittext2.getText().toString().length());
														textoposicion.getBackground().setColorFilter(0xFFF44336, PorterDuff.Mode.MULTIPLY);
														//fin
														//mover texto
														if (Double.parseDouble(transferencias.getString("Posición encontrada", "")) > (64 * 28)) {
															int deslizartextovar = (int) Double.parseDouble(transferencias.getString("Posición encontrada", "")) * 67;
															deslizartexto.scrollTo(0, deslizartextovar);
														}
														else {
															
														}
														//fin de mover texto
														//marcar texto
														if (transferencias.getString("Marcar", "").equals("Si")) {
															transferencias.edit().putString("Marcar", "No").commit();
															transferencias.edit().putString("Última búsqueda", edittext2.getText().toString()).commit();
														}
														else {
															
														}
														//fin marcar texto 
													}
													else {
														
													}
													veces++;
													temporizadorbuscar.cancel();
												}
											}
											else {
												
											}
										}
									});
								}
							};
							_timer.scheduleAtFixedRate(temporizadorbuscar, (int)(4), (int)(4));
							//fin de búsqueda de posición 
							transferencias.edit().putString("Método", "1").commit();
							if (transferencias.getString("Método", "").equals("2")) {
								if (transferencias.getString("Primera búsqueda", "").equals("Si")) {
									transferencias.edit().putString("Primera búsqueda", "No").commit();
									//primera búsqueda
									//posición de texto
									textobuscar = edittext2.getText().toString();
									posicionx.clear();
									posicionx1.clear();
									//buscar la posición de todos los textos
									//String textotemporal = "I love you so much";
									//String textobuscar= "love";
									Pattern palabra= Pattern.compile(textobuscar);
									Matcher match = palabra.matcher(textotemporal);
									
									while (match.find()) {
										//if (match.find()) {
										     //System.out.println("Found love at index "+ 
										textobuscar1=match.start() +" - "+ (match.end()-1);
										x=match.start();
										x1=(match.end()-1);
										
										posicionx.add(Double.valueOf(x));
										posicionx1.add(Double.valueOf(x1));
										posicion.add((int)(0), textobuscar1);
										//cursorposicion.add(0,_parametro2 +_parametro4);
									}
									x = 0;
									x1 = 0;
									//edittext1.setText(textobuscar, TextView.BufferType.EDITABLE);
									//fin posición de texto
									encontrados.setText("Encontrados: ".concat(String.valueOf((long)(posicionx.size())).concat("")));
									try{
										((EditText)texto).setSelection((int)posicionx.get((int)(1)).doubleValue(), (int)posicionx1.get((int)(1)).doubleValue());
										((EditText)texto).setSelection((int)posicionx.get((int)(1)).doubleValue(), (int)posicionx1.get((int)(1)).doubleValue());
									}catch(Exception e){
										SketchwareUtil.showMessage(getApplicationContext(), "Error al seleccionar");
									}
									transferencias.edit().putString("Método", "1").commit();
									if (transferencias.getString("Método", "").equals("1")) {
										
									}
									else {
										
									}
								}
								else {
									//búsqueda siguiente
									if (contadorbuscar < posicionx1.size()) {
										prueba1 = posicioncursor;
										if (posicionx1.indexOf(contadorbuscar) > texto.getText().toString().length()) {
											posicioncursor = texto.getText().toString().length() - 1;
										}
										else {
											posicioncursor = posicionx1.indexOf(contadorbuscar);
											posicioncursor = posicionx1.get((int)(contadorbuscar)).doubleValue();
										}
										if (posicionx1.get((int)(contadorbuscar)).doubleValue() > texto.getText().toString().length()) {
											posicioncursor = texto.getText().toString().length() - 1;
										}
										else {
											posicioncursor = posicionx1.indexOf(contadorbuscar);
											posicioncursor = posicionx1.get((int)(contadorbuscar)).doubleValue();
										}
										contadorbuscar++;
									}
									else {
										contadorbuscar = 0;
										posicioncursor = 0;
									}
									try{
										((EditText)texto).setSelection((int)posicionx.get((int)(contadorbuscar)).doubleValue(), (int)posicionx1.get((int)(contadorbuscar)).doubleValue());
									}catch(Exception e){
										SketchwareUtil.showMessage(getApplicationContext(), "Error al seleccionar");
									}
									transferencias.edit().putString("Primera búsqueda", "No").commit();
									texto.requestFocus();
									try{
										matrizcursor.clear();
										matrizcursor.add(Double.valueOf(contadorbuscar));
										//colocar cursor. Si se usa matriz numérica, usar get at
										//edittext1.setSelection(posicionx1.indexOf(posicioncursor)); //
										//edittext1.setSelection(posicioncursor, edittext1);
										
										textoposicion.setText("");
										contador = 0;
										for(int _repeat624 = 0; _repeat624 < (int)(posicionx1.get((int)(contadorbuscar)).doubleValue()); _repeat624++) {
											if (contador < posicionx1.get((int)(contadorbuscar)).doubleValue()) {
												
											}
											else {
												
											}
											textoposicion.setText(textoposicion.getText().toString().concat("1"));
											contador++;
										}
										SketchwareUtil.showMessage(getApplicationContext(), String.valueOf((long)(posicionx1.get((int)(contadorbuscar)).doubleValue())));
										//establecer cursor
										//etmsg.setText("Updated Text From another Activity"); 
										int position = textoposicion.length();
										Editable etext = edittext1.getText(); Selection.setSelection(etext, position);
										encontrados.setText("Texto ".concat(String.valueOf((long)(contadorbuscar)).concat(". Rango ".concat(String.valueOf((long)(matrizcursor.get((int)(0)).doubleValue())).concat("/".concat(String.valueOf((long)(posicionx1.get((int)(contadorbuscar)).doubleValue()))))))));
										posicioncursor = posicionx.indexOf(contadorbuscar);
										posicioncursor = posicionx.get((int)(contadorbuscar)).doubleValue();
									}catch(Exception e){
										encontrados.setText("Cursor error ".concat(String.valueOf((long)(contadorbuscar)).concat(". Rango ".concat(String.valueOf((long)(matrizcursor.get((int)(0)).doubleValue())).concat("/".concat(String.valueOf((long)(posicionx1.get((int)(contadorbuscar)).doubleValue()))))))));
									}
									//edittext1.requestFocus();
									//edittext1.setSelection(edittext2.getText().length());
									if (edittext1.getText().toString().length() > 0 ) 
									{
										//edittext1.setSelection(10,edittext2.getText().toString().length());
									}
									//sustituir palabra
									//fin
								}
							}
							else {
								
							}
						}
					}
					else {
						_ocultaropciones();
						barraherramientas.setVisibility(View.VISIBLE);
						cuadrocargar.setVisibility(View.VISIBLE);
						contador1 = 0;
						transferencias.edit().putString("Fin", "No").commit();
						transferencias.edit().putString("Posición encontrada", "No").commit();
						transferencias.edit().putString("Buscando", "Si").commit();
						transferencias.edit().putString("Siguiente", "Si").commit();
						transferencias.edit().putString("Texto", "").commit();
						temporizadorcargar = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (transferencias.getString("Fin", "").equals("No")) {
											
										}
										else {
											
										}
										if (transferencias.getString("Cargando", "").equals("No")) {
											if (transferencias.getString("Siguiente", "").equals("Si")) {
												
											}
											else {
												
											}
										}
										else {
											
										}
										if (contador1 < listabuscar.size()) {
											textocargar.setText("1 Buscando en elemento (".concat(String.valueOf((long)(contador1 + 1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(". Caracter (".concat(String.valueOf((long)(caracteres)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") Siguiente ".concat(transferencias.getString("Siguiente", "").concat(""))))))))))));
											encontrados.setText("1 Buscando (".concat(String.valueOf((long)(contador1 + 1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(edittext2.getText().toString().concat(". Caracter (".concat(String.valueOf((long)(caracteres)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") Siguiente ".concat(transferencias.getString("Siguiente", "").concat("")))))))))))));
											if (transferencias.getString("Siguiente", "").equals("Si")) {
												transferencias.edit().putString("Texto", "").commit();
												transferencias.edit().putString("Posición encontrada", "No").commit();
												transferencias.edit().putString("Siguiente", "No").commit();
												inicio = 0;
												fin = 0;
												contadorregistrofiltrotexto = 0;
												caracteres = 0;
												str = listabuscar.get((int)(contador1));
												slist1.clear();
												//calcular número de caracteres. Restar 1
												//String data = "1,2,3,,5,6,,";
												String[] arr1 = str.split("");
												for (int i=0; i<arr1.length; i++){
													slist1.add(arr1[i]);
													//System.out.println(split[i]);
												} 
												//System.out.println("Done");
												
												for(int _repeat2206 = 0; _repeat2206 < (int)(slist1.size()); _repeat2206++) {
													if ((caracteres + edittext2.getText().toString().length()) < slist1.size()) {
														transferencias.edit().putString("Límite", String.valueOf((long)(caracteres + edittext2.getText().toString().length()))).commit();
														transferencias.edit().putString("Filtro", listabuscar.get((int)(contador1)).substring((int)(caracteres), (int)(caracteres + edittext2.getText().toString().length()))).commit();
														contadorregistrofiltrotexto++;
														registrobidimensional.get((int)0).put("Registros de filtro de texto", String.valueOf((long)(contadorregistrofiltrotexto)));
														{
															HashMap<String, Object> _item = new HashMap<>();
															_item.put("Filtro de texto", transferencias.getString("Hora completa", "").concat(". Buscando (".concat(transferencias.getString("Filtro", "").toLowerCase().concat("). Longitud: ".concat(String.valueOf((long)(transferencias.getString("Filtro", "").length())).concat(". Carácter (".concat(String.valueOf((long)(caracteres)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") ".concat("")))))))))));
															registrobidimensional.add(_item);
														}
														
														textocargar.setText("2 Buscando en elemento (".concat(String.valueOf((long)(contador1 + 1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(". Caracter (".concat(String.valueOf((long)(caracteres)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") Siguiente ".concat(transferencias.getString("Siguiente", "").concat(""))))))))))));
														encontrados.setText("2 Buscando (".concat(String.valueOf((long)(contador1 + 1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(edittext2.getText().toString().concat(". Caracter (".concat(String.valueOf((long)(caracteres)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") Siguiente ".concat(transferencias.getString("Siguiente", "").concat("")))))))))))));
														if (edittext2.getText().toString().toLowerCase().equals(transferencias.getString("Filtro", "").toLowerCase())) {
															transferencias.edit().putString("Texto", transferencias.getString("Filtro", "")).commit();
															textocargar.setText("Fin (".concat(String.valueOf((long)(contador1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(transferencias.getString("Filtro", "").concat(". Caracter (".concat(String.valueOf((long)(caracteres)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") Siguiente ".concat(transferencias.getString("Siguiente", "").concat("")))))))))))));
															encontrados.setText("Fin (".concat(String.valueOf((long)(contador1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(transferencias.getString("Filtro", "").concat(". Caracter (".concat(String.valueOf((long)(caracteres)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") Siguiente ".concat(transferencias.getString("Siguiente", "").concat("")))))))))))));
															transferencias.edit().putString("Posición encontrada", String.valueOf((long)(contador1))).commit();
															transferencias.edit().putString("Fin", "Si").commit();
														}
														else {
															
														}
														//contador de caracteres 
														caracteres++;
														//fin de contador de caracteres aquí por probable fallo del compilador en else
														if (transferencias.getString("Fin", "").equals("No")) {
															if ((caracteres + edittext2.getText().toString().length()) < slist1.size()) {
																
															}
															else {
																contador1++;
																transferencias.edit().putString("Siguiente", "Si").commit();
																if ((contador1 == listabuscar.size()) || (contador1 > listabuscar.size())) {
																	transferencias.edit().putString("Fin", "Si").commit();
																	textocargar.setText("1 Fin (".concat(String.valueOf((long)(contador1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(". Caracter (".concat(String.valueOf((long)(caracteres)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") Siguiente ".concat(transferencias.getString("Siguiente", "").concat(""))))))))))));
																	encontrados.setText("1 Fin (".concat(String.valueOf((long)(contador1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(transferencias.getString("Filtro", "").concat(". Caracter (".concat(String.valueOf((long)(caracteres)).concat("/".concat(String.valueOf((long)(slist1.size())).concat(") Siguiente ".concat(transferencias.getString("Siguiente", "").concat("")))))))))))));
																}
																else {
																	
																}
															}
														}
														else {
															break;
														}
													}
													else {
														//fallo de contador. Nada entra aquí aunque el contador deje de ser menor que el criterio establecido 
													}
													if (caracteres < slist1.size()) {
														
													}
													else {
														
													}
												}
												//fin de bucle 
											}
											else {
												
											}
											//fin de bucle 
										}
										else {
											transferencias.edit().putString("Fin", "Si").commit();
										}
										if (transferencias.getString("Fin", "").equals("Si")) {
											if (transferencias.getString("Posición encontrada", "").equals("No")) {
												textocargar.setText("Fin de búsqueda. No encontrado (".concat(String.valueOf((long)(contador1 + 1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(edittext2.getText().toString().concat("")))))));
												encontrados.setText("Fin de búsqueda. No encontrado (".concat(String.valueOf((long)(contador1 + 1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(edittext2.getText().toString().concat("")))))));
											}
											else {
												textocargar.setText("Encontrado (".concat(String.valueOf((long)(contador1 + 1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(edittext2.getText().toString().concat("")))))));
												encontrados.setText("Encontrado (".concat(String.valueOf((long)(contador1 + 1)).concat("/".concat(String.valueOf((long)(listabuscar.size())).concat(") ".concat(edittext2.getText().toString().concat("")))))));
												buscarporlista.smoothScrollToPosition((int)(Double.parseDouble(transferencias.getString("Posición encontrada", ""))));
											}
											temporizadorcargar.cancel();
										}
										else {
											
										}
									}
								});
							}
						};
						_timer.scheduleAtFixedRate(temporizadorcargar, (int)(10), (int)(10));
					}
				}
			}
		});
		
		button37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				contador = 0;
				caracteres = 0;
			}
		});
		
		button34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				continuar = false;
				transferencias.edit().putString("Fin", "Si").commit();
				cuadrocargar.setVisibility(View.GONE);
				transferencias.edit().putString("Mostrar opción", "Organizar").commit();
				_mostraropcion();
			}
		});
		
		button51.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Mostrar opción", "Organizar").commit();
				_mostraropcion();
			}
		});
		
		botonguardarcalendario.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				//formato
				//estado en listaestado
				transferencias.edit().putString("Cambiado1", "No").commit();
				transferencias.edit().putString("Último día", transferencias.getString("Día seleccionado", "")).commit();
				transferencias.edit().putString("Último mes", transferencias.getString("Mes seleccionado", "")).commit();
				transferencias.edit().putString("Último año", transferencias.getString("Año seleccionado", "")).commit();
				transferencias.edit().putString("Último estado", transferencias.getString("Estado", "")).commit();
				transferencias.edit().putString("Último hora desde", transferencias.getString("Hora desde", "")).commit();
				transferencias.edit().putString("Último hora hasta", transferencias.getString("Hora hasta", "")).commit();
				transferencias.edit().putString("Último comentario", transferencias.getString("Comentario", "")).commit();
				botonguardar.setVisibility(View.VISIBLE);
				contador = 0;
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					//completar matriz si no tiene los mismos datos que los demás campos 
					if (comentarios.size() < listadia.size()) {
						for(int _repeat1225 = 0; _repeat1225 < (int)(listadia.size()); _repeat1225++) {
							if (comentarios.size() < listadia.size()) {
								comentarios.add(transferencias.getString("Comentario", ""));
								contador++;
							}
							else {
								
							}
						}
					}
					else {
						
					}
					if (horarioseleccionado.size() < listadia.size()) {
						contador = 0;
						for(int _repeat1458 = 0; _repeat1458 < (int)(listadia.size()); _repeat1458++) {
							if (horarioseleccionado.size() < listadia.size()) {
								horarioseleccionado.add(transferencias.getString("Horario seleccionado", ""));
								contador++;
							}
							else {
								
							}
						}
					}
					else {
						
					}
					transferencias.edit().putString("Encontrado", "No").commit();
					contador = 0;
					for(int _repeat19 = 0; _repeat19 < (int)((listadia.size() - 1)); _repeat19++) {
						if (listadia.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Día seleccionado", ""))) {
							if (listames.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Mes seleccionado", ""))) {
								if (listaano.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Año seleccionado", ""))) {
									transferencias.edit().putString("Encontrado", "Si").commit();
									contador1 = contador;
									break;
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
						contador++;
					}
				}
				else {
					
				}
				//fin de rutina anulada 
				if (transferencias.getString("Encontrado", "").equals("Si")) {
					aviso.setTitle("Fecha existente (".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat(") ".concat("".concat("".concat(""))))))))));
					aviso.setMessage("¿Sustituir? ".concat("".concat("".concat(""))));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							listadia.set((int)Double.parseDouble(transferencias.getString("Posición", "")), Double.parseDouble(transferencias.getString("Día seleccionado", "")));
							listames.set((int)Double.parseDouble(transferencias.getString("Posición", "")), Double.parseDouble(transferencias.getString("Mes seleccionado", "")));
							listaano.set((int)Double.parseDouble(transferencias.getString("Posición", "")), Double.parseDouble(transferencias.getString("Año seleccionado", "")));
							listaestado.set((int)Double.parseDouble(transferencias.getString("Posición", "")), transferencias.getString("Estado", ""));
							comentarios.set((int)Double.parseDouble(transferencias.getString("Posición", "")), transferencias.getString("Comentario", ""));
							horadesde.set((int)Double.parseDouble(transferencias.getString("Posición", "")), Double.parseDouble(transferencias.getString("Hora desde", "")));
							horahasta.set((int)Double.parseDouble(transferencias.getString("Posición", "")), Double.parseDouble(transferencias.getString("Hora hasta", "")));
							horarioseleccionado.set((int)Double.parseDouble(transferencias.getString("Posición", "")), transferencias.getString("Horario seleccionado", ""));
							if (transferencias.getString("Horario seleccionado", "").equals("No")) {
								
							}
							else {
								
							}
							registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Sustituido. Día de la semana: ".concat(transferencias.getString("Día de la semana seleccionado", "").concat(". Fecha seleccionada: ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", "").concat(". Fecha encontrada: ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat(". Comentario: ".concat(transferencias.getString("Comentario", "").concat(". Posición: ".concat(transferencias.getString("Posición", "").concat("/".concat(String.valueOf((long)(listadia.size())).concat(""))))))))))))))))))))))));
							SketchwareUtil.showMessage(getApplicationContext(), "Sustituido");
							transferencias.edit().putString("Cambiado1", "No").commit();
						}
					});
					aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
				}
				else {
					//guardar evento
					listadia.add(Double.valueOf(Double.parseDouble(transferencias.getString("Día seleccionado", ""))));
					listames.add(Double.valueOf(Double.parseDouble(transferencias.getString("Mes seleccionado", ""))));
					listaano.add(Double.valueOf(Double.parseDouble(transferencias.getString("Año seleccionado", ""))));
					listaestado.add(transferencias.getString("Estado", ""));
					comentarios.add(transferencias.getString("Comentario", ""));
					horadesde.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora desde", ""))));
					horahasta.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora hasta", ""))));
					horarioseleccionado.add(transferencias.getString("Horario seleccionado", ""));
					if (transferencias.getString("Horario seleccionado", "").equals("No")) {
						
					}
					else {
						
					}
					SketchwareUtil.showMessage(getApplicationContext(), "Guardado");
					transferencias.edit().putString("Cambiado1", "No").commit();
					registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Guardado. Día de la semana: ".concat(transferencias.getString("Día de la semana seleccionado", "").concat(". Fecha seleccionada: ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", "").concat(". Fecha encontrada: ".concat(String.valueOf((long)(listadia.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(". Comentario: ".concat(transferencias.getString("Comentario", "").concat(". Posición: ".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(listadia.size())).concat(""))))))))))))))))))))))));
				}
				opciones.setVisibility(View.VISIBLE);
				borrarevento.setVisibility(View.VISIBLE);
				transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Datos guardados en matrices. Avisos: ".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat("")))))).commit();
				_actualizarregistroreciente();
			}
		});
		
		button50.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Mostrar opción", "Editar").commit();
				_mostraropcion();
			}
		});
		
		botonbuscar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (listadia.size() > 0) {
					transferencias.edit().putString("Mostrar opción", "Cargar").commit();
					_mostraropcion();
					transferencias.edit().putString("Buscando", "Si").commit();
					contadorbuscar = 0;
					listatemporal.clear();
					diasseleccionados.clear();
					diaencontrado.clear();
					mesencontrado.clear();
					anoencontrado.clear();
					fechasencontradas.clear();
					transferencias.edit().putString("Criterio de búsqueda", "No").commit();
					transferencias.edit().putString("Comentario encontrado", "No").commit();
					transferencias.edit().putString("Estado encontrado", "No").commit();
					transferencias.edit().putString("Encontrado", "No").commit();
					if (transferencias.getString("Comentario", "").equals("")) {
						transferencias.edit().putString("Filtro comentario", "No").commit();
					}
					else {
						transferencias.edit().putString("Criterio de búsqueda", "Si").commit();
						transferencias.edit().putString("Filtro comentario", "Si").commit();
					}
					if (transferencias.getString("Estado", "").equals("Seleccione tipo de suceso")) {
						transferencias.edit().putString("Filtro estado", "No").commit();
					}
					else {
						transferencias.edit().putString("Criterio de búsqueda", "Si").commit();
						transferencias.edit().putString("Filtro estado", "Si").commit();
					}
					//buscar en base a todos los criterios 
					contadorbuscar = 0;
					for(int _repeat293 = 0; _repeat293 < (int)(listadia.size()); _repeat293++) {
						if (contadorbuscar < listadia.size()) {
							transferencias.edit().putString("Encontrado", "No").commit();
							transferencias.edit().putString("Método", "1").commit();
							if (transferencias.getString("Método", "").equals("2")) {
								transferencias.edit().putString("Encontrado", "No").commit();
								if (transferencias.getString("Filtro", "").equals("No")) {
									transferencias.edit().putString("Encontrado", "Si").commit();
								}
								else {
									if (transferencias.getString("Filtro comentario", "").equals("Si")) {
										if (comentarios.get((int)(contadorbuscar)).contains(transferencias.getString("Comentario", ""))) {
											transferencias.edit().putString("Comentario encontrado", "Si").commit();
										}
										else {
											
										}
									}
									else {
										
									}
								}
							}
							else {
								
							}
							if (transferencias.getString("Criterio de búsqueda", "").equals("Si")) {
								if (transferencias.getString("Filtro comentario", "").equals("Si")) {
									if (comentarios.get((int)(contadorbuscar)).contains(transferencias.getString("Comentario", ""))) {
										transferencias.edit().putString("Comentario encontrado", "Si").commit();
									}
									else {
										
									}
								}
								else {
									
								}
								if (transferencias.getString("Filtro estado", "").equals("Si")) {
									if (listaestado.get((int)(contadorbuscar)).contains(transferencias.getString("Estado", ""))) {
										transferencias.edit().putString("Estado encontrado", "Si").commit();
									}
									else {
										
									}
								}
								else {
									
								}
								//perfeccionar filtro 
								if (transferencias.getString("Estado encontrado", "").equals("Si")) {
									transferencias.edit().putString("Encontrado", "Si").commit();
								}
								else {
									transferencias.edit().putString("Encontrado", "No").commit();
								}
								if (transferencias.getString("Comentario encontrado", "").equals("Si")) {
									transferencias.edit().putString("Encontrado", "Si").commit();
								}
								else {
									transferencias.edit().putString("Encontrado", "No").commit();
								}
								if (transferencias.getString("Encontrado", "").contains("Si")) {
									diaencontrado.add(Double.valueOf(contadorbuscar));
									mesencontrado.add(Double.valueOf(contadorbuscar));
									anoencontrado.add(Double.valueOf(contadorbuscar));
									fechasencontradas.add(String.valueOf((long)(listadia.get((int)(contadorbuscar)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contadorbuscar)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contadorbuscar)).doubleValue())))))));
									
									if ((listadia.get((int)(contadorbuscar)).doubleValue() == Double.parseDouble(transferencias.getString("Día seleccionado", ""))) && ((listames.get((int)(contadorbuscar)).doubleValue() == Double.parseDouble(transferencias.getString("Mes seleccionado", ""))) && (listaano.get((int)(contadorbuscar)).doubleValue() == Double.parseDouble(transferencias.getString("Año seleccionado", ""))))) {
										
									}
									else {
										
									}
								}
								else {
									
								}
							}
							else {
								diaencontrado.add(Double.valueOf(contadorbuscar));
								mesencontrado.add(Double.valueOf(contadorbuscar));
								anoencontrado.add(Double.valueOf(contadorbuscar));
								fechasencontradas.add(String.valueOf((long)(listadia.get((int)(contadorbuscar)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contadorbuscar)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contadorbuscar)).doubleValue())))))));
								
								if ((listadia.get((int)(contadorbuscar)).doubleValue() == Double.parseDouble(transferencias.getString("Día seleccionado", ""))) && ((listames.get((int)(contadorbuscar)).doubleValue() == Double.parseDouble(transferencias.getString("Mes seleccionado", ""))) && (listaano.get((int)(contadorbuscar)).doubleValue() == Double.parseDouble(transferencias.getString("Año seleccionado", ""))))) {
									
								}
								else {
									
								}
							}
						}
						else {
							
						}
						contadorbuscar++;
					}
					registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Buscando. Criterios: ".concat(transferencias.getString("Criterio de búsqueda", "").concat(". Criterio comentario: ".concat(transferencias.getString("Filtro comentario", "").concat(". Fechas encontradas: ".concat(String.valueOf((long)(fechasencontradas.size())).concat("".concat("".concat(""))))))))))));
					if (diaencontrado.size() > 0) {
						spinnerbusqueda.setVisibility(View.VISIBLE);
						separadorbuscar1.setVisibility(View.VISIBLE);
						contadorbuscar = 0;
						spinnerbusqueda.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, fechasencontradas));
						((ArrayAdapter)spinnerbusqueda.getAdapter()).notifyDataSetChanged();
						registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Búsqueda. Encontrados: ".concat(String.valueOf((long)(diaencontrado.size())).concat(". Criterios de búsqueda: ".concat(transferencias.getString("Criterios de búsqueda", "").concat("".concat("")))))))));
						if (diaencontrado.size() > 1) {
							registroizquierda.setVisibility(View.VISIBLE);
							registroderecha.setVisibility(View.VISIBLE);
						}
						else {
							registroizquierda.setVisibility(View.GONE);
							registroderecha.setVisibility(View.GONE);
							aviso.setTitle("Aplicaciones");
							aviso.setMessage("Fechas = ".concat(String.valueOf((long)(diaencontrado.size())).concat(". Ocultar botones".concat(""))));
							aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							aviso.create().show();
						}
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Método", "").equals("2")) {
							spinnerbusqueda.setVisibility(View.VISIBLE);
							borrarevento.setVisibility(View.VISIBLE);
						}
						else {
							
						}
						separadorbuscar1.setText("".concat(String.valueOf((long)(contadorbuscar + 1)).concat("/".concat(String.valueOf((long)(diaencontrado.size())).concat("")))));
						spinnerbusqueda.setSelection((int)(contadorbuscar));
						//buscar fecha actual o futura 
						contador = 0;
						for(int _repeat1169 = 0; _repeat1169 < (int)(diaencontrado.size()); _repeat1169++) {
							if (contador1 < diaencontrado.size()) {
								if ((anoencontrado.get((int)(contador1)).doubleValue() == Double.parseDouble(transferencias.getString("Año", ""))) || (0 > 0)) {
									
								}
								else {
									
								}
							}
							else {
								
							}
							contador1++;
						}
						transferencias.edit().putString("Día seleccionado", String.valueOf((long)(diaencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
						transferencias.edit().putString("Mes seleccionado", String.valueOf((long)(mesencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
						transferencias.edit().putString("Año seleccionado", String.valueOf((long)(anoencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
						_comprobarfecha();
						//
					}
					else {
						separadorbuscar1.setText("Buscar. Fechas encontradas: ".concat(String.valueOf((long)(diaencontrado.size())).concat("")));
						registroizquierda.setVisibility(View.GONE);
						registroderecha.setVisibility(View.GONE);
						spinnerbusqueda.setVisibility(View.GONE);
					}
					transferencias.edit().putString("Mostrar opción", "Buscar").commit();
					_mostraropcion();
					_actualizarregistro();
					transferencias.edit().putString("Buscando", "No").commit();
				}
				else {
					
				}
			}
		});
		
		button52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button53.setVisibility(View.VISIBLE);
				transferencias.edit().putString("Copia estado", transferencias.getString("Estado", "")).commit();
				transferencias.edit().putString("Copia comentario", transferencias.getString("Comentario", "")).commit();
				transferencias.edit().putString("Copia hora desde", transferencias.getString("Hora desde", "")).commit();
				transferencias.edit().putString("Copia hora hasta", transferencias.getString("Hora hasta", "")).commit();
				transferencias.edit().putString("Copia hora hasta", transferencias.getString("Hora hasta", "")).commit();
				transferencias.edit().putString("Copia horario seleccionado", transferencias.getString("Horario seleccionado", "")).commit();
				registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Copiado en memoria registro de fecha: ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", "").concat("".concat("".concat(""))))))))))))));
				registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Estado: ".concat(transferencias.getString("Copia estado", "").concat(""))))));
				registro.add(transferencias.getString("Fecha completa", "").concat(" Comentario: ".concat(transferencias.getString("Copia comentario", "").concat(""))));
				registro.add(transferencias.getString("Fecha completa", "").concat(" Desde ".concat(transferencias.getString("Copia hora desde", "").concat(" A ".concat(transferencias.getString("Copia hora hasta", "").concat(""))))));
				registro.add(transferencias.getString("Fecha completa", "").concat(" Horario seleccionado ".concat(transferencias.getString("Copia horario seleccionado", "").concat(" A ".concat(transferencias.getString("Copia hora hasta", "").concat(""))))));
				_actualizarregistro();
			}
		});
		
		button53.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Encontrado", "No").commit();
				contador = 0;
				for(int _repeat60 = 0; _repeat60 < (int)(listadia.size()); _repeat60++) {
					if (contador < listadia.size()) {
						if ((listadia.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Día seleccionado", ""))) && ((listames.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Mes seleccionado", ""))) && (listaano.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Año seleccionado", ""))))) {
							transferencias.edit().putString("Posición", String.valueOf((long)(contador))).commit();
							transferencias.edit().putString("Encontrado", "Si").commit();
							break;
						}
						else {
							
						}
					}
					else {
						
					}
					contador++;
				}
				if (transferencias.getString("Encontrado", "").equals("Si")) {
					aviso.setTitle("¿Sustituir este registro con estos datos? ");
					aviso.setMessage(transferencias.getString("Copia estado", "").concat("\n".concat(transferencias.getString("Copia hora desde", "").concat(" A ".concat(transferencias.getString("Copia hora hasta", "").concat("\n".concat(transferencias.getString("Copia comentario", "").concat("".concat("")))))))));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							listadia.set((int)Double.parseDouble(transferencias.getString("Posición", "")), Double.parseDouble(transferencias.getString("Día seleccionado", "")));
							listames.set((int)Double.parseDouble(transferencias.getString("Posición", "")), Double.parseDouble(transferencias.getString("Mes seleccionado", "")));
							listaano.set((int)Double.parseDouble(transferencias.getString("Posición", "")), Double.parseDouble(transferencias.getString("Año seleccionado", "")));
							listaestado.set((int)Double.parseDouble(transferencias.getString("Posición", "")), transferencias.getString("Copia estado", ""));
							comentarios.set((int)Double.parseDouble(transferencias.getString("Posición", "")), transferencias.getString("Copia comentario", ""));
							horadesde.set((int)Double.parseDouble(transferencias.getString("Posición", "")), Double.parseDouble(transferencias.getString("Copia hora desde", "")));
							horahasta.set((int)Double.parseDouble(transferencias.getString("Posición", "")), Double.parseDouble(transferencias.getString("Copia hora hasta", "")));
							horarioseleccionado.set((int)Double.parseDouble(transferencias.getString("Posición", "")), transferencias.getString("Copia horario seleccionado", ""));
							registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Copiar. Sustituido registro ".concat(String.valueOf((long)(listadia.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(" por ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", "").concat("".concat("".concat("".concat("")))))))))))))))))));
						}
					});
					aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
				}
				else {
					listadia.add(Double.valueOf(Double.parseDouble(transferencias.getString("Día seleccionado", ""))));
					listames.add(Double.valueOf(Double.parseDouble(transferencias.getString("Mes seleccionado", ""))));
					listaano.add(Double.valueOf(Double.parseDouble(transferencias.getString("Año seleccionado", ""))));
					listaestado.add(transferencias.getString("Copia estado", ""));
					comentarios.add(transferencias.getString("Copia comentario", ""));
					horadesde.add(Double.valueOf(Double.parseDouble(transferencias.getString("Copia hora desde", ""))));
					horahasta.add(Double.valueOf(Double.parseDouble(transferencias.getString("Copia hora hasta", ""))));
					horarioseleccionado.add(transferencias.getString("Copia horario seleccionado", ""));
					registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Copiar. Copiado registro ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", "").concat("".concat("".concat("".concat("")))))))))))));
				}
				temporizador = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_comprobarfecha();
								registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(" Comprobar nuevos datos de fecha ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", "").concat("".concat("".concat("".concat("")))))))))))));
								_actualizarregistro();
								temporizador.cancel();
							}
						});
					}
				};
				_timer.schedule(temporizador, (int)(1000));
			}
		});
		
		borrarevento.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (transferencias.getString("Búsqueda", "").equals("Si")) {
					transferencias.edit().putString("Búsqueda", "No").commit();
					registroizquierda.setVisibility(View.GONE);
					registroderecha.setVisibility(View.GONE);
					textobusqueda.setVisibility(View.GONE);
				}
				else {
					if (transferencias.getString("Encontrado", "").equals("Si")) {
						aviso.setTitle("¿Borrar ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("? ")))))));
						aviso.setMessage("".concat("".concat("".concat(""))));
						aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								listadia.remove((int)(Double.parseDouble(transferencias.getString("Posición", ""))));
								listames.remove((int)(Double.parseDouble(transferencias.getString("Posición", ""))));
								listaano.remove((int)(Double.parseDouble(transferencias.getString("Posición", ""))));
								listaestado.remove((int)(Double.parseDouble(transferencias.getString("Posición", ""))));
								comentarios.remove((int)(Double.parseDouble(transferencias.getString("Posición", ""))));
								horadesde.remove((int)(Double.parseDouble(transferencias.getString("Posición", ""))));
								horahasta.remove((int)(Double.parseDouble(transferencias.getString("Posición", ""))));
								registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Borrada fecha seleccionada (".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat(") "))))))))));
								if (fechasencontradas.size() > 0) {
									contador = 0;
									for(int _repeat51 = 0; _repeat51 < (int)(fechasencontradas.size()); _repeat51++) {
										if (contador < fechasencontradas.size()) {
											if (String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())))))).equals(fechasencontradas.get((int)(contador)))) {
												registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Borrada fecha encontrada (".concat(fechasencontradas.get((int)(contador)).concat(") "))))));
												fechasencontradas.remove((int)(contador));
												spinnerbusqueda.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, fechasencontradas));
												((ArrayAdapter)spinnerbusqueda.getAdapter()).notifyDataSetChanged();
												_comprobarfecha();
												break;
											}
											else {
												
											}
										}
										else {
											
										}
										contador++;
									}
								}
								else {
									
								}
							}
						});
						aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						aviso.create().show();
						SketchwareUtil.showMessage(getApplicationContext(), "Borrado");
						_actualizarregistro();
					}
					else {
						aviso.setTitle("No existe evento en fecha ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("")))))));
						aviso.setMessage("".concat("".concat("".concat(""))));
						aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						aviso.create().show();
					}
				}
			}
		});
		
		button63.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				aviso.setTitle("¿Está segur@ de que quiere borrar todos los eventos?. ");
				aviso.setMessage("Este proceso también borrará los criterios de aviso y no será permanente hasta que guarde el archivo. Si desea restaurar los datos, reinicie la aplicación. ".concat("".concat("".concat(""))));
				aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_fechayhora();
						SketchwareUtil.showMessage(getApplicationContext(), "Todos los eventos borrados.");
						lineas.clear();
						listabuscar.clear();
						listadia.clear();
						listames.clear();
						listaano.clear();
						estado.clear();
						comentarios.clear();
						listaestado.clear();
						horadesde.clear();
						horahasta.clear();
						listanombrehorario.clear();
						nombrehorariopersonalizado.clear();
						horadesdepersonalizado.clear();
						horahastapersonalizado.clear();
						horarioseleccionado.clear();
						listacriterios.clear();
						listanombrecriterios.clear();
						avisodia.clear();
						avisomes.clear();
						avisoano.clear();
						listaavisoseventospersonalizados.clear();
						listaavisosmomentospersonalizados.clear();
						listaavisosformaspersonalizadas.clear();
						listaavisosfiltrospersonalizados.clear();
						avisoseventostemporal.clear();
						avisosmomentostemporal.clear();
						avisosformastemporal.clear();
						avisosfiltrotemporal.clear();
						avisosfiltrotemporal.add("No");
						avisoaudiotemporal.add("No");
						botonguardarcalendario.setVisibility(View.VISIBLE);
						borrarevento.setVisibility(View.GONE);
						button63.setVisibility(View.GONE);
						textobusqueda.setText("No hay eventos. ");
						separadoravisos.setText("No hay avisos");
						transferencias.edit().putString("Dato", "Todos los eventos borrados por el usuario el ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" a las ".concat(transferencias.getString("Hora", "").concat(":".concat(transferencias.getString("Minuto", "").concat(":".concat(transferencias.getString("Segundo", "").concat("\n(Fin)"))))))))))))).commit();
						transferencias.edit().putString("Cambiado1", "Si").commit();
					}
				});
				aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				aviso.create().show();
			}
		});
		
		button61.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_fechayhora();
				temporizador = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								String diaTexto = transferencias.getString("Día", "0");
								String mesTexto = transferencias.getString("Mes", "0");
								String anoTexto = transferencias.getString("Año", "0");
								
								int actualizardia = Integer.parseInt(diaTexto);
								int actualizarmes = Integer.parseInt(mesTexto) - 1;
								int actualizarano = Integer.parseInt(anoTexto);
								
								datepicker2.updateDate(actualizarano, actualizarmes, actualizardia);
							}
						});
					}
				};
				_timer.schedule(temporizador, (int)(1));
			}
		});
		
		button62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				//teóricamente reduce el nombre del archivo si es demasiado largo 
				
				// Longitud máxima permitida para el nombre base
				int maxNameLength = 20;
				
				// Crear el nombre del archivo
				String nombreBase = nombre.getText().toString();
				String nombreBaseTruncado = nombreBase.length() > maxNameLength ? nombreBase.substring(0, maxNameLength) : nombreBase;
				
				String nuevoNombre = nombreBaseTruncado + "-" +
				        transferencias.getString("Año", "") + // Proporciona una cadena vacía como valor predeterminado si "Año" no existe
				        transferencias.getString("Mes", "") +  // Proporciona una cadena vacía como valor predeterminado si "Mes" no existe
				        transferencias.getString("Día", "") +  // Proporciona una cadena vacía como valor predeterminado si "Día" no existe
				        "_" +
				        transferencias.getString("Hora", "") +  // Proporciona una cadena vacía como valor predeterminado si "Hora" no existe
				        transferencias.getString("Minuto", "") + // Proporciona una cadena vacía como valor predeterminado si "Minuto" no existe
				        transferencias.getString("Segundo", "") + ".txt"; // Proporciona una cadena vacía como valor predeterminado si "Segundo" no existe
				
				
				_fechayhora();
				FileUtil.copyFile(transferencias.getString("Ruta fichero", "").concat("/".concat(nombre.getText().toString().concat(".txt"))), transferencias.getString("Ruta copias", "").concat("/".concat(nombre.getText().toString().concat("-".concat(transferencias.getString("Hora", "").concat("_".concat(transferencias.getString("Minuto", "").concat("_".concat(transferencias.getString("Segundo", "").concat(" ".concat(transferencias.getString("Día", "").concat("_".concat(transferencias.getString("Mes", "").concat("_".concat(transferencias.getString("Año", "").concat(".txt"))))))))))))))));
				if (FileUtil.isExistFile(transferencias.getString("Ruta copias", "").concat("/".concat(nombre.getText().toString().concat("-".concat(transferencias.getString("Hora", "").concat("_".concat(transferencias.getString("Minuto", "").concat("_".concat(transferencias.getString("Segundo", "").concat(" ".concat(transferencias.getString("Día", "").concat("_".concat(transferencias.getString("Mes", "").concat("_".concat(transferencias.getString("Año", "").concat(".txt"))))))))))))))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "Copiado el archivo (".concat(transferencias.getString("Ruta fichero", "").concat("/".concat(nombre.getText().toString().concat(".txt) en la carpeta (".concat(transferencias.getString("Ruta copias", "").concat("/".concat(nombre.getText().toString().concat("-".concat(transferencias.getString("Hora", "").concat("_".concat(transferencias.getString("Minuto", "").concat("_".concat(transferencias.getString("Segundo", "").concat(" ".concat(transferencias.getString("Día", "").concat("_".concat(transferencias.getString("Mes", "").concat("_".concat(transferencias.getString("Año", "").concat(".txt")))))))))))))))))))));
				}
				else {
					aviso.setTitle("Error");
					aviso.setMessage("No ha sido posible copiar el archivo (".concat(transferencias.getString("Ruta fichero", "").concat("/".concat(nombre.getText().toString().concat(".txt) en la carpeta (".concat(transferencias.getString("Ruta copias", "").concat("/".concat(nombre.getText().toString().concat("-".concat(transferencias.getString("Hora", "").concat("_".concat(transferencias.getString("Minuto", "").concat("_".concat(transferencias.getString("Segundo", "").concat(" ".concat(transferencias.getString("Día", "").concat("_".concat(transferencias.getString("Mes", "").concat("_".concat(transferencias.getString("Año", "").concat(".txt")))))))))))))))))))));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
				}
			}
		});
		
		button49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				botonguardarcalendario.setVisibility(View.VISIBLE);
				tiposuceso.setSelection((int)(0));
				comentario.setText("");
				cuadrohorario.setVisibility(View.GONE);
				personalizado1.setVisibility(View.GONE);
			}
		});
		
		horizontal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Horizontal");
			}
		});
		
		buscarlista.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Opciones");
			}
		});
		
		principal1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Principal 1");
			}
		});
		
		seccioncalendario.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Sección calendario ");
			}
		});
		
		editar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Editar ");
			}
		});
		
		configuracion.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Configuración ");
			}
		});
		
		cuadroeditar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Edición");
			}
		});
		
		general.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Sección 2");
			}
		});
		
		linearregistro.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Registro");
			}
		});
		
		alarma.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Sección 3");
			}
		});
		
		buscarporlista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				transferencias.edit().putString("Texto seleccionado", lineas.get((int)(_position))).commit();
				aviso.setTitle("Frase ".concat(""));
				aviso.setMessage(lineas.get((int)(_position)).concat("".concat("".concat(""))));
				aviso.setPositiveButton("Modificar", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						//ventana para cambiar texto
					}
				});
				aviso.setNeutralButton("Copiar", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						transferencias.edit().putString("Copiar", lineas.get((int)(_position))).commit();
						_copiar();
					}
				});
				aviso.setNegativeButton("Cerrar", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				aviso.create().show();
			}
		});
		
		button35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ocultarsecciones();
				if (transferencias.getString("Sección", "").equals("Editar")) {
					cuadroedicion.setVisibility(View.VISIBLE);
				}
				else {
					
				}
				if (transferencias.getString("Sección", "").equals("Notas")) {
					principal1.setVisibility(View.VISIBLE);
				}
				else {
					
				}
				transferencias.edit().putString("Texto seleccionado", "").commit();
			}
		});
		
		guardarbuscar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ocultarsecciones();
				cuadroeditar.setVisibility(View.VISIBLE);
				transferencias.edit().putString("Nota", "Recargar").commit();
				_configurarnotas();
			}
		});
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				nombrenota = listanotas.get((int)(_position));
				if (nombrenota.equals("No hay notas")) {
					transferencias.edit().putString("Nombre nota", listanotas.get((int)(_position))).commit();
				}
				else {
					cargar = true;
					transferencias.edit().putString("Nota", "Cargar").commit();
					transferencias.edit().putString("Nombre nota", listanotas.get((int)(_position))).commit();
					transferencias.edit().putString("Editando", "Si").commit();
					transferencias.edit().putString("Importar", "No").commit();
					transferencias.edit().putString("Ruta ficheros", ruta.concat("/notas")).commit();
					transferencias.edit().putString("Sección", "Editar").commit();
					listview1.setStackFromBottom(true);
					_configurarnotas();
				}
			}
		});
		
		tipocita.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		nombrehorario.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		personalizado1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				transferencias.edit().putString("Horario seleccionado", listanombrehorario.get((int)(_position))).commit();
				if (listanombrehorario.size() > 0) {
					_comprobarhorarioseleccionado();
				}
				else {
					
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		Calendar _calendar = Calendar.getInstance();
		datepicker2.init(_calendar.get(Calendar.YEAR), _calendar.get(Calendar.MONTH), _calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
			@Override
			public void onDateChanged(DatePicker _datePicker, int _year, int _month, int _day) {
				transferencias.edit().putString("Día seleccionado", String.valueOf((long)(_day))).commit();
				transferencias.edit().putString("Mes seleccionado", String.valueOf((long)(_month + 1))).commit();
				transferencias.edit().putString("Año seleccionado", String.valueOf((long)(_year))).commit();
				try {
						String input_date=transferencias.getString("Año", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Día", ""))))); 
						
						SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
						
						Date dt1=format1.parse(input_date); 
						
						DateFormat format2=new SimpleDateFormat("EEEE");
						
						format2.setLenient(false);
						
						String finalDay= format2.format(dt1);
					
					transferencias.edit().putString("Día de la semana seleccionado", finalDay).commit();
					
				} catch (java.text.ParseException e) {
						SketchwareUtil.showMessage(getApplicationContext(), "Something went wrong! ");
				}
				//Calendar calendar = Calendar.getInstance();
				int diaseleccionado = _day;
				int messeleccionado = _month;
				int anoseleccionado = _year;
				calendario.set(anoseleccionado, messeleccionado, diaseleccionado);
				diasemana = calendario.get(Calendar.DAY_OF_WEEK);
				diasemana--;
				transferencias.edit().putString("Día de la semana seleccionado", String.valueOf((long)(diasemana))).commit();
				//Cambiar resto de datos si se cambia de fecha
				//fin 
				if (transferencias.getString("Último día", "").equals(transferencias.getString("Día seccionado", ""))) {
					
				}
				else {
					
				}
				operarmes = Double.parseDouble(transferencias.getString("Mes seleccionado", ""));
				int m = (int) operarmes;
				m = m-1;
				calendario.set(Calendar.MONTH, m);
				diasmes = calendario.getActualMaximum(Calendar.DATE);
				registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Fecha seleccionada ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", "").concat(". Días del mes: ".concat(String.valueOf((long)(diasmes)).concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat("")))))))))))))))))))));
				if (transferencias.getString("Fecha", "").equals("Comprobar")) {
					if (transferencias.getString("Cambiado1", "").equals("Si")) {
						aviso.setTitle("Registro cambiado");
						aviso.setMessage("Si comprueba la fecha seleccionada se perderán los datos modificados. ¿Continuar? ".concat("".concat("".concat(""))));
						aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								transferencias.edit().putString("Cambiado1", "No").commit();
								_comprobarfecha();
							}
						});
						aviso.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						aviso.create().show();
					}
					else {
						_comprobarfecha();
					}
				}
				else {
					
				}
				if (transferencias.getString("Fecha", "").equals("Seleccionar días del mes")) {
					//hay que usar al menos dos matrices porque si se usa solo una da error o la matriz día guarda mal los datos 
					diasseleccionados.add(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))));
					if (transferencias.getString("Seleccionar", "").equals("Excepto días")) {
						diaexcepcional.add(Double.valueOf(Double.parseDouble(transferencias.getString("Día seleccionado", ""))));
						mesexcepcional.add(Double.valueOf(Double.parseDouble(transferencias.getString("Mes seleccionado", ""))));
						anoexcepcional.add(Double.valueOf(Double.parseDouble(transferencias.getString("Año seleccionado", ""))));
						if (textoexceptodiasdelmes.getText().toString().equals("")) {
							textoexceptodiasdelmes.setText(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))));
						}
						else {
							textoexceptodiasdelmes.setText(textoexceptodiasdelmes.getText().toString().concat(", ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))))));
						}
					}
					else {
						
					}
					if (transferencias.getString("Seleccionar", "").equals("Solo días")) {
						listasolodia.add(Double.valueOf(Double.parseDouble(transferencias.getString("Día seleccionado", ""))));
						listasolomes.add(Double.valueOf(Double.parseDouble(transferencias.getString("Mes seleccionado", ""))));
						listasoloano.add(Double.valueOf(Double.parseDouble(transferencias.getString("Año seleccionado", ""))));
						if (textoexceptodiasdelmes.getText().toString().equals("")) {
							textoexceptodiasdelmes.setText(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))));
						}
						else {
							textoexceptodiasdelmes.setText(textoexceptodiasdelmes.getText().toString().concat(", ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))))));
						}
					}
					else {
						
					}
					if (transferencias.getString("Seleccionar", "").equals("Solo días para aviso")) {
						registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Seleccionar días solo para aviso".concat("".concat("".concat("")))))));
						avisodia.add(Double.valueOf(Double.parseDouble(transferencias.getString("Día seleccionado", ""))));
						avisomes.add(Double.valueOf(Double.parseDouble(transferencias.getString("Mes seleccionado", ""))));
						avisoano.add(Double.valueOf(Double.parseDouble(transferencias.getString("Año seleccionado", ""))));
						if (avisoevento.size() > 0) {
							contador1 = 0;
							for(int _repeat1899 = 0; _repeat1899 < (int)(avisoevento.size()); _repeat1899++) {
								if (contador1 < avisoevento.size()) {
									if (transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))).equals(avisoevento.get((int)(contador1)))) {
										break;
									}
									else {
										
									}
								}
								else {
									
								}
								contador1++;
							}
							if (contador1 == avisoevento.size()) {
								avisoevento.add(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))));
								spinneravisoeventos.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoevento));
								((ArrayAdapter)spinneravisoeventos.getAdapter()).notifyDataSetChanged();
								spinneravisoeventos.setSelection((int)(avisoevento.size() - 1));
								if (cuadroeventosaviso.getVisibility() == View.GONE) {
									cuadroeventosaviso.setVisibility(View.VISIBLE);
								}
								else {
									
								}
								transferencias.edit().putString("Método", "1").commit();
								if (transferencias.getString("Método", "").equals("2")) {
									if (textofechasaviso.getText().toString().equals("")) {
										textofechasaviso.setText(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))));
									}
									else {
										textofechasaviso.setText(textofechasaviso.getText().toString().concat(", ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))))));
									}
								}
								else {
									
								}
							}
							else {
								aviso.setTitle("Fecha (".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", "").concat(") repetida".concat(""))))))));
								aviso.setMessage("".concat("".concat("".concat(""))));
								aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
										
									}
								});
								aviso.create().show();
							}
						}
						else {
							avisoevento.add(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))));
							spinneravisoeventos.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoevento));
							((ArrayAdapter)spinneravisoeventos.getAdapter()).notifyDataSetChanged();
							spinneravisoeventos.setSelection((int)(avisoevento.size() - 1));
							if (cuadroeventosaviso.getVisibility() == View.GONE) {
								cuadroeventosaviso.setVisibility(View.VISIBLE);
							}
							else {
								
							}
						}
					}
					else {
						
					}
				}
				else {
					
				}
				aviso.setTitle("Aplicaciones");
				aviso.setMessage("".concat(transferencias.getString("Fecha", "").concat("\n".concat(transferencias.getString("Seleccionar", "")))));
				aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				_actualizarregistro();
			}
		});
		
		datepicker2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		botonfinseleccion.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Fecha", "Comprobar").commit();
				botonfinseleccion.setVisibility(View.GONE);
				transferencias.edit().putString("Seleccionar", "No").commit();
				eventosseleccionados.setChecked(false);
			}
		});
		
		opciones.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (listadia.size() > 0) {
						separadorcalendario25.setVisibility(View.VISIBLE);
						checkcopiar.setVisibility(View.VISIBLE);
						sustituir.setVisibility(View.VISIBLE);
						filtro.setVisibility(View.VISIBLE);
					}
					else {
						
					}
					botonbuscar.setVisibility(View.VISIBLE);
					avisoeventos.setVisibility(View.VISIBLE);
					cuadroaviso.setVisibility(View.VISIBLE);
				}
				else {
					separadorcalendario25.setVisibility(View.GONE);
					checkcopiar.setVisibility(View.GONE);
					sustituir.setVisibility(View.GONE);
					filtro.setVisibility(View.GONE);
					excepciones.setVisibility(View.GONE);
					excepciones1.setVisibility(View.GONE);
					domingo.setVisibility(View.GONE);
					botonbuscar.setVisibility(View.GONE);
					botonbuscar.setVisibility(View.GONE);
					avisoeventos.setVisibility(View.GONE);
					cuadrocriteriosgenerales.setVisibility(View.GONE);
					cuadroaviso.setVisibility(View.GONE);
				}
			}
		});
		
		checkcopiar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					cuadrodesdehasta.setVisibility(View.VISIBLE);
				}
				else {
					cuadrodesdehasta.setVisibility(View.GONE);
				}
			}
		});
		
		separadorcalendario4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.equals("")) {
					
				}
				else {
					if (transferencias.getString("Enviar texto", "").equals("Dato introducido")) {
						
					}
					else {
						
					}
					if (transferencias.getString("Enviar texto", "").equals("Copiar desde fecha")) {
						slist.clear();
						str = separadorcalendario4.getText().toString();
						String [] arr = str.split("/");
						for (int i = 0; i < arr.length; i++) {
							slist.add(arr[i]);
						}
						
						//String str = "Hola/Mundo/!";
						//String[] partes = str.split("/");
						
						// Imprimir cada parte separada
						//for (int i = 0; i < partes.length; i++) {
						  //  System.out.println(partes[i]);
						//}
						
						transferencias.edit().putString("Copiar día desde", slist.get((int)(0))).commit();
						transferencias.edit().putString("Copiar mes desde", slist.get((int)(1))).commit();
						transferencias.edit().putString("Copiar año desde", slist.get((int)(2))).commit();
						button40.setText("Desde ".concat(slist.get((int)(0)).concat("/".concat(slist.get((int)(1)).concat("/".concat(slist.get((int)(2))))))));
					}
					else {
						
					}
					if (transferencias.getString("Enviar texto", "").equals("Copiar hasta fecha")) {
						slist.clear();
						str = separadorcalendario4.getText().toString();
						String [] arr = str.split("/");
						for (int i = 0; i < arr.length; i++) {
							slist.add(arr[i]);
						}
						
						//String str = "Hola/Mundo/!";
						//String[] partes = str.split("/");
						
						// Imprimir cada parte separada
						//for (int i = 0; i < partes.length; i++) {
						  //  System.out.println(partes[i]);
						//}
						
						_fechayhora();
						if (slist.size() > 2) {
							transferencias.edit().putString("Copiar día hasta", slist.get((int)(0))).commit();
							transferencias.edit().putString("Copiar mes hasta", slist.get((int)(1))).commit();
							transferencias.edit().putString("Copiar año hasta", slist.get((int)(2))).commit();
							button41.setText("Hasta ".concat(slist.get((int)(0)).concat("/".concat(slist.get((int)(1)).concat("/".concat(slist.get((int)(2))))))));
							aviso.setTitle("Copiar registro actual");
							aviso.setMessage("Desde ".concat(transferencias.getString("Copiar día desde", "").concat("/".concat(transferencias.getString("Copiar mes desde", "").concat("/".concat(transferencias.getString("Copiar año desde", "").concat("\nhasta ".concat(slist.get((int)(0)).concat("/".concat(slist.get((int)(1)).concat("/".concat(slist.get((int)(2)).concat("".concat(""))))))))))))));
							aviso.setPositiveButton("Si", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									transferencias.edit().putString("Mostrar opción", "Cargar").commit();
									_mostraropcion();
									continuar = true;
									contador = 0;
									transferencias.edit().putString("Primer mes ", "Si").commit();
									transferencias.edit().putString("Días", "0").commit();
									transferencias.edit().putString("Día", transferencias.getString("Copiar día desde", "")).commit();
									transferencias.edit().putString("Mes", transferencias.getString("Copiar mes desde", "")).commit();
									transferencias.edit().putString("Año", transferencias.getString("Copiar año desde", "")).commit();
									transferencias.edit().putString("Fechas", "0").commit();
									transferencias.edit().putString("Válido", "No").commit();
									transferencias.edit().putString("Día de la semana", new SimpleDateFormat("EEEE").format(calendario.getTime())).commit();
									//Comprobar si la fecha de origen menor que la de destino
									if (Double.parseDouble(transferencias.getString("Copiar año desde", "")) == Double.parseDouble(transferencias.getString("Copiar año hasta", ""))) {
										if (Double.parseDouble(transferencias.getString("Copiar mes desde", "")) == Double.parseDouble(transferencias.getString("Copiar mes hasta", ""))) {
											
										}
										else {
											
										}
									}
									else {
										
									}
									//
									transferencias.edit().putString("Fechas procesadas", "0").commit();
									transferencias.edit().putString("Fechas guardadas", "0").commit();
									temporizadorcargar = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													if (continuar) {
														transferencias.edit().putString("Fechas procesadas", String.valueOf((long)(Double.parseDouble(transferencias.getString("Días procesados", "")) + 1))).commit();
														//calcular mes 
														operarmes = Double.parseDouble(transferencias.getString("Mes", ""));
														int m1 = (int) operarmes;
														m1 = m1-1;
														calendario.set(Calendar.MONTH, m1);
														diasmes = calendario.getActualMaximum(Calendar.DATE);
														transferencias.edit().putString("Días", String.valueOf((long)(diasmes))).commit();
														registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(" Procesando fecha (".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(") ".concat(". Hasta fecha (".concat(transferencias.getString("Copiar día hasta", "").concat("/".concat(transferencias.getString("Copiar mes hasta", "").concat("/".concat(transferencias.getString("Copiar año hasta", "").concat("). ".concat(". Fechas procesadas: ".concat(transferencias.getString("Fechas procesadas", "").concat(". Fechas guardadas: ".concat(transferencias.getString("Fechas guardadas", "").concat(""))))))))))))))))))))));
														textocargar.setText(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(" Procesando fecha (".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(") ".concat(". Hasta fecha (".concat(transferencias.getString("Copiar día hasta", "").concat("/".concat(transferencias.getString("Copiar mes hasta", "").concat("/".concat(transferencias.getString("Copiar año hasta", "").concat("). ".concat(". Fechas procesadas: ".concat(transferencias.getString("Fechas procesadas", "").concat(". Fechas guardadas: ".concat(transferencias.getString("Fechas guardadas", "").concat(""))))))))))))))))))))));
														transferencias.edit().putString("Método", "1").commit();
														if (transferencias.getString("Método", "").equals("2")) {
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 1) {
																transferencias.edit().putString("Días", transferencias.getString("Enero", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 2) {
																transferencias.edit().putString("Días", transferencias.getString("Febrero", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 3) {
																transferencias.edit().putString("Días", transferencias.getString("Marzo", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 4) {
																transferencias.edit().putString("Días", transferencias.getString("Abril", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 5) {
																transferencias.edit().putString("Días", transferencias.getString("Mayo", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 6) {
																transferencias.edit().putString("Días", transferencias.getString("Junio", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 7) {
																transferencias.edit().putString("Días", transferencias.getString("Julio", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 8) {
																transferencias.edit().putString("Días", transferencias.getString("Agosto", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 9) {
																transferencias.edit().putString("Días", transferencias.getString("Septiembre", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 10) {
																transferencias.edit().putString("Días", transferencias.getString("Octubre", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 11) {
																transferencias.edit().putString("Días", transferencias.getString("Noviembre", "")).commit();
															}
															else {
																
															}
															if (Double.parseDouble(transferencias.getString("Mes", "")) == 12) {
																transferencias.edit().putString("Días", transferencias.getString("Diciembre", "")).commit();
															}
															else {
																
															}
															//fin 
														}
														else {
															
														}
														transferencias.edit().putString("Encontrado", "No").commit();
														//Comprobar si existe 
														contador = 0;
														for(int _repeat262 = 0; _repeat262 < (int)(listadia.size()); _repeat262++) {
															if (contador < listadia.size()) {
																if (Double.parseDouble(transferencias.getString("Día", "")) == listadia.get((int)(contador)).doubleValue()) {
																	if (Double.parseDouble(transferencias.getString("Mes", "")) == listames.get((int)(contador)).doubleValue()) {
																		if (Double.parseDouble(transferencias.getString("Año", "")) == listaano.get((int)(contador)).doubleValue()) {
																			transferencias.edit().putString("Encontrado", "Si").commit();
																			break;
																		}
																		else {
																			
																		}
																	}
																	else {
																		
																	}
																}
																else {
																	
																}
															}
															else {
																
															}
															contador++;
														}
														if (transferencias.getString("Filtro", "").equals("Si")) {
															transferencias.edit().putString("Copiar", "No").commit();
															if (solodiassemana.isChecked()) {
																//Obtener y organizar día de la semana 
																transferencias.edit().putString("Criterio día de la semana", "No").commit();
																operardia = Double.parseDouble(transferencias.getString("Día", ""));
																operarmes = Double.parseDouble(transferencias.getString("Mes", ""));
																operarano = Double.parseDouble(transferencias.getString("Año", ""));
																
																Calendar calendar = Calendar.getInstance();
																int d = (int) operardia;
																int m = (int) operarmes;
																int a = (int) operarano;
																calendario.set(a, m, d);
																diasemana = calendario.get(Calendar.DAY_OF_WEEK);
																
																
																if (diasemana == 7) {
																	transferencias.edit().putString("Día de la semana encontrado", "miércoles").commit();
																}
																else {
																	
																}
																if (diasemana == 1) {
																	transferencias.edit().putString("Día de la semana encontrado", "jueves").commit();
																}
																else {
																	
																}
																if (diasemana == 2) {
																	transferencias.edit().putString("Día de la semana encontrado", "viernes").commit();
																}
																else {
																	
																}
																if (diasemana == 3) {
																	transferencias.edit().putString("Día de la semana encontrado", "sábado").commit();
																}
																else {
																	
																}
																if (diasemana == 4) {
																	transferencias.edit().putString("Día de la semana encontrado", "domingo").commit();
																}
																else {
																	
																}
																if (diasemana == 5) {
																	transferencias.edit().putString("Día de la semana encontrado", "lunes").commit();
																}
																else {
																	
																}
																if (diasemana == 6) {
																	transferencias.edit().putString("Día de la semana encontrado", "martes").commit();
																}
																else {
																	
																}
																if (transferencias.getString("Criterio lunes", "").equals(transferencias.getString("Día de la semana encontrado", ""))) {
																	transferencias.edit().putString("Criterio día de la semana", "Si").commit();
																}
																else {
																	
																}
																if (transferencias.getString("Criterio martes", "").equals(transferencias.getString("Día de la semana encontrado", ""))) {
																	transferencias.edit().putString("Criterio día de la semana", "Si").commit();
																}
																else {
																	
																}
																if (transferencias.getString("Criterio miércoles", "").equals(transferencias.getString("Día de la semana encontrado", ""))) {
																	transferencias.edit().putString("Criterio día de la semana", "Si").commit();
																}
																else {
																	
																}
																if (transferencias.getString("Criterio jueves", "").equals(transferencias.getString("Día de la semana encontrado", ""))) {
																	transferencias.edit().putString("Criterio día de la semana", "Si").commit();
																}
																else {
																	
																}
																if (transferencias.getString("Criterio viernes", "").equals(transferencias.getString("Día de la semana encontrado", ""))) {
																	transferencias.edit().putString("Criterio día de la semana", "Si").commit();
																}
																else {
																	
																}
																if (transferencias.getString("Criterio sábado", "").equals(transferencias.getString("Día de la semana encontrado", ""))) {
																	transferencias.edit().putString("Criterio día de la semana", "Si").commit();
																}
																else {
																	
																}
																if (transferencias.getString("Criterio domingo", "").equals(transferencias.getString("Día de la semana encontrado", ""))) {
																	transferencias.edit().putString("Criterio día de la semana", "Si").commit();
																}
																else {
																	
																}
																if (lunes.isChecked()) {
																	
																}
																else {
																	
																}
																//fin 
															}
															else {
																
															}
															if (diasdelmesexcepcionales.isChecked()) {
																if (diaexcepcional.size() > 0) {
																	transferencias.edit().putString("Método", "1").commit();
																	if (transferencias.getString("Método", "").equals("1")) {
																		//buscar día excepcional 
																		transferencias.edit().putString("Día excepcional", "No").commit();
																		contador = 0;
																		for(int _repeat1424 = 0; _repeat1424 < (int)(diaexcepcional.size()); _repeat1424++) {
																			if (contador < diaexcepcional.size()) {
																				if (diaexcepcional.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Día", ""))) {
																					if (mesexcepcional.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Mes", ""))) {
																						if (anoexcepcional.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Año", ""))) {
																							transferencias.edit().putString("Día excepcional", "Si").commit();
																							registro.add(transferencias.getString("Fecha completa", "").concat(". Fecha excepcional seleccionada ".concat(String.valueOf((long)(diaexcepcional.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(mesexcepcional.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(anoexcepcional.get((int)(contador)).doubleValue())).concat(" = ".concat("Fecha calculada ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" Encontrado ".concat(transferencias.getString("Día excepcional", "").concat(" (".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(diaexcepcional.size())).concat(") ".concat(""))))))))))))))))))))));
																							break;
																						}
																						else {
																							
																						}
																					}
																					else {
																						
																					}
																				}
																				else {
																					
																				}
																			}
																			else {
																				
																			}
																			contador++;
																		}
																		//
																	}
																	else {
																		
																	}
																}
																else {
																	
																}
															}
															else {
																
															}
															if (solodias.isChecked()) {
																if (listasolodia.size() > 0) {
																	transferencias.edit().putString("Método", "1").commit();
																	if (transferencias.getString("Método", "").equals("1")) {
																		//buscar solo días seleccionados 
																		transferencias.edit().putString("Solo días", "No").commit();
																		contador = 0;
																		for(int _repeat3084 = 0; _repeat3084 < (int)(listasolodia.size()); _repeat3084++) {
																			if (contador < listasolodia.size()) {
																				if (listasolodia.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Día", ""))) {
																					if (listasolomes.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Mes", ""))) {
																						if (listasoloano.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Año", ""))) {
																							transferencias.edit().putString("Solo días", "Si").commit();
																							registro.add(transferencias.getString("Fecha completa", "").concat(". Día exclusivo ".concat(String.valueOf((long)(listasolodia.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listasolomes.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listasoloano.get((int)(contador)).doubleValue())).concat(" = ".concat("Fecha calculada ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" Encontrado ".concat(transferencias.getString("Solo día ", "").concat(" (".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(listasolodia.size())).concat(") ".concat(""))))))))))))))))))))));
																							break;
																						}
																						else {
																							
																						}
																					}
																					else {
																						
																					}
																				}
																				else {
																					
																				}
																			}
																			else {
																				
																			}
																			contador++;
																		}
																		//
																	}
																	else {
																		
																	}
																}
																else {
																	
																}
															}
															else {
																
															}
															if (transferencias.getString("Día excepcional", "").equals("Si")) {
																transferencias.edit().putString("Copiar", "No").commit();
															}
															else {
																transferencias.edit().putString("Copiar", "Si").commit();
																if (transferencias.getString("Criterio día de la semana", "").equals("Si")) {
																	transferencias.edit().putString("Copiar", "Si").commit();
																}
																else {
																	transferencias.edit().putString("Copiar", "No").commit();
																}
															}
															if (transferencias.getString("Solo días", "").equals("Si")) {
																transferencias.edit().putString("Copiar", "Si").commit();
															}
															else {
																
															}
															if (transferencias.getString("Copiar", "").equals("Si")) {
																transferencias.edit().putString("Fechas guardadas", String.valueOf((long)(Double.parseDouble(transferencias.getString("Fechas guardadas", "")) + 1))).commit();
																if (transferencias.getString("Encontrado", "").equals("Si")) {
																	if (transferencias.getString("Sustituir", "").equals("Si")) {
																		listadia.set((int)contador, Double.parseDouble(transferencias.getString("Día", "")));
																		listames.set((int)contador, Double.parseDouble(transferencias.getString("Mes", "")));
																		listaano.set((int)contador, Double.parseDouble(transferencias.getString("Año", "")));
																		listaestado.set((int)contador, transferencias.getString("Estado", ""));
																		comentarios.set((int)contador, transferencias.getString("Comentario", ""));
																		horadesde.set((int)contador, Double.parseDouble(transferencias.getString("Hora desde", "")));
																		horahasta.set((int)contador, Double.parseDouble(transferencias.getString("Hora hasta", "")));
																		horarioseleccionado.set((int)contador, transferencias.getString("Horario seleccionado", ""));
																		textocargar.setText(textocargar.getText().toString().concat(". Sustituida fecha ".concat(String.valueOf((long)(listadia.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat("".concat("".concat(" ".concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat(""))))))))))))))))));
																		registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Sustituido registro ".concat(String.valueOf((long)(listadia.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(" por ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" sin filtro".concat("".concat("".concat("")))))))))))))))))));
																	}
																	else {
																		
																	}
																}
																else {
																	listadia.add(Double.valueOf(Double.parseDouble(transferencias.getString("Día", ""))));
																	listames.add(Double.valueOf(Double.parseDouble(transferencias.getString("Mes", ""))));
																	listaano.add(Double.valueOf(Double.parseDouble(transferencias.getString("Año", ""))));
																	listaestado.add(transferencias.getString("Estado", ""));
																	comentarios.add(transferencias.getString("Comentario", ""));
																	horadesde.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora desde", ""))));
																	horahasta.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora hasta", ""))));
																	horarioseleccionado.add(transferencias.getString("Horario seleccionado", ""));
																	textocargar.setText(textocargar.getText().toString().concat(". Copiado registro en fecha ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat("".concat("".concat(" ".concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat(""))))))))))))))))));
																	registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Copiado registro ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat("en fecha/s ".concat("".concat("".concat("")))))))))))));
																	transferencias.edit().putString("Copiar fecha", "Si").commit();
																	//manejar fecha 
																}
																registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(" La fecha ".concat(String.valueOf((long)(listadia.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(" - Día de la semana: ".concat(transferencias.getString("Criterio día de la semana", "").concat(" = ".concat("criterio obtenido ".concat(transferencias.getString("Día de la semana encontrado", "").concat("/".concat(String.valueOf((long)(diasemana)).concat(". Día excepcional ".concat(". ".concat(transferencias.getString("Día excepcional", "").concat(". Copiar ".concat(transferencias.getString("Copiar", "").concat("".concat("")))))))))))))))))))))));
															}
															else {
																registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(" La fecha (".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(") no cumple los criterios ".concat(" Criterio día de la semana: ".concat(transferencias.getString("Criterio día de la semana", "").concat(" = ".concat(transferencias.getString("Día de la semana encontrado", "").concat("/".concat(String.valueOf((long)(diasemana)).concat("")))))))))))))))));
															}
															transferencias.edit().putString("Método", "1").commit();
															if (transferencias.getString("Método", "").equals("2")) {
																
															}
															else {
																
															}
														}
														else {
															//sin filtro 
															if (transferencias.getString("Encontrado", "").equals("Si")) {
																if (transferencias.getString("Sustituir", "").equals("Si")) {
																	listadia.set((int)contador, Double.parseDouble(transferencias.getString("Día", "")));
																	listames.set((int)contador, Double.parseDouble(transferencias.getString("Mes", "")));
																	listaano.set((int)contador, Double.parseDouble(transferencias.getString("Año", "")));
																	listaestado.set((int)contador, transferencias.getString("Estado", ""));
																	comentarios.set((int)contador, transferencias.getString("Comentario", ""));
																	horadesde.set((int)contador, Double.parseDouble(transferencias.getString("Hora desde", "")));
																	horahasta.set((int)contador, Double.parseDouble(transferencias.getString("Hora hasta", "")));
																	horarioseleccionado.set((int)contador, transferencias.getString("Horario seleccionado", ""));
																	registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Sustituido registro ".concat(String.valueOf((long)(listadia.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(" por ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" sin filtro".concat("".concat("".concat("")))))))))))))))))));
																}
																else {
																	
																}
															}
															else {
																listadia.add(Double.valueOf(Double.parseDouble(transferencias.getString("Día", ""))));
																listames.add(Double.valueOf(Double.parseDouble(transferencias.getString("Mes", ""))));
																listaano.add(Double.valueOf(Double.parseDouble(transferencias.getString("Año", ""))));
																listaestado.add(transferencias.getString("Estado", ""));
																comentarios.add(transferencias.getString("Comentario", ""));
																horadesde.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora desde", ""))));
																horahasta.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora hasta", ""))));
																horarioseleccionado.add(transferencias.getString("Horario seleccionado", ""));
																registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Copiado registro ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat("en fecha/s ".concat("".concat("".concat("")))))))))))));
															}
														}
														//fin de comprobación 
														if ((Double.parseDouble(transferencias.getString("Día", "")) == Double.parseDouble(transferencias.getString("Copiar día hasta", ""))) && ((Double.parseDouble(transferencias.getString("Mes", "")) == Double.parseDouble(transferencias.getString("Copiar mes hasta", ""))) && (Double.parseDouble(transferencias.getString("Año", "")) == Double.parseDouble(transferencias.getString("Copiar año hasta", ""))))) {
															continuar = false;
															SketchwareUtil.showMessage(getApplicationContext(), "Copiado");
															registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(" Fin fecha (".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(") ".concat(". Hasta fecha (".concat(transferencias.getString("Copiar día hasta", "").concat("/".concat(transferencias.getString("Copiar mes hasta", "").concat("/".concat(transferencias.getString("Copiar año hasta", "").concat("). ".concat(". Fechas procesadas: ".concat(transferencias.getString("Fechas procesadas", "").concat(". Fechas guardadas: ".concat(transferencias.getString("Fechas guardadas", "").concat(""))))))))))))))))))))));
															textocargar.setText(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(" Fin fecha (".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(") ".concat(". Hasta fecha (".concat(transferencias.getString("Copiar día hasta", "").concat("/".concat(transferencias.getString("Copiar mes hasta", "").concat("/".concat(transferencias.getString("Copiar año hasta", "").concat("). ".concat(". Fechas procesadas: ".concat(transferencias.getString("Fechas procesadas", "").concat(". Fechas guardadas: ".concat(transferencias.getString("Fechas guardadas", "").concat(""))))))))))))))))))))));
															temporizadorcargar.cancel();
														}
														else {
															
														}
														transferencias.edit().putString("Fechas", String.valueOf((long)(Double.parseDouble(transferencias.getString("Fechas", "")) + 1))).commit();
														transferencias.edit().putString("Día", String.valueOf((long)(Double.parseDouble(transferencias.getString("Día", "")) + 1))).commit();
														if (Double.parseDouble(transferencias.getString("Día", "")) > Double.parseDouble(transferencias.getString("Días", ""))) {
															transferencias.edit().putString("Día", "1").commit();
															if (Double.parseDouble(transferencias.getString("Mes", "")) < 12) {
																transferencias.edit().putString("Mes", String.valueOf((long)(Double.parseDouble(transferencias.getString("Mes", "")) + 1))).commit();
															}
															else {
																transferencias.edit().putString("Año", String.valueOf((long)(Double.parseDouble(transferencias.getString("Año", "")) + 1))).commit();
																transferencias.edit().putString("Mes", "1").commit();
															}
														}
														else {
															
														}
														//fin 
														transferencias.edit().putString("Método", "1").commit();
														if (transferencias.getString("Método", "").equals("1")) {
															
														}
														else {
															
														}
													}
													else {
														
													}
												}
											});
										}
									};
									_timer.scheduleAtFixedRate(temporizadorcargar, (int)(0), (int)(1));
								}
							});
							aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							aviso.create().show();
						}
						else {
							contador = 0;
							dato = "";
							for(int _repeat4337 = 0; _repeat4337 < (int)(slist.size()); _repeat4337++) {
								if (contador < slist.size()) {
									if (dato.equals("")) {
										dato = slist.get((int)(contador)).concat("\n");
									}
									else {
										dato = dato.concat(slist.get((int)(contador)).concat("\n"));
									}
								}
								else {
									
								}
								contador++;
							}
							registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Error al obtener datos para copiar eventos. ".concat("Datos requeridos 3. Datos totales ".concat(String.valueOf((long)(slist.size())).concat("\n\n".concat(dato.concat("")))))))));
							aviso.setTitle("Error al obtener datos para copiar eventos ");
							aviso.setMessage("Datos requeridos 3. Datos totales ".concat(String.valueOf((long)(slist.size())).concat("\n\n".concat("Texto recibido: ".concat(transferencias.getString("Enviar texto", "").concat("\n\n".concat(dato.concat("".concat("")))))))));
							aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							aviso.create().show();
						}
					}
					else {
						
					}
					_actualizarregistro();
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		sustituir.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Sustituir", "Si").commit();
				}
				else {
					transferencias.edit().putString("Sustituir", "No").commit();
				}
			}
		});
		
		eventoproximo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					
				}
				else {
					
				}
				if (transferencias.getString("Cargando", "").equals("No")) {
					if (_isChecked) {
						transferencias.edit().putString("Evento próximo", "Si").commit();
						//Comprobar si el evento está repetido 
						contador1 = -1;
						if (avisoevento.size() > 0) {
							contador1 = 0;
							for(int _repeat20 = 0; _repeat20 < (int)(avisoevento.size()); _repeat20++) {
								if (contador1 < avisoevento.size()) {
									if (avisoevento.get((int)(contador1)).equals("Evento diario y próximo día")) {
										break;
									}
									else {
										
									}
								}
								else {
									
								}
								contador1++;
							}
							if (contador1 == avisoevento.size()) {
								avisoevento.add("Evento diario y próximo día");
								spinneravisoeventos.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoevento));
								((ArrayAdapter)spinneravisoeventos.getAdapter()).notifyDataSetChanged();
								spinneravisoeventos.setSelection((int)(avisoevento.size() - 1));
								if (cuadroeventosaviso.getVisibility() == View.GONE) {
									cuadroeventosaviso.setVisibility(View.VISIBLE);
								}
								else {
									
								}
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "Evento repetido ");
							}
							//fin 
						}
						else {
							avisoevento.add("Evento diario y próximo día");
							spinneravisoeventos.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoevento));
							((ArrayAdapter)spinneravisoeventos.getAdapter()).notifyDataSetChanged();
							spinneravisoeventos.setSelection((int)(avisoevento.size() - 1));
							if (cuadroeventosaviso.getVisibility() == View.GONE) {
								cuadroeventosaviso.setVisibility(View.VISIBLE);
							}
							else {
								
							}
						}
					}
					else {
						transferencias.edit().putString("Evento próximo", "No").commit();
						cuadrocriteriosgenerales.setVisibility(View.VISIBLE);
					}
					registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Tocado aviso evento diario y próximo. ".concat("".concat("".concat("")))))));
					_actualizarregistro();
				}
				else {
					
				}
			}
		});
		
		textoexceptodiasdelmes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (diasseleccionados.size() > 0) {
					transferencias.edit().putString("Acción", "Seleccionadas").commit();
					// Created By Prog_mk
					AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
					builder.setTitle("title");
					 // Add a checkbox list
					final String[] animals = diasseleccionados.toArray(new String[0]);
					boolean[] checkedItems = new boolean [animals.length];
					 builder.setMultiChoiceItems(animals, checkedItems, new DialogInterface.OnMultiChoiceClickListener() { 
							 @Override public void onClick(DialogInterface dialog, int which, boolean isChecked) { 
									 // The user checked or unchecked a box
									if (isChecked) {
											SketchwareUtil.showMessage(getApplicationContext(), animals[which].concat(" get checked"));
								dato = dato + animals[which].concat("");
								listatemporal.add(animals[which].concat(""));
									}
									else {
											SketchwareUtil.showMessage(getApplicationContext(), animals[which].concat(" not checked"));
									}
									  } });
					  // Add OK and Cancel buttons
					  builder.setPositiveButton("ok", new DialogInterface.OnClickListener() { 
							  @Override public void onClick(DialogInterface dialog, int which) { 
							
							//evento aceptar
							transferencias.edit().putString("Acción lista", "Borrar seleccionadas").commit();
									  //fin 
									  } }); 
					builder.setNegativeButton("ignore", null); 
					// Create and show the alert dialog 
					AlertDialog dialog = builder.create();
					dialog.show();
					if (transferencias.getString("Acción lista", "").equals("Borrar seleccionadas")) {
						//eliminar los elementos seleccionados que coincidan con los temporales 
						if (listatemporal.size() > 0) {
							textoexceptodiasdelmes.setText("");
							contador = 0;
							for(int _repeat39 = 0; _repeat39 < (int)(listatemporal.size()); _repeat39++) {
								if (contador < listatemporal.size()) {
									contador1 = 0;
									for(int _repeat139 = 0; _repeat139 < (int)(diasseleccionados.size()); _repeat139++) {
										if (contador1 < listatemporal.size()) {
											if (listatemporal.get((int)(contador)).equals(diasseleccionados.get((int)(contador1)))) {
												if (textoexceptodiasdelmes.getText().toString().equals("")) {
													textoexceptodiasdelmes.setText(listatemporal.get((int)(contador)));
												}
												else {
													textoexceptodiasdelmes.setText(textoexceptodiasdelmes.getText().toString().concat(", ".concat(listatemporal.get((int)(contador)))));
												}
												listatemporal.remove((int)(contador));
												diasseleccionados.remove((int)(contador1));
											}
											else {
												
											}
											contador1++;
										}
										else {
											
										}
									}
								}
								else {
									
								}
								contador++;
							}
							//eliminar elementos temporales 
							listatemporal.clear();
						}
						else {
							
						}
						
					}
					else {
						
					}
				}
			}
		});
		
		solodiassemana.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					diasemanaexcepcionales.setVisibility(View.GONE);
					excepciones.setVisibility(View.VISIBLE);
					excepciones1.setVisibility(View.VISIBLE);
					domingo.setVisibility(View.VISIBLE);
				}
				else {
					diasemanaexcepcionales.setVisibility(View.VISIBLE);
					excepciones.setVisibility(View.GONE);
					excepciones1.setVisibility(View.GONE);
					domingo.setVisibility(View.GONE);
				}
			}
		});
		
		diasemanaexcepcionales.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					solodiassemana.setVisibility(View.GONE);
					excepciones.setVisibility(View.VISIBLE);
					excepciones1.setVisibility(View.VISIBLE);
					domingo.setVisibility(View.VISIBLE);
					diasemanaexcepcionales.setVisibility(View.VISIBLE);
				}
				else {
					solodiassemana.setVisibility(View.VISIBLE);
					excepciones.setVisibility(View.GONE);
					excepciones1.setVisibility(View.GONE);
					domingo.setVisibility(View.GONE);
					diasemanaexcepcionales.setVisibility(View.GONE);
				}
			}
		});
		
		solodatos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					cuadrodatos.setVisibility(View.VISIBLE);
					cuadrodatos3.setVisibility(View.VISIBLE);
				}
				else {
					cuadrodatos.setVisibility(View.GONE);
					cuadrodatos3.setVisibility(View.GONE);
				}
			}
		});
		
		domingo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Criterio domingo", "domingo").commit();
					transferencias.edit().putString("Criterio día de la semana", "domingo").commit();
				}
				else {
					transferencias.edit().putString("Criterio domingo", "No").commit();
					transferencias.edit().putString("Criterio día de la semana", "No").commit();
				}
			}
		});
		
		tiposuceso.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (transferencias.getString("Buscando", "").equals("No")) {
					if (transferencias.getString("Cargando", "").equals("No")) {
						transferencias.edit().putString("Estado", listatiposuceso.get((int)(_position))).commit();
						if (transferencias.getString("Estado", "").equals("Ocupado parcial")) {
							cuadrohorario.setVisibility(View.VISIBLE);
						}
						else {
							cuadrohorario.setVisibility(View.GONE);
						}
						_comprobarcambio();
						_fechayhora();
						registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Tipo suceso: ".concat(transferencias.getString("Estado", "").concat("".concat("")))))));
					}
					else {
						
					}
				}
				else {
					
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		button56.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		comentario.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (transferencias.getString("Buscando", "").equals("No")) {
					if (transferencias.getString("Cargando", "").equals("No")) {
						if (_charSeq.length() > 0) {
							if (_charSeq.equals("(No)")) {
								aviso.setTitle("Aplicaciones");
								aviso.setMessage("El comentario ".concat(_charSeq.concat(" no es válido".concat(""))));
								aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
										
									}
								});
								aviso.create().show();
							}
							else {
								transferencias.edit().putString("Comentario", _charSeq).commit();
							}
							//está instrucción es temporal. Hay que hacer un módulo que controle los cambios 
							botonguardarcalendario.setVisibility(View.VISIBLE);
							transferencias.edit().putString("Método", "1").commit();
							if (transferencias.getString("Método", "").equals("2")) {
								_comprobarcambio();
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button57.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		spunnerdesdehora.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				//Aquí está el foco
				if (transferencias.getString("Buscando", "").equals("No")) {
					if (transferencias.getString("Cargando", "").equals("No")) {
						transferencias.edit().putString("Hora desde", listahorariodesde.get((int)(_position))).commit();
						transferencias.edit().putString("Horario seleccionado", "No").commit();
						_comprobarcambio();
					}
					else {
						
					}
				}
				else {
					
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		spinnerhastahora.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (transferencias.getString("Buscando", "").equals("No")) {
					if (transferencias.getString("Cargando", "").equals("No")) {
						transferencias.edit().putString("Hora hasta", listahorariohasta.get((int)(_position))).commit();
						transferencias.edit().putString("Horario seleccionado", "No").commit();
						_comprobarcambio();
					}
					else {
						
					}
				}
				else {
					
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		button43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Título", "Horario personalizado ").commit();
				transferencias.edit().putString("Mensaje", "Introduzca el nombre del horario ").commit();
				transferencias.edit().putString("Ventana texto", "Nombre horario").commit();
				_ventanaintroducirtexto();
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					if (nombrehorario.getText().toString().equals("")) {
						
					}
					else {
						transferencias.edit().putString("Encontrado", "No").commit();
						if (listanombrehorario.size() > 0) {
							//Comprobar si existe 
							contador = 0;
							for(int _repeat38 = 0; _repeat38 < (int)(listanombrehorario.size()); _repeat38++) {
								if (contador < listanombrehorario.size()) {
									if (nombrehorario.getText().toString().equals(listanombrehorario.get((int)(contador)))) {
										transferencias.edit().putString("Encontrado", "Si").commit();
										break;
									}
									else {
										
									}
								}
								else {
									
								}
								contador++;
							}
						}
						else {
							
						}
						//
						if (transferencias.getString("Encontrado", "").equals("No")) {
							horariopersonalizado.setVisibility(View.VISIBLE);
							listanombrehorario.add(nombrehorario.getText().toString());
							personalizado1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listanombrehorario));
							((ArrayAdapter)personalizado1.getAdapter()).notifyDataSetChanged();
							nombrehorariopersonalizado.add(nombrehorario.getText().toString());
							transferencias.edit().putString("Horario seleccionado", nombrehorario.getText().toString()).commit();
							horadesdepersonalizado.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora hasta", ""))));
							horahastapersonalizado.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora desde", ""))));
							personalizado1.setSelection((int)(contador));
							transferencias.edit().putString("Cambiado1", "Si").commit();
							_comprobarcambio();
							transferencias.edit().putString("Método", "1").commit();
							if (transferencias.getString("Método", "").equals("2")) {
								
							}
							else {
								
							}
						}
						else {
							aviso.setTitle("Nombre");
							aviso.setMessage("El nombre (".concat(listanombrehorario.get((int)(contador)).concat(") ya existe ".concat(""))));
							aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							aviso.create().show();
						}
					}
				}
				else {
					
				}
			}
		});
		
		button40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				//vinculado a separadorcalendario4. Modifica su texto 
				transferencias.edit().putString("Enviar texto", "Copiar desde fecha").commit();
				androidx.appcompat.app.AppCompatDialogFragment newFragment = new DatePickerFragment();
				
				newFragment.show(getSupportFragmentManager(), "Date Picker");
			}
		});
		
		button41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				//vinculado a separadorcalendario4. Modifica el texto
				transferencias.edit().putString("Enviar texto", "Copiar hasta fecha").commit();
				androidx.appcompat.app.AppCompatDialogFragment newFragment = new DatePickerFragment();
				
				newFragment.show(getSupportFragmentManager(), "Date Picker");
			}
		});
		
		aviso1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Opción", "Aviso").commit();
					cuadrocriteriosaviso.setVisibility(View.VISIBLE);
					//registro 
					_fechayhora();
					transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Opción avisos. Actualizar informe de avisos. ".concat(transferencias.getString("Líneas", "").concat(". Limite de datos: ".concat(transferencias.getString("Carga rápida a partir de datos", "").concat("".concat(""))))))))).commit();
					if (registro.size() > 0) {
						registro.set((int)0, transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Número de datos: ".concat(transferencias.getString("Líneas", "").concat(". Limite de datos: ".concat(transferencias.getString("Carga rápida a partir de datos", "").concat("".concat("")))))))));
					}
					else {
						registro.add(transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Número de datos: ".concat(transferencias.getString("Líneas", "").concat(". Limite de datos: ".concat(transferencias.getString("Carga rápida a partir de datos", "").concat("".concat("")))))))));
					}
					listviewregistro.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, registro));
					((BaseAdapter)listviewregistro.getAdapter()).notifyDataSetChanged();
					if (transferencias.getString("Actualizando registro", "").equals("No")) {
						transferencias.edit().putString("Actualizando registro", "Si").commit();
						transferencias.edit().putString("Registro", "").commit();
						if (transferencias.getString("Guardar registro automáticamente", "").equals("Si")) {
							transferencias.edit().putString("Datos", "").commit();
							transferencias.edit().putString("Contador registro", "0").commit();
							if (registro.size() > 0) {
								for(int _repeat235 = 0; _repeat235 < (int)(registro.size()); _repeat235++) {
									if (transferencias.getString("Contador registro", "").length() < registro.size()) {
										transferencias.edit().putString("Datos", transferencias.getString("Datos", "").concat(registro.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))).concat("\n"))).commit();
										transferencias.edit().putString("Contador registro", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador registro", "")) + 1))).commit();
									}
									else {
										
									}
								}
								FileUtil.copyFile(transferencias.getString("Datos", ""), transferencias.getString("Ruta registro", ""));
							}
							else {
								
							}
						}
						else {
							
						}
						transferencias.edit().putString("Actualizando registro", "No").commit();
					}
					else {
						
					}
					//fin de registro 
					_actualizarinformeavisos();
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("2")) {
						formaaviso.setVisibility(View.GONE);
						cuadrocriteriosgenerales.setVisibility(View.VISIBLE);
						filtro.setVisibility(View.VISIBLE);
						cuadroformasaviso.setVisibility(View.VISIBLE);
						cuadroeventos.setVisibility(View.VISIBLE);
						cuadromomento.setVisibility(View.VISIBLE);
					}
					else {
						
					}
				}
				else {
					transferencias.edit().putString("Opción", "No").commit();
					cuadrocriteriosaviso.setVisibility(View.GONE);
					separadoravisos.setVisibility(View.GONE);
				}
				if (transferencias.getString("Cargando", "").equals("No")) {
					_comprobarcambio();
				}
				else {
					
				}
				botonguardar.setVisibility(View.VISIBLE);
				//registro 
				_fechayhora();
				transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Fin de opción aviso. ".concat(""))))).commit();
				if (registro.size() > 0) {
					registro.set((int)0, transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Número de datos: ".concat(transferencias.getString("Líneas", "").concat(". Limite de datos: ".concat(transferencias.getString("Carga rápida a partir de datos", "").concat("".concat("")))))))));
				}
				else {
					registro.add(transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Número de datos: ".concat(transferencias.getString("Líneas", "").concat(". Limite de datos: ".concat(transferencias.getString("Carga rápida a partir de datos", "").concat("".concat("")))))))));
				}
				listviewregistro.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, registro));
				((BaseAdapter)listviewregistro.getAdapter()).notifyDataSetChanged();
				if (transferencias.getString("Actualizando registro", "").equals("No")) {
					transferencias.edit().putString("Actualizando registro", "Si").commit();
					transferencias.edit().putString("Registro", "").commit();
					if (transferencias.getString("Guardar registro automáticamente", "").equals("Si")) {
						transferencias.edit().putString("Datos", "").commit();
						transferencias.edit().putString("Contador registro", "0").commit();
						if (registro.size() > 0) {
							for(int _repeat78 = 0; _repeat78 < (int)(registro.size()); _repeat78++) {
								if (transferencias.getString("Contador registro", "").length() < registro.size()) {
									transferencias.edit().putString("Datos", transferencias.getString("Datos", "").concat(registro.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))).concat("\n"))).commit();
									transferencias.edit().putString("Contador registro", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador registro", "")) + 1))).commit();
								}
								else {
									
								}
							}
							FileUtil.copyFile(transferencias.getString("Datos", ""), transferencias.getString("Ruta registro", ""));
						}
						else {
							
						}
					}
					else {
						
					}
					transferencias.edit().putString("Actualizando registro", "No").commit();
				}
				else {
					
				}
				//fin de registro 
			}
		});
		
		guardaraviso.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Avisos 1", "(Si)").commit();
				guardaraviso.setVisibility(View.GONE);
				transferencias.edit().putString("Aviso guardado", "Si").commit();
				spinneravisoeventos.setSelection((int)(0));
				spinneravisomomento.setSelection((int)(0));
				spinneravisoforma.setSelection((int)(0));
				spinnerfiltroobjetivo.setSelection((int)(0));
				transferencias.edit().putString("Seleccione tipo de evento/s", "No").commit();
				transferencias.edit().putString("Seleccione momento/s", "No").commit();
				transferencias.edit().putString("Seleccione forma/s", "No").commit();
				transferencias.edit().putString("Seleccione filtro/s", "No").commit();
				transferencias.edit().putString("Aviso evento", "Seleccione tipo de evento/s").commit();
				transferencias.edit().putString("Aviso momento", "Seleccione momento/s de aviso").commit();
				transferencias.edit().putString("Aviso forma", "Seleccione forma/s de aviso").commit();
				transferencias.edit().putString("Aviso filtro", "Seleccione filtro/s de aviso").commit();
				if (avisoseventostemporal.size() > 0) {
					transferencias.edit().putString("Contador registro", "0").commit();
					for(int _repeat96 = 0; _repeat96 < (int)(avisoseventostemporal.size()); _repeat96++) {
						if (Double.parseDouble(transferencias.getString("Contador registro", "")) < avisoseventostemporal.size()) {
							listaavisoseventospersonalizados.add(avisoseventostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))));
							listaavisosmomentospersonalizados.add(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))));
							listaavisosformaspersonalizadas.add(avisosformastemporal.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))));
							listaavisosfiltrospersonalizados.add(avisosfiltrotemporal.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))));
							listaavisosaudiopersonalizados.add(avisoaudiotemporal.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))));
							transferencias.edit().putString("Contador registro", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador registro", "")) + 1))).commit();
						}
						else {
							
						}
					}
					avisoseventostemporal.clear();
					avisosmomentostemporal.clear();
					avisosformastemporal.clear();
					avisosfiltrotemporal.clear();
					avisoaudiotemporal.clear();
					avisosfiltrotemporal.add("No");
					avisoaudiotemporal.add("No");
				}
				else {
					
				}
				transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Fin de botón guardar avisos. Avisos: ".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat("")))))).commit();
				FileUtil.writeFile(transferencias.getString("Ruta registros", "").concat("/registro general.txt"), transferencias.getString("Registro", ""));
			}
		});
		
		button55.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		avisoeventos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				transferencias.edit().putString("Registro", "").commit();
				if (transferencias.getString("Cargando", "").equals("No")) {
					
				}
				else {
					
				}
				if (_isChecked) {
					transferencias.edit().putString("Aviso", "Si").commit();
					formaaviso.setVisibility(View.GONE);
					eventoproximo.setVisibility(View.VISIBLE);
					filtro.setVisibility(View.VISIBLE);
				}
				else {
					transferencias.edit().putString("Aviso", "No").commit();
					formaaviso.setVisibility(View.GONE);
					eventoproximo.setVisibility(View.GONE);
					filtro.setVisibility(View.GONE);
				}
				if (transferencias.getString("Cargando", "").equals("No")) {
					_comprobarcambio();
				}
				else {
					
				}
				botonguardar.setVisibility(View.VISIBLE);
				registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Tocado aviso. ".concat("".concat("".concat("")))))));
				_actualizarregistro();
			}
		});
		
		spinneravisoeventos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				transferencias.edit().putString("Aviso evento", listaavisoeventos.get((int)(_position))).commit();
				transferencias.edit().putString("Último criterio", "Evento").commit();
				aviso.setTitle(transferencias.getString("Último criterio", "").concat("".concat("".concat(""))));
				aviso.setMessage(transferencias.getString("Aviso evento", "").concat("".concat("".concat(""))));
				aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				_filtroaviso1();
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		borraravisoevento.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (avisoevento.size() > 0) {
					avisoevento.remove((int)(Double.parseDouble(transferencias.getString("Posición aviso evento", ""))));
				}
				else {
					
				}
			}
		});
		
		spinneravisomomento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				transferencias.edit().putString("Aviso momento", listaavisomomento.get((int)(_position))).commit();
				transferencias.edit().putString("Último criterio", "Momento").commit();
				aviso.setTitle("Último criterio ".concat(transferencias.getString("Último criterio", "").concat("".concat(""))));
				aviso.setMessage("Aviso momento".concat(transferencias.getString("Aviso momento", "").concat("".concat(""))));
				aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				_filtroaviso1();
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					transferencias.edit().putString("Aviso correcto", "Si").commit();
					if (transferencias.getString("Aviso momento", "").equals("Seleccione tipo de evento/s")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso momento", "").equals("Seleccione momento/s de aviso")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso forma", "").equals("Seleccione forma/s de aviso")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso filtro", "").equals("Seleccione filtro/s de aviso")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso correcto", "").equals("Si")) {
						transferencias.edit().putString("Añadir momento", transferencias.getString("Aviso momento", "")).commit();
						guardaraviso.setVisibility(View.VISIBLE);
						transferencias.edit().putString("Aviso guardado", "No").commit();
						_actualizarinformeavisos();
					}
					else {
						guardaraviso.setVisibility(View.GONE);
					}
				}
				else {
					
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		borraravisomomento.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				avisomomento.remove((int)(Double.parseDouble(transferencias.getString("Posición aviso momento", ""))));
			}
		});
		
		spinneravisoforma.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				transferencias.edit().putString("Aviso forma", listaavisoformas.get((int)(_position))).commit();
				transferencias.edit().putString("Último criterio", "Forma").commit();
				aviso.setTitle("Último criterio ".concat(transferencias.getString("Último criterio", "").concat("".concat(""))));
				aviso.setMessage("Aviso forma ".concat(transferencias.getString("Aviso forma", "").concat("".concat(""))));
				aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				_filtroaviso1();
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					transferencias.edit().putString("Aviso correcto", "Si").commit();
					if (transferencias.getString("Aviso evento", "").equals("Seleccione tipo de evento/s")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso momento", "").equals("Seleccione momento/s de aviso")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso forma", "").equals("Seleccione forma/s de aviso")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso filtro", "").equals("Seleccione filtro/s de aviso")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso correcto", "").equals("Si")) {
						transferencias.edit().putString("Añadir forma", listaavisoformas.get((int)(_position))).commit();
						guardaraviso.setVisibility(View.VISIBLE);
						_comprobaravisosrepetidos();
						transferencias.edit().putString("Aviso guardado", "No").commit();
					}
					else {
						guardaraviso.setVisibility(View.GONE);
					}
				}
				else {
					
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		borraravisoforma.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				avisoforma.remove((int)(Double.parseDouble(transferencias.getString("Posición aviso forma", ""))));
			}
		});
		
		spinnerfiltrosaviso.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				transferencias.edit().putString("Aviso filtro", listaavisosfiltros.get((int)(_position))).commit();
				transferencias.edit().putString("Último criterio", "Filtro").commit();
				_filtroaviso1();
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					if (transferencias.getString("Aviso filtro", "").equals("Seleccione filtro tipo de evento/s de aviso")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso momento", "").equals("Seleccione momento/s de aviso")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso forma", "").equals("Seleccione forma/s de aviso")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso filtro", "").equals("Seleccione filtro/s de aviso")) {
						transferencias.edit().putString("Aviso correcto", "No").commit();
					}
					else {
						
					}
					if (transferencias.getString("Aviso correcto", "").equals("Si")) {
						transferencias.edit().putString("Añadir filtro", transferencias.getString("Aviso filtro", "")).commit();
						guardaraviso.setVisibility(View.VISIBLE);
						transferencias.edit().putString("Aviso guardado", "No").commit();
						if (separadoravisos.getVisibility() == View.GONE) {
							separadoravisos.setVisibility(View.VISIBLE);
						}
						else {
							
						}
						avisosfiltrotemporal.add(transferencias.getString("Aviso filtro", ""));
						_actualizarinformeavisos();
					}
					else {
						guardaraviso.setVisibility(View.GONE);
					}
				}
				else {
					
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		button58.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		spinneraudioaviso.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				transferencias.edit().putString("Aviso audio", listaaudio.get((int)(_position))).commit();
				transferencias.edit().putString("Último criterio", "Audio").commit();
				_filtroaviso1();
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		eventosseleccionados.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Tocado seleccionar fechas para aviso. Cargando ".concat(transferencias.getString("Cargando", "").concat("".concat("")))))));
				if (transferencias.getString("Cargando", "").equals("No")) {
					if (_isChecked) {
						transferencias.edit().putString("Fecha", "Seleccionar días del mes").commit();
						transferencias.edit().putString("Seleccionar", "Solo días para aviso").commit();
						transferencias.edit().putString("Criterio evento", "Seleccionados").commit();
						cuadroformasaviso.setVisibility(View.VISIBLE);
						formaaviso.setVisibility(View.VISIBLE);
						cuadrosolodias.setVisibility(View.VISIBLE);
						textofechasaviso.setVisibility(View.VISIBLE);
						botonfinseleccion.setVisibility(View.VISIBLE);
					}
					else {
						botonfinseleccion.setVisibility(View.GONE);
					}
				}
				else {
					
				}
				_actualizarregistro();
			}
		});
		
		todoseventos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					if (transferencias.getString("Cargando", "").equals("No")) {
						if (_isChecked) {
							transferencias.edit().putString("Criterio evento", "Todos").commit();
							formaaviso.setVisibility(View.VISIBLE);
							cuadroformasaviso.setVisibility(View.VISIBLE);
							textoexceptodiasdelmes.setVisibility(View.GONE);
							cuadrosolodias.setVisibility(View.GONE);
							textofechasaviso.setVisibility(View.GONE);
							//Comprobar si el evento está repetido 
							if (avisoevento.size() > 0) {
								contador1 = 0;
								for(int _repeat23 = 0; _repeat23 < (int)(avisoevento.size()); _repeat23++) {
									if (contador1 < avisoevento.size()) {
										if (avisoevento.get((int)(contador1)).equals("Todos los eventos")) {
											break;
										}
										else {
											
										}
									}
									else {
										
									}
									contador1++;
								}
							}
							else {
								
							}
							if (contador1 < avisoevento.size()) {
								avisoevento.add("Todos los eventos");
								spinneravisoeventos.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoevento));
								((ArrayAdapter)spinneravisoeventos.getAdapter()).notifyDataSetChanged();
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "Evento repetido ");
							}
							//fin 
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
		});
		
		mostraraplicacion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					
				}
				else {
					
				}
				if (transferencias.getString("Cargando", "").equals("No")) {
					if (_isChecked) {
						transferencias.edit().putString("Cuando mostrar aviso", "Mostrar aplicación").commit();
						if (avisomomento.size() > 0) {
							contador1 = 0;
							for(int _repeat20 = 0; _repeat20 < (int)(avisomomento.size()); _repeat20++) {
								if (contador1 < avisomomento.size()) {
									if (avisomomento.get((int)(contador1)).equals("Mostrar aplicación")) {
										break;
									}
									else {
										
									}
								}
								else {
									
								}
								contador1++;
							}
							if (contador1 == avisomomento.size()) {
								avisomomento.add("Mostrar aplicación");
								spinneravisomomento.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisomomento));
								((ArrayAdapter)spinneravisomomento.getAdapter()).notifyDataSetChanged();
								spinneravisomomento.setSelection((int)(avisomomento.size() - 1));
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "Evento repetido ");
							}
							//fin 
							transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Opción mostrar al inicio. Mostrar módulo próximo aviso. ".concat(""))))).commit();
							_actualizarregistroreciente();
							_proximoaviso();
						}
						else {
							avisomomento.add("Mostrar aplicación");
							spinneravisomomento.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisomomento));
							((ArrayAdapter)spinneravisomomento.getAdapter()).notifyDataSetChanged();
							spinneravisomomento.setSelection((int)(avisomomento.size() - 1));
						}
					}
					else {
						
					}
					//cuando mostrar aviso
					//forma de aviso 
					//criterio evento
					//tipo criterio
				}
				else {
					
				}
			}
		});
		
		horainicio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					
				}
				else {
					
				}
				if (_isChecked) {
					transferencias.edit().putString("Cuando mostrar aviso", "Hora inicio").commit();
					if (avisomomento.size() > 0) {
						contador1 = 0;
						for(int _repeat17 = 0; _repeat17 < (int)(avisomomento.size()); _repeat17++) {
							if (contador1 < avisomomento.size()) {
								if (avisomomento.get((int)(contador1)).equals("Hora inicio")) {
									break;
								}
								else {
									
								}
							}
							else {
								
							}
							contador1++;
						}
						if (contador1 == avisomomento.size()) {
							avisomomento.add("Hora inicio");
							spinneravisomomento.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisomomento));
							((ArrayAdapter)spinneravisomomento.getAdapter()).notifyDataSetChanged();
							spinneravisomomento.setSelection((int)(avisomomento.size() - 1));
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "Evento repetido ");
						}
						//fin 
					}
					else {
						avisomomento.add("Hora inicio");
						spinneravisomomento.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisomomento));
						((ArrayAdapter)spinneravisomomento.getAdapter()).notifyDataSetChanged();
						spinneravisomomento.setSelection((int)(avisomomento.size() - 1));
					}
				}
				else {
					
				}
			}
		});
		
		notificacion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					
				}
				else {
					
				}
				if (transferencias.getString("Cargando", "").equals("No")) {
					if (_isChecked) {
						transferencias.edit().putString("Notificación", "Si").commit();
						if (avisoforma.size() > 0) {
							contador1 = 0;
							for(int _repeat18 = 0; _repeat18 < (int)(avisoforma.size()); _repeat18++) {
								if (contador1 < avisoforma.size()) {
									if (avisoforma.get((int)(contador1)).equals("Notificación")) {
										break;
									}
									else {
										
									}
								}
								else {
									
								}
								contador1++;
							}
							if (contador1 == avisoforma.size()) {
								avisoforma.add("Notificación");
								spinneravisoforma.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoforma));
								((ArrayAdapter)spinneravisoforma.getAdapter()).notifyDataSetChanged();
								spinneravisoforma.setSelection((int)(avisoforma.size() - 1));
								if (cuadroformaaviso.getVisibility() == View.GONE) {
									cuadroformaaviso.setVisibility(View.VISIBLE);
								}
								else {
									
								}
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "Evento repetido ");
							}
							//fin 
						}
						else {
							avisoforma.add("Notificación");
							spinneravisoforma.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoforma));
							((ArrayAdapter)spinneravisoforma.getAdapter()).notifyDataSetChanged();
							spinneravisoforma.setSelection((int)(avisoforma.size() - 1));
							if (cuadroformaaviso.getVisibility() == View.GONE) {
								cuadroformaaviso.setVisibility(View.VISIBLE);
							}
							else {
								
							}
						}
					}
					else {
						transferencias.edit().putString("Notificación", "No").commit();
					}
				}
				else {
					
				}
			}
		});
		
		checkbox17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					
				}
				else {
					
				}
				if (transferencias.getString("Cargando", "").equals("No")) {
					if (_isChecked) {
						transferencias.edit().putString("Ventana", "Si").commit();
						if (avisoforma.size() > 0) {
							contador1 = 0;
							for(int _repeat18 = 0; _repeat18 < (int)(avisoforma.size()); _repeat18++) {
								if (contador1 < avisoforma.size()) {
									if (avisoforma.get((int)(contador1)).equals("Ventana")) {
										break;
									}
									else {
										
									}
								}
								else {
									
								}
								contador1++;
							}
							if (contador1 == avisoforma.size()) {
								avisoforma.add("Ventana");
								spinneravisoforma.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoforma));
								((ArrayAdapter)spinneravisoforma.getAdapter()).notifyDataSetChanged();
								spinneravisoforma.setSelection((int)(avisoforma.size() - 1));
								if (cuadroformaaviso.getVisibility() == View.GONE) {
									cuadroformaaviso.setVisibility(View.VISIBLE);
								}
								else {
									
								}
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "Evento repetido ");
							}
							//fin 
						}
						else {
							avisoforma.add("Ventana");
							spinneravisoforma.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoforma));
							((ArrayAdapter)spinneravisoforma.getAdapter()).notifyDataSetChanged();
							spinneravisoforma.setSelection((int)(avisoforma.size() - 1));
							if (cuadroformaaviso.getVisibility() == View.GONE) {
								cuadroformaaviso.setVisibility(View.VISIBLE);
							}
							else {
								
							}
						}
					}
					else {
						transferencias.edit().putString("Ventana", "No").commit();
					}
				}
				else {
					
				}
			}
		});
		
		decir.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					
				}
				else {
					
				}
				if (transferencias.getString("Cargando", "").equals("No")) {
					if (_isChecked) {
						transferencias.edit().putString("Decir", "Si").commit();
						if (avisoforma.size() > 0) {
							contador1 = 0;
							for(int _repeat18 = 0; _repeat18 < (int)(avisoforma.size()); _repeat18++) {
								if (contador1 < avisoforma.size()) {
									if (avisoforma.get((int)(contador1)).equals("Decir")) {
										break;
									}
									else {
										
									}
								}
								else {
									
								}
								contador1++;
							}
							if (contador1 < avisoforma.size()) {
								avisoforma.add("Decir");
								spinneravisoforma.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoforma));
								((ArrayAdapter)spinneravisoforma.getAdapter()).notifyDataSetChanged();
								spinneravisoforma.setSelection((int)(avisoforma.size() - 1));
								if (cuadroformaaviso.getVisibility() == View.GONE) {
									cuadroformaaviso.setVisibility(View.VISIBLE);
								}
								else {
									
								}
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "Evento repetido ");
							}
							//fin 
						}
						else {
							avisoforma.add("Decir");
							spinneravisoforma.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, avisoforma));
							((ArrayAdapter)spinneravisoforma.getAdapter()).notifyDataSetChanged();
							spinneravisoforma.setSelection((int)(avisoforma.size() - 1));
						}
					}
					else {
						transferencias.edit().putString("Decir", "No").commit();
					}
				}
				else {
					
				}
			}
		});
		
		proximoevento.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (transferencias.getString("Cargando", "").equals("No")) {
					if (_isChecked) {
						transferencias.edit().putString("Tipo criterio", "Todos").commit();
						solodatos.setVisibility(View.GONE);
						cuadrodatos.setVisibility(View.GONE);
						cuadrodatos3.setVisibility(View.GONE);
						cuadrodatos.setVisibility(View.GONE);
						formaaviso.setVisibility(View.VISIBLE);
						cuadroformasaviso.setVisibility(View.VISIBLE);
						cuadroeventos.setVisibility(View.VISIBLE);
						_notificaciones();
						_proximoaviso();
					}
					else {
						
					}
					if (transferencias.getString("Cargando", "").equals("No")) {
						_comprobarcambio();
					}
					else {
						
					}
				}
				else {
					
				}
			}
		});
		
		seguncriterio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Tipo criterio", "Personalizado").commit();
					solodiassemana.setVisibility(View.VISIBLE);
					diasemanaexcepcionales.setVisibility(View.VISIBLE);
					transferencias.edit().putString("Filtro", "Si").commit();
					cuadrodiasdelasemana.setVisibility(View.VISIBLE);
					cuadrosolodias.setVisibility(View.VISIBLE);
					diasdelmesexcepcionales.setVisibility(View.VISIBLE);
					filtro.setChecked(true);
				}
				else {
					solodiassemana.setVisibility(View.GONE);
					diasemanaexcepcionales.setVisibility(View.GONE);
					transferencias.edit().putString("Filtro", "Si").commit();
					cuadrodiasdelasemana.setVisibility(View.GONE);
					cuadrosolodias.setVisibility(View.GONE);
					diasdelmesexcepcionales.setVisibility(View.GONE);
					filtro.setChecked(false);
				}
				if (transferencias.getString("Cargando", "").equals("No")) {
					_comprobarcambio();
				}
				else {
					
				}
			}
		});
		
		filtro.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					solodiassemana.setVisibility(View.VISIBLE);
					diasemanaexcepcionales.setVisibility(View.VISIBLE);
					transferencias.edit().putString("Filtro", "Si").commit();
					cuadrodiasdelasemana.setVisibility(View.VISIBLE);
					cuadrosolodias.setVisibility(View.VISIBLE);
					diasdelmesexcepcionales.setVisibility(View.VISIBLE);
					solodatos.setVisibility(View.VISIBLE);
					button56.setVisibility(View.VISIBLE);
					button57.setVisibility(View.VISIBLE);
				}
				else {
					transferencias.edit().putString("Filtro", "No").commit();
					solodiassemana.setVisibility(View.GONE);
					diasemanaexcepcionales.setVisibility(View.GONE);
					cuadrodiasdelasemana.setVisibility(View.GONE);
					cuadrosolodias.setVisibility(View.GONE);
					diasdelmesexcepcionales.setVisibility(View.GONE);
					solodatos.setVisibility(View.GONE);
					transferencias.edit().putString("Criterios de búsqueda", "No").commit();
					button56.setVisibility(View.GONE);
					button57.setVisibility(View.GONE);
				}
			}
		});
		
		diasdelmesexcepcionales.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				listatemporal.clear();
				diasseleccionados.clear();
				mesexcepcional.clear();
				diaexcepcional.clear();
				anoexcepcional.clear();
				if (_isChecked) {
					transferencias.edit().putString("Fecha", "Seleccionar días del mes").commit();
					button44.setVisibility(View.VISIBLE);
					transferencias.edit().putString("Selección", "Iniciar").commit();
					textoexceptodiasdelmes.setVisibility(View.VISIBLE);
					transferencias.edit().putString("Criterio día de la semana", "No").commit();
					transferencias.edit().putString("Seleccionar", "Excepto días").commit();
				}
				else {
					transferencias.edit().putString("Fecha", "Comprobar").commit();
					button44.setVisibility(View.GONE);
					transferencias.edit().putString("Selección", "Cancelar").commit();
					textoexceptodiasdelmes.setVisibility(View.GONE);
					textoexceptodiasdelmes.setText("");
					transferencias.edit().putString("Criterio día de la semana", "Si").commit();
					transferencias.edit().putString("Seleccionar", "Fin").commit();
				}
			}
		});
		
		button44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Fecha", "Comprobar").commit();
				button44.setVisibility(View.GONE);
				transferencias.edit().putString("Acción", "Fin").commit();
			}
		});
		
		solodias.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				listatemporal.clear();
				diasseleccionados.clear();
				listasolodia.clear();
				listasolomes.clear();
				listasoloano.clear();
				if (_isChecked) {
					transferencias.edit().putString("Fecha", "Seleccionar días del mes").commit();
					button45.setVisibility(View.VISIBLE);
					transferencias.edit().putString("Selección", "Iniciar").commit();
					textoexceptodiasdelmes.setVisibility(View.VISIBLE);
					transferencias.edit().putString("Criterio día de la semana", "No").commit();
					if (eventosseleccionados.isChecked()) {
						transferencias.edit().putString("Seleccionar", "Solo días para aviso").commit();
					}
					else {
						transferencias.edit().putString("Seleccionar", "Solo días").commit();
					}
				}
				else {
					transferencias.edit().putString("Fecha", "Comprobar").commit();
					button45.setVisibility(View.GONE);
					transferencias.edit().putString("Selección", "Cancelar").commit();
					transferencias.edit().putString("Criterio día de la semana", "Si").commit();
					transferencias.edit().putString("Seleccionar", "Fin").commit();
					textoexceptodiasdelmes.setVisibility(View.GONE);
					textoexceptodiasdelmes.setText("");
					textofechasaviso.setVisibility(View.GONE);
					textofechasaviso.setText("");
				}
				registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Seleccionar solo días. Fecha: ".concat(transferencias.getString("Fecha", "").concat(". Seleccionar: ".concat(transferencias.getString("Seleccionar", "").concat("".concat("")))))))));
				_actualizarregistro();
			}
		});
		
		button45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Fecha", "Comprobar").commit();
				button45.setVisibility(View.GONE);
				transferencias.edit().putString("Acción", "Fin").commit();
			}
		});
		
		filtrotipocita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (transferencias.getString("Opción", "").equals("Aviso")) {
						listatemporal.clear();
						// Created By Prog_mk
						AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
						builder.setTitle("title");
						 // Add a checkbox list
						final String[] animals = listatiposuceso.toArray(new String[0]);
						boolean[] checkedItems = new boolean [animals.length];
						 builder.setMultiChoiceItems(animals, checkedItems, new DialogInterface.OnMultiChoiceClickListener() { 
								 @Override public void onClick(DialogInterface dialog, int which, boolean isChecked) { 
										 // The user checked or unchecked a box
										if (isChecked) {
												SketchwareUtil.showMessage(getApplicationContext(), animals[which].concat(" get checked"));
									dato = dato + animals[which].concat("");
									listatemporal.add(animals[which].concat(""));
										}
										else {
												SketchwareUtil.showMessage(getApplicationContext(), animals[which].concat(" not checked"));
										}
										  } });
						  // Add OK and Cancel buttons
						  builder.setPositiveButton("ok", new DialogInterface.OnClickListener() { 
								  @Override public void onClick(DialogInterface dialog, int which) { 
								
								//evento aceptar
								transferencias.edit().putString("Acción lista", "Seleccionar").commit();
										  //fin 
										  } }); 
						builder.setNegativeButton("ignore", null); 
						// Create and show the alert dialog 
						AlertDialog dialog = builder.create();
						dialog.show();
						//añadir elementos 
						if (listatemporal.size() > 0) {
							if (avisotipo.size() > 0) {
								//Comprobar si el elemento está repetido 
								contador1 = 0;
								for(int _repeat67 = 0; _repeat67 < (int)(listatemporal.size()); _repeat67++) {
									contador1 = 0;
									for(int _repeat141 = 0; _repeat141 < (int)(listatemporal.size()); _repeat141++) {
										if (contador1 < listatemporal.size()) {
											if (listatemporal.get((int)(contador1)).equals(avisotipo.get((int)(contador1)))) {
												break;
											}
											else {
												
											}
											if (contador1 == avisotipo.size()) {
												
											}
											else {
												
											}
											//fin 
										}
										else {
											
										}
										contador1++;
									}
								}
							}
							else {
								
							}
							contador1 = 0;
							for(int _repeat170 = 0; _repeat170 < (int)(listatemporal.size()); _repeat170++) {
								if (contador1 < listatemporal.size()) {
									//poner en filtro cuando esté terminado 
									avisotipo.add(listatemporal.get((int)(contador1)));
									descripcionavisofiltrotipo.add("Tipo cita: ".concat(listatemporal.get((int)(contador1))));
									spinnerfiltrosaviso.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, descripcionavisofiltrotipo));
									((ArrayAdapter)spinnerfiltrosaviso.getAdapter()).notifyDataSetChanged();
									spinnerfiltrosaviso.setSelection((int)(descripcionavisofiltrotipo.size() - 1));
								}
								else {
									
								}
								contador1++;
							}
						}
						else {
							aviso.setTitle("No ha seleccionado opciones ");
							aviso.setMessage("".concat("".concat("".concat(""))));
							aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							aviso.create().show();
						}
					}
					else {
						
					}
					transferencias.edit().putString("Filtro tipo de cita", "Si").commit();
					transferencias.edit().putString("Criterios de búsqueda", "Si").commit();
				}
				else {
					if (transferencias.getString("Opción", "").equals("Aviso")) {
						
					}
					else {
						transferencias.edit().putString("Filtro tipo de cita", "No").commit();
					}
				}
			}
		});
		
		filtrocomentario.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (transferencias.getString("Cargando", "").equals("No")) {
					if (_isChecked) {
						if (transferencias.getString("Opción", "").equals("Aviso")) {
							aviso.setTitle("Introduzca texto");
							aviso.setMessage("Message");
							final EditText 
							
							
							edittext
							
							
							= new EditText(
							
							
							MainActivity
							
							
							.this);
							LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
							
							
							
							edittext.setLayoutParams(lpar);
							
							
							
							aviso.setView(edittext);
							aviso.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									edittext1.setText(edittext.getText().toString());
									edittext1.setVisibility(View.VISIBLE);
									String s = edittext.getText().toString();
									boolean isNumeric = (s != null && s.matches("[0-9]+"));
									//System.out.println("IsNumeric: " + isNumeric);
									if (isNumeric) {
										datos="Si";
									}
									else {
										datos = "No" ;
									} 
									//Comprobar si el elemento está repetido 
									contador1 = 0;
									for(int _repeat47 = 0; _repeat47 < (int)(avisocomentario.size()); _repeat47++) {
										if (contador1 < avisocomentario.size()) {
											if (avisocomentario.get((int)(contador1)).equals(dato)) {
												break;
											}
											else {
												
											}
											//fin 
										}
										else {
											
										}
										contador1++;
									}
									if (contador1 == descripcionavisofiltrocomentario.size()) {
										avisocomentario.add(dato);
										descripcionavisofiltrocomentario.add("Aviso: ".concat(dato.concat("")));
										spinnerfiltrosaviso.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, descripcionavisofiltrocomentario));
										((ArrayAdapter)spinnerfiltrosaviso.getAdapter()).notifyDataSetChanged();
										spinnerfiltrosaviso.setSelection((int)(descripcionavisofiltrocomentario.size() - 1));
									}
									else {
										aviso.setTitle("Title");
										aviso.setMessage("El comentario (".concat(dato.concat(") está repetido ".concat(""))));
										aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
												
											}
										});
										aviso.create().show();
									}
								}
							});
							aviso.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									edittext1.setVisibility(View.INVISIBLE);
								}
							});
							aviso.create().show();
						}
						else {
							
						}
						transferencias.edit().putString("Criterios de búsqueda", "Si").commit();
						transferencias.edit().putString("Filtro comentario", "Si").commit();
					}
					else {
						transferencias.edit().putString("Filtro comentario", "No").commit();
					}
				}
				else {
					
				}
			}
		});
		
		criterios.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				transferencias.edit().putString("Posición criterio", String.valueOf((long)(_position))).commit();
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		button46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button47.setVisibility(View.VISIBLE);
				criterios.setVisibility(View.VISIBLE);
				//Comprobar si existe 
				transferencias.edit().putString("Criterio encontrado", "No").commit();
				if (listacriterios.size() > 0) {
					contador = 0;
					for(int _repeat12 = 0; _repeat12 < (int)(listacriterios.size()); _repeat12++) {
						if (contador < listacriterios.size()) {
							if (filtrocomentario.isChecked()) {
								if (listacriterios.get((int)(contador)).equals(transferencias.getString("Comentario", ""))) {
									transferencias.edit().putString("Criterio encontrado", transferencias.getString("Comentario", "")).commit();
								}
								else {
									
								}
							}
							else {
								
							}
							if (filtrotipocita.isChecked()) {
								if (listacriterios.get((int)(contador)).equals(transferencias.getString("Estado", ""))) {
									transferencias.edit().putString("Criterio encontrado", transferencias.getString("Estado", "")).commit();
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
						contador++;
					}
				}
				else {
					
				}
				if (transferencias.getString("Criterio encontrado", "").equals("No")) {
					if (filtrocomentario.isChecked()) {
						listanombrecriterios.add("Comentario (".concat(transferencias.getString("Comentario", "").concat(")")));
						listacriterios.add(transferencias.getString("Comentario", ""));
					}
					else {
						
					}
					if (filtrotipocita.isChecked()) {
						listanombrecriterios.add("Estado (".concat(transferencias.getString("Estado", "").concat(")")));
						listacriterios.add(transferencias.getString("Estado", ""));
					}
					else {
						
					}
					((ArrayAdapter)criterios.getAdapter()).notifyDataSetChanged();
					criterios.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listanombrecriterios));
					criterios.setSelection((int)(listanombrecriterios.size() - 1));
					if (transferencias.getString("Criterio evento", "").equals("Todos")) {
						
					}
					else {
						
					}
				}
				else {
					aviso.setTitle("Añadir criterio".concat(""));
					aviso.setMessage("Criterio repetido (".concat(transferencias.getString("Estado", "").concat(") ".concat(""))));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
				}
			}
		});
		
		button47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				listanombrecriterios.remove((int)(Double.parseDouble(transferencias.getString("Posición criterio", ""))));
				listacriterios.remove((int)(Double.parseDouble(transferencias.getString("Posición criterio", ""))));
				((ArrayAdapter)criterios.getAdapter()).notifyDataSetChanged();
				criterios.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listanombrecriterios));
				if (listanombrecriterios.size() == 0) {
					button47.setVisibility(View.GONE);
					criterios.setVisibility(View.GONE);
				}
				else {
					
				}
			}
		});
		
		lunes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Criterio lunes", "lunes").commit();
					transferencias.edit().putString("Criterio día de la semana", "lunes").commit();
				}
				else {
					transferencias.edit().putString("Criterio lunes", "No").commit();
					transferencias.edit().putString("Criterio día de la semana", "No").commit();
				}
			}
		});
		
		martes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Criterio martes", "martes").commit();
					transferencias.edit().putString("Criterio día de la semana", "martes").commit();
				}
				else {
					transferencias.edit().putString("Criterio martes", "No").commit();
					transferencias.edit().putString("Criterio día de la semana", "No").commit();
				}
			}
		});
		
		miercoles.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Criterio miércoles", "miércoles").commit();
					transferencias.edit().putString("Criterio día de la semana", "miércoles").commit();
				}
				else {
					transferencias.edit().putString("Criterio miércoles", "No").commit();
					transferencias.edit().putString("Criterio día de la semana", "No").commit();
				}
			}
		});
		
		jueves.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Criterio jueves", "jueves").commit();
					transferencias.edit().putString("Criterio día de la semana", "jueves").commit();
				}
				else {
					transferencias.edit().putString("Criterio jueves", "No").commit();
					transferencias.edit().putString("Criterio día de la semana", "No").commit();
				}
			}
		});
		
		viernes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Criterio viernes", "viernes").commit();
					transferencias.edit().putString("Criterio día de la semana", "viernes").commit();
				}
				else {
					transferencias.edit().putString("Criterio viernes", "No").commit();
					transferencias.edit().putString("Criterio día de la semana", "No").commit();
				}
			}
		});
		
		sabado.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Criterio sábado", "sábado").commit();
					transferencias.edit().putString("Criterio día de la semana", "sábado").commit();
				}
				else {
					transferencias.edit().putString("Criterio sábado", "No").commit();
					transferencias.edit().putString("Criterio día de la semana", "No").commit();
				}
			}
		});
		
		seleccionar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "6");
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "2");
			}
		});
		
		button59.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_cargarconfiguracion();
			}
		});
		
		cargaautomatica.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Cargar configuración automáticamente", "Si").commit();
				}
				else {
					transferencias.edit().putString("Cargar configuración automáticamente", "No").commit();
				}
				_guardarconfiguracion();
			}
		});
		
		checkbox18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Guardar configuración automáticamente", "Si").commit();
				}
				else {
					transferencias.edit().putString("Guardar configuración automáticamente", "No").commit();
				}
				_guardarconfiguracion();
			}
		});
		
		checkbox19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Guardar registro automáticamente", "Si").commit();
				}
				else {
					transferencias.edit().putString("Guardar registro automáticamente", "No").commit();
				}
				if (transferencias.getString("Guardar configuración automáticamente", "").equals("Si")) {
					_guardarconfiguracion();
				}
				else {
					
				}
			}
		});
		
		checkbox20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Cargar registro automáticamente", "Si").commit();
				}
				else {
					transferencias.edit().putString("Cargar registro automáticamente", "No").commit();
				}
				if (transferencias.getString("Guardar configuración automáticamente", "").equals("Si")) {
					_guardarconfiguracion();
				}
				else {
					
				}
			}
		});
		
		checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Primera línea como nombre", "Si").commit();
					primeralineacomonombre = "Si";
				}
				else {
					transferencias.edit().putString("Primera línea como nombre", "No").commit();
					primeralineacomonombre = "No";
				}
				_guardarconfiguracion();
			}
		});
		
		checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Guardar en segundo plano", "Si").commit();
				}
				else {
					transferencias.edit().putString("Guardar en segundo plano", "No").commit();
				}
				_guardarconfiguracion();
			}
		});
		
		limitelineas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				_fechayhora();
				transferencias.edit().putString("Carga rápida a partir de datos", listalimitelineas.get((int)(_position))).commit();
				transferencias.edit().putString("Posición carga rápida a partir de datos", String.valueOf((long)(_position))).commit();
				transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Limite de carga de datos seleccionado ".concat(""))))).commit();
				_actualizarregistroreciente();
				_guardarconfiguracion();
				aviso.setTitle("Aplicaciones");
				aviso.setMessage("Limite de datos ".concat(listalimitelineas.get((int)(_position)).concat("".concat(""))));
				aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				aviso.create().show();
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview5.setText("Carga rápida a partir de número de datos.\nEsta opción se activará a partir de 100 datos y provocará que la aplicación se bloquee hasta que termine la carga.\nDatos actuales: ".concat(transferencias.getString("Líneas", "").concat(". Toque aquí para volver a comprobar. ")));
			}
		});
		
		linear30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Linear30");
			}
		});
		
		button14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				opcionestexto.setVisibility(View.GONE);
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (transferencias.getString("Cambiado", "").equals("Si")) {
					aviso.setTitle("Aviso");
					aviso.setMessage("Si continúa se perderán los últimos cambios. ¿Desea continuar?".concat(""));
					aviso.setPositiveButton("Si", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							transferencias.edit().putString("Cambiado", "No").commit();
							
							nombre.setText("");
						}
					});
					aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
				}
				else {
					
				}
			}
		});
		
		checkdetalles.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					transferencias.edit().putString("Calcular detalles", "Si").commit();
					lineardetalles.setVisibility(View.VISIBLE);
				}
				else {
					transferencias.edit().putString("Calcular detalles", "No").commit();
					lineardetalles.setVisibility(View.GONE);
				}
			}
		});
		
		insertar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					linearinsertar.setVisibility(View.VISIBLE);
				}
				else {
					linearinsertar.setVisibility(View.GONE);
				}
			}
		});
		
		button18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", texto.getText().toString()));
			}
		});
		
		button15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a = textview2.getText().toString();
				b = texto.getText().toString();
				//enviar texto. a título. B texto
				Intent i = new Intent(android.content.Intent.ACTION_SEND); 
				i.setType("text/plain"); i.putExtra(android.content.Intent.EXTRA_SUBJECT, a); i.putExtra(android.content.Intent.EXTRA_TEXT, b); startActivity(Intent.createChooser(i,"Share using"));
				
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Double.parseDouble(transferencias.getString("Caracteres", "")) > 0) {
					transferencias.edit().putString("Parar", "No").commit();
					slist.clear();
					str = texto.getText().toString();
					//calcular número de caracteres. Restar 1
					//String data = "1,2,3,,5,6,,";
					String[] arr1 = str.split("");
					for (int i=0; i<arr1.length; i++){
						slist.add(arr1[i]);
						//System.out.println(split[i]);
					} 
					//System.out.println("Done");
					
					//convertir formato
					textoprogreso.setText("Convirtiendo ");
					
					linearprogreso.setVisibility(View.VISIBLE);
					caracteres = 0;
					textotemporal = texto.getText().toString();
					nombrenota = transferencias.getString("Ruta ficheros", "").concat("/".concat(nombre.getText().toString().concat("-Windows.txt".concat(""))));
					progressbar1.setMax((int)100);
					progressbar1.setIndeterminate(false);
					dato = "";
					str = "";
					temporizador = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									if (caracteres < Double.parseDouble(transferencias.getString("Caracteres", ""))) {
										if (slist.size() > 0) {
											if (caracteres == 0) {
												FileUtil.writeFile(nombrenota, "");
											}
											else {
												transferencias.edit().putString("Método", "1").commit();
												if (transferencias.getString("Método", "").equals("2")) {
													//conversión
													dato = lineas.get((int)(caracteres)).concat("\\r \n");
												}
												else {
													
												}
												transferencias.edit().putString("Método", "1").commit();
												if (transferencias.getString("Método", "").equals("2")) {
													dato = "";
													str = lineas.get((int)(caracteres));
													int maximo = str.length();
													contador = 0;
													for(int _repeat177 = 0; _repeat177 < (int)(maximo); _repeat177++) {
														if (contador < maximo) {
															//conversión
															//CONVERT A CHARACTER TO ASCII
															//char ch = dato;
															//int asci = (int)ch; 
															//char c= dato.charAt(0);
															//dato = c;
															//String s="hello";    
															//for(int i=0; i<str.length();i++){
															//char c = str.charAt(i);
															//dato=dato+c;
															// System.out.println("char at "+i+" index is: "+c);  
															//}
															contador++;
														}
														else {
															
														}
													}
													//try {     
													//Files.write(Paths.get(nombrenota), dato.getBytes(), StandardOpenOption.APPEND); 
													//}catch (IOException e) {     //exception handling left as an exercise for the reader 
													//}
													//}
													//dato=dato+"\n";
													//int asci = (int) valorcaracter;
													
												}
												else {
													
												}
												transferencias.edit().putString("Método", "1").commit();
												if (transferencias.getString("Método", "").equals("2")) {
													str = slist.get((int)(caracteres));
													//int valorcaracter = 'a'; //str.charAt(0);
													//int valorcaracter = str;
													//int valorcaracter = str.charAt(0);
													dato = dato.concat(String.valueOf((long)(valorcaracter)).concat(" - "));
												}
												else {
													
												}
												str = slist.get((int)(caracteres));
												textoprogreso.setText("Convirtiendo carácter ".concat(slist.get((int)(caracteres)).concat("/".concat(String.valueOf((long)(slist.size())).concat(" Dato ".concat(str.concat("")))))));
											}
										}
										else {
											FileUtil.writeFile(nombrenota, texto.getText().toString());
											caracteres = Double.parseDouble(transferencias.getString("Líneas", ""));
										}
										progressbar1.setProgress((int)(caracteres / slist.size()) * 100);
										caracteres++;
									}
									else {
										transferencias.edit().putString("Cargando", "No").commit();
										transferencias.edit().putString("Cargado", "Si").commit();
										textoprogreso.setText("Convirtiendo carácter ".concat(slist.get((int)(caracteres)).concat("/".concat(String.valueOf((long)(slist.size())).concat(" Dato ".concat(str.concat("")))))));
										//fin
										_actualizarlistanotas();
										temporizador.cancel();
									}
									if (transferencias.getString("Parar", "").equals("Si")) {
										transferencias.edit().putString("Parar", "No").commit();
										transferencias.edit().putString("Cargando", "No").commit();
										transferencias.edit().putString("Cargado", "Si").commit();
										textoprogreso.setText("Convertida nota ".concat(String.valueOf((long)(caracteres)).concat("/".concat(String.valueOf((long)(slist.size())).concat("\n".concat(nombrenota.concat("")))))));
										//fin
										_actualizarlistanotas();
										temporizador.cancel();
									}
									else {
										
									}
								}
							});
						}
					};
					_timer.scheduleAtFixedRate(temporizador, (int)(1), (int)(100));
				}
				else {
					
				}
			}
		});
		
		button16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_fechayhora();
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", transferencias.getString("Hora completa", "")));
				texto.requestFocus();
			}
		});
		
		button17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transferencias.edit().putString("Parar", "Si").commit();
				linearprogreso.setVisibility(View.GONE);
			}
		});
		
		texto.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (texto.isEnabled()) {
					
				}
				else {
					texto.setEnabled(true);
				}
			}
		});
		
		texto.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (transferencias.getString("Cargando", "").equals("No")) {
					if (transferencias.getString("Buscando", "").equals("No")) {
						if (_charSeq.equals("")) {
							
						}
						else {
							if (texto.getText().toString().equals(transferencias.getString("Último texto", ""))) {
								botonguardar.setVisibility(View.GONE);
							}
							else {
								transferencias.edit().putString("Último carácter", _charSeq).commit();
								transferencias.edit().putString("Último texto", _charSeq).commit();
								transferencias.edit().putString("Cambiado", "Si").commit();
								botonguardar.setVisibility(View.VISIBLE);
								if (checkdetalles.isChecked()) {
									_calculardetalles();
								}
								else {
									
								}
								if (nombre.getText().toString().equals("")) {
									if (transferencias.getString("Primera línea como nombre", "").equals("Si")) {
										str = texto.getText().toString();
										slist.clear();
										//Cargar lista a partir de un texto 
										//arr es matrix tipo array numérico 
										//str es variable tipo texto 
										//slist es matrix tipo array texto 
										//no se pueden compartir las matrices, por lo tanto, para operar con ellas hay que pasarlas a otra matriz 
										String [] arr = str.split("\n");
										for (int i = 0; i < arr.length; i++) {
											slist.add(arr[i]);
										}
										if (slist.size() > 0) {
											nombre.setText(slist.get((int)(0)));
										}
										else {
											nombre.setText(texto.getText().toString());
										}
									}
									else {
										
									}
									transferencias.edit().putString("Nombre nota", transferencias.getString("Ruta notas temporales", "")).commit();
									transferencias.edit().putString("Nombre nota", transferencias.getString("Nombre nota", "").concat("/".concat("Temporal".concat("-".concat(""))))).commit();
								}
								else {
									transferencias.edit().putString("Nombre nota", transferencias.getString("Ruta notas temporales", "").concat("/".concat(nombre.getText().toString().concat("-".concat(""))))).commit();
								}
								transferencias.edit().putString("Nombre nota", transferencias.getString("Nombre nota", "").concat("-".concat(hora.concat("-".concat(minutos.concat("-".concat(segundos.concat("_".concat(dia.concat("-".concat(mes.concat("-".concat(ano.concat(".txt")))))))))))))).commit();
								FileUtil.writeFile(transferencias.getString("Nombre nota", ""), texto.getText().toString());
								textocambiado.add(nombrenota);
								version.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, textocambiado));
								((ArrayAdapter)version.getAdapter()).notifyDataSetChanged();
							}
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		listviewregistro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
				aviso.setTitle("Registro");
				aviso.setMessage(registro.get((int)(_position)).concat("".concat("".concat(""))));
				aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				aviso.create().show();
			}
		});
		
		button36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		tiporegistro.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (listatiporegistro.get((int)(_position)).equals("Registro general")) {
					_actualizarregistro();
				}
				else {
					
				}
				if (listatiporegistro.get((int)(_position)).equals("Registro de filtro de texto")) {
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("1")) {
						if (Double.parseDouble(registrobidimensional.get((int)0).get("Registros de filtro de texto").toString()) > 0) {
							listatemporal.clear();
							contador = 1;
							for(int _repeat24 = 0; _repeat24 < (int)(Double.parseDouble(registrobidimensional.get((int)0).get("Registros de filtro de texto").toString())); _repeat24++) {
								if (contador < (Double.parseDouble(registrobidimensional.get((int)0).get("Registros de filtro de texto").toString()) + 1)) {
									listatemporal.add("(".concat(String.valueOf((long)(contador)).concat("/".concat(registrobidimensional.get((int)0).get("Registros de filtro de texto").toString().concat(") ".concat(registrobidimensional.get((int)contador).get("Filtro de texto").toString().concat("".concat(""))))))));
									contador++;
								}
								else {
									
								}
							}
						}
						else {
							listatemporal.add("No hay registro de filtro de texto");
						}
						listviewregistro.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, listatemporal));
						((BaseAdapter)listviewregistro.getAdapter()).notifyDataSetChanged();
					}
					else {
						
					}
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("2")) {
						aviso.setTitle("Aplicaciones");
						aviso.setMessage("Registros: ".concat(registrobidimensional.get((int)0).get("Registros de filtro de texto").toString().concat("\n ".concat("Registro 1: ".concat(registrobidimensional.get((int)2).get("Filtro de texto").toString().concat(""))))));
						aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						aviso.create().show();
					}
					else {
						
					}
				}
				else {
					
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		botonagregarregistro.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_fechayhora();
				transferencias.edit().putString("Contador registro", "0").commit();
				transferencias.edit().putString("Datos", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Registro guardado en (".concat(transferencias.getString("Ruta registros", "").concat("/registro general.txt)".concat("".concat("".concat("\n"))))))))).commit();
				for(int _repeat12 = 0; _repeat12 < (int)(registro.size()); _repeat12++) {
					if (Double.parseDouble(transferencias.getString("Contador registro", "")) < registro.size()) {
						if (transferencias.getString("Datos", "").equals("")) {
							transferencias.edit().putString("Datos", registro.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))).concat("\n")).commit();
						}
						else {
							transferencias.edit().putString("Datos", transferencias.getString("Datos", "").concat(registro.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))).concat("\n"))).commit();
						}
					}
					else {
						
					}
					transferencias.edit().putString("Contador registro", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador registro", "")) + 1))).commit();
				}
				FileUtil.writeFile(transferencias.getString("Ruta registros", "").concat("/registro general.txt"), transferencias.getString("Datos", ""));
			}
		});
		
		button60.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
		/* última copia 22/11/24
Copia para restaurar la rutina de carga 14/11/24
Todo parece en orden excepto la rutina para cargar archivo que no está bien coordinada. Mejorada coordinación y velocidad de carga de archivos.
Si se abusa del módulo registro, bloqueara la aplicación. 
-----------------------
Teóricamente corregida rutina del módulo mostrar registro reciente para que añada datos al archivo en vez de recopilar todos y guardarlos. 29/11/24
Comprobado que la rutina de fin de carga de archivo se ejecuta. 29/11/24
Falta la rutina para mostrar la notificación. 
Botones para guardar avisos después de borrar todo aparentemente corregidos. 20/11/24
Rutina de carga aparentemente corregida. 15/11/24
Teóricamente rutina para guardar avisos completada. 
En proceso de terminar la carga de avisos nuevos 18/10/24
Falta corregir rutina de carga. 
Rutina para guardar avisos teóricamente corregida. 13/11/24
No guarda bien los datos de los avisos. Probar. 11/11/24
Terminado guardar configuración automáticamente, cargar configuración automáticamente y guardar registro automáticamente 11/11/24
Copia restaurada debido a fallos de carga de datos. 11/11/24
Corregido botón de guardar oculto sin datos y rutina para leer avisos de audio y añadida rutina para guardar avisos en matriz permanente que faltaba en el botón guardar datos temporales. 4/11/24
Añadido botón para borrar todo y corregidas rutinas relacionadas (no probado) 3/11/24
Añadida rutina para asegurar que el nombre del archivo copiado no sea demasiado largo 19/9/24
18/9/24 añadido botón para hacer copias 
2/8/24 añadidas rutinas para guardar y cargar avisos. Falta corregir el informe de avisos para que muestre los avisos archivados 
28/8/24 añadida opción para mostrar la fecha actual 
26/8/24 configuración supuestamente corregida 
25/8/24: creando rutina para guardar avisos.
20,16,13,10/9,8,7,6,5,4,3,2/8/24,31/7/24. Informe de avisos corregido, 27,26,25, 22/7/24, 21/7/24, 18/7/24,15/7/24, 11/7/24, 17/1/24. 661. Corrigiendo limite de datos en configuración. 
Fallo a partir de la segunda carga de archivo aparentemente corregido. Velocidad de carga teóricamente corregida, Configuración de pantalla y calendario teóricamente corregidos. Añadiendo comprobación de aviso repetido.
La rutina para cargar el archivo de configuración general está en el módulo cargar variables 
 Filtro aparentemente corregido. Renovación de notificaciones en proceso. Corregidos fallos que se mostraban a partir de Android 12.  Falta perfeccionar filtro de búsqueda. Terminada notificación. Reformando criterios de aviso Corregida variable de establecimientos de ruta. Añadida función para obtener el número de días del mes en el filtro. Añadido criterio solo días. Añadida notificación persistente. La rutina para crear la lista de casillas está en textoexceptodiasdelmes. Corregida rutina para guardar solo días. Corregida rutina de copia de fechas. Añadida nueva función para copiar pero no ha de sido probada

*/
		//getSupportActionBar().hide();
		//barra
		//no funciona 
		((ViewGroup)barra.getParent()).removeView(barra);
		//_toolbar.addView(herramientas);
		//horizontal.setOnTouchListener(new
		//OnTouchListener() {
		//public boolean onTouch(View v,
		//MotionEvent event) {
		//if (event.getAction()==
		//MotionEvent.ACTION_MOVE){
		//float x = Math.round(event.getX());
		//float y = Math.round(event.getY());
		//textview1.setText(String.valueOf(x));
		//textview2.setText(String.valueOf(y));
		//horizontal.setTranslationX((float)(x));
		//}
		//return true;
		//}
		//});
		//getSupportActionBar().hide();
		borrarevento.setPadding(0, 0, 0, 0);
		spinnerbusqueda.setPadding(0, 0, 0, 0);
		textobusqueda.setPadding(0, 0, 0, 0);
		registroizquierda.setPadding(0, 0, 0, 0);
		registroderecha.setPadding(0, 0, 0, 0);
		deslizartexto.setPadding(0, 0, 0, 0);
		//contenedortexto.setPadding(0, 0, 0, 0);
		dimensiones.setPadding(0, 0, 0, 0);
		barraherramientas.setPadding(0, 0, 0, 0);
		deslizarherramientas.setPadding(0, 0, 0, 0);
		linear1.setPadding(0, 0, 0, 0);
		cuadrosecciones.setPadding(0, 0, 0, 0);
		//horizontal.setPadding(0, 0, 0, 0);
		principal1.setPadding(0, 0, 0, 0);
		//orden.setPadding(0, 0, 0, 0);
		cuadropantalla.setPadding(0, 0, 0, 0);
		linearmover.setPadding(0, 0, 0, 0);
		cerrarherramientapantalla.setPadding(0, 0, 0, 0);
		textopantalla.setPadding(0, 0, 0, 0);
		parte.setPadding(0, 0, 0, 0);
		tipoconfiguracion.setPadding(0, 0, 0, 0);
		textodimensiones.setPadding(0, 0, 0, 0);
		cuadroeditar.setPadding(0, 0, 0, 0);
		linear55.setPadding(0, 0, 0, 0);
		textview9.setPadding(0, 0, 0, 0);
		botonguardarcalendario. setPadding(0, 0, 0, 0);
		botonbuscar.setPadding(0, 0, 0, 0);
		//notificaciones 
		//Animation anim1 =new AlphaAnimation(0.0f,1.0f); 
		//anim1.setDuration(1000);
		//anim1.setStartOffset(100);
		//anim1.setRepeatMode(Animation.REVERSE);
		//anim1.setRepeatCount(Animation.INFINITE);
		//arghozali.startAnimation(anim1);
		//
		metodo = "1";
		if (metodo.equals("2")) {
			cuadrosecciones.setVisibility(View.GONE);
		}
		else {
			
		}
		transferencias.edit().putString("Ruta", FileUtil.getExternalStorageDir().concat("/calculador general")).commit();
		transferencias.edit().putString("Ruta 1", FileUtil.getExternalStorageDir().concat("/calculador general")).commit();
		transferencias.edit().putString("Ruta ficheros", transferencias.getString("Ruta", "").concat("/ficheros")).commit();
		transferencias.edit().putString("Ruta fichero", transferencias.getString("Ruta", "").concat("/ficheros")).commit();
		transferencias.edit().putString("Ruta registro", transferencias.getString("Ruta 1", "").concat("/registro/registro general.txt")).commit();
		transferencias.edit().putString("Ruta configuración", transferencias.getString("Ruta 1", "").concat("/configuración")).commit();
		transferencias.edit().putString("Ruta configuración pantalla", transferencias.getString("Ruta 1", "").concat("/configuración pantalla")).commit();
		transferencias.edit().putString("Ruta registros", transferencias.getString("Ruta 1", "").concat("/registros")).commit();
		transferencias.edit().putString("Ruta copias", transferencias.getString("Ruta 1", "").concat("/copias")).commit();
		rutaficheros = FileUtil.getExternalStorageDir().concat("/calculador general/ficheros");
		if (FileUtil.isDirectory(transferencias.getString("Ruta 1", ""))) {
			
		}
		else {
			FileUtil.makeDir(transferencias.getString("Ruta 1", ""));
		}
		if (FileUtil.isDirectory(rutaficheros)) {
			
		}
		else {
			FileUtil.makeDir(rutaficheros);
		}
		if (FileUtil.isDirectory(transferencias.getString("Ruta registros", ""))) {
			
		}
		else {
			FileUtil.makeDir(transferencias.getString("Ruta registros", ""));
		}
		transferencias.edit().putString("Dato", FileUtil.readFile(transferencias.getString("Ruta", "").concat("/reiniciado"))).commit();
		if (transferencias.getString("Dato", "").equals("Si")) {
			SketchwareUtil.showMessage(getApplicationContext(), "Detectado error de cierre. Reiniciando");
			FileUtil.writeFile(transferencias.getString("Ruta", "").concat("/reiniciado"), "No");
		}
		else {
			
		}
		contadormaximo = 1;
		if (FileUtil.isExistFile(transferencias.getString("Ruta", "").concat("/activo"))) {
			FileUtil.listDir(transferencias.getString("Ficheros", "").concat("/"), ficheros);
			if (fecha.size() == 0) {
				transferencias.edit().putString("Reiniciado", "Si").commit();
				FileUtil.deleteFile(transferencias.getString("Ruta", "").concat("/activo"));
				FileUtil.writeFile(transferencias.getString("Ruta", "").concat("/reiniciado"), "Si");
				_cargarvariables();
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					_cerrar();
					principal.setClass(getApplicationContext(), MainActivity.class);
					startActivity(principal);
				}
				else {
					
				}
				if (transferencias.getString("Reiniciado", "").equals("No")) {
					
				}
				else {
					
				}
			}
			else {
				
			}
		}
		else {
			//Esto incluye la rutina para cargar el archivo de configuración general 
			_cargarvariables();
		}
		transferencias.edit().putString("Modo", "1").commit();
		if (transferencias.getString("Modo", "").equals("1")) {
			
		}
		else {
			
		}
		_ventanaeditar();
		textoposicion.setVisibility(View.GONE);
		edittext1.setVisibility(View.INVISIBLE);
		separador3.setVisibility(View.GONE);
		separador4.setVisibility(View.GONE);
		separador2.setVisibility(View.GONE);
		separador.setVisibility(View.GONE);
		separador1.setVisibility(View.GONE);
		separador5.setVisibility(View.GONE);
		linearprogreso.setVisibility(View.GONE);
		separadorbuscar.setVisibility(View.GONE);
		separadorbarra.setVisibility(View.GONE);
		separadornotas1.setVisibility(View.GONE);
		separadorregistro.setVisibility(View.GONE);
		separadorregistro1.setVisibility(View.GONE);
		tipoconfiguracion.setVisibility(View.INVISIBLE);
		calendarview1.setVisibility(View.GONE);
		separadorcalendario2.setVisibility(View.GONE);
		separadorcalendario3.setVisibility(View.GONE);
		separadorcalendario.setVisibility(View.GONE);
		separadorcalendario1.setVisibility(View.GONE);
		separadorcalendario4.setEnabled(false);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_FICHERO:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				transferencias.edit().putString("Nombre nota", _filePath.get((int)(0))).commit();
				notas = transferencias.getString("Nombre nota", "");
				transferencias.edit().putString("Editando", "Si").commit();
				//eliminar extensión
				str = Uri.parse(transferencias.getString("Nombre nota", "")).getLastPathSegment();
				//Para realizar un right Trim
				//dato= str.replaceAll("\\s+$",Uri.parse(ficheros.get((int)(contador))).getLastPathSegment());
				//dato=  str.replaceAll("^\\s+$",Uri.parse(ficheros.get((int)(contador))).getLastPathSegment());
				
				slist.clear();
				//calcular número de caracteres. Restar 1
				//String data = "1,2,3,,5,6,,";
				String[] arr1 = str.split("");
				for (int i=0; i<arr1.length; i++){
					slist.add(arr1[i]);
					//System.out.println(split[i]);
				} 
				//System.out.println("Done");
				
				dato = "";
				caracteres = 0;
				for(int _repeat116 = 0; _repeat116 < (int)(slist.size()); _repeat116++) {
					if (caracteres < slist.size()) {
						if (slist.get((int)(caracteres)).equals(".")) {
							position = caracteres;
							if ((caracteres + 4) == slist.size()) {
								if (slist.get((int)(caracteres + 1)).equals("t") && (slist.get((int)(caracteres + 2)).equals("x") && slist.get((int)(caracteres + 3)).equals("t"))) {
									caracteres = slist.size();
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							dato = dato.concat(slist.get((int)(caracteres)));
						}
						caracteres++;
					}
					else {
						listanotas.add(dato);
						listview1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, listanotas));
						((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
					}
				}
				//obtener ruta
				slist.clear();
				str = _filePath.get((int)(0));
				String [] arr2 = str.split("/");
				for (int i = 0; i < arr2.length; i++) {
					slist.add(arr2[i]);
				}
				transferencias.edit().putString("Ruta ficheros", slist.get((int)(0))).commit();
				contador = 1;
				for(int _repeat220 = 0; _repeat220 < (int)(slist.size()); _repeat220++) {
					if (contador < (slist.size() - 1)) {
						transferencias.edit().putString("Ruta ficheros", transferencias.getString("Ruta ficheros", "").concat("/".concat(slist.get((int)(contador))))).commit();
						contador++;
					}
					else {
						
					}
				}
				//fin 
				transferencias.edit().putString("Nombre nota", dato).commit();
				transferencias.edit().putString("Nota", "Cargar").commit();
				transferencias.edit().putString("Importar", "Si").commit();
				_configurarnotas();
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					_ocultaropciones();
					cuadrocargar.setVisibility(View.VISIBLE);
					
					//abrir fichero 
					str = FileUtil.readFile(transferencias.getString("Nombre nota", ""));
					slist.clear();
					//String [] arr = str.split("\n");
					//for (int i = 0; i < arr.length; i++) {
					//slist.add(arr[i]);
					//}
					contador = 1;
					texto.setText("");
					if (slist.size() > 1) {
						transferencias.edit().putString("Dato", slist.get((int)(0))).commit();
						temporizador = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (contador < slist.size()) {
											transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(slist.get((int)(contador)))).commit();
											textocargar.setText("Cargando (".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(slist.size())).concat("). ".concat(slist.get((int)(contador)).concat(" de ".concat(transferencias.getString("Nombre nota", "").concat("")))))))));
											contador++;
										}
										else {
											cuadrocargar.setVisibility(View.GONE);
											_mostraredicion();
											_ocultarsecciones();
											linearnotas.setVisibility(View.VISIBLE);
											texto.setText(transferencias.getString("Dato", ""));
											temporizador.cancel();
										}
									}
								});
							}
						};
						_timer.scheduleAtFixedRate(temporizador, (int)(1), (int)(1));
					}
					else {
						transferencias.edit().putString("Dato", FileUtil.readFile(dato)).commit();
						texto.setText(transferencias.getString("Dato", ""));
					}
					textonotas.setText("Nota ".concat(dato.concat(". Líneas: ".concat(String.valueOf((long)(slist.size())).concat("")))));
					transferencias.edit().putString("Sección", "Editando").commit();
				}
				else {
					
				}
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (transferencias.getString("Sección", "").equals("Ficheros")) {
			aviso.setTitle("¿Mantener aplicacion en segundo plano o cerrar?");
			aviso.setMessage("".concat("".concat("".concat(""))));
			aviso.setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					finishAffinity();
				}
			});
			aviso.setNegativeButton("Mantener", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					moveTaskToBack(true);
					SketchwareUtil.showMessage(getApplicationContext(), "Calculador general en segundo plano ");
				}
			});
			aviso.create().show();
		}
		else {
			
		}
		if (transferencias.getString("Sección", "").equals("Calendario")) {
			transferencias.edit().putString("Mostrar sección", "Ficheros").commit();
			_mostrarseccion();
			_actualizarlistanotas();
			_ocultaropciones();
			transferencias.edit().putString("Mostrar opción", "").commit();
			transferencias.edit().putString("Sección", "Ficheros").commit();
		}
		else {
			
		}
		if (transferencias.getString("Sección", "").equals("Buscar por lista")) {
			checkbox4.setChecked(false);
			transferencias.edit().putString("Mostrar sección", "Editar").commit();
			_mostrarseccion();
			transferencias.edit().putString("Texto seleccionado", "").commit();
		}
		else {
			
		}
		if (transferencias.getString("Sección", "").equals("Principal")) {
			FileUtil.deleteFile(ruta.concat("/activo"));
			finish();
		}
		else {
			
		}
		if (transferencias.getString("Sección", "").equals("Registro")) {
			if (texto.getText().toString().equals("")) {
				transferencias.edit().putString("Mostrar sección", "Lista de notas").commit();
				_mostrarseccion();
				transferencias.edit().putString("Mostrar opción", "Lista de notas").commit();
				_mostraropcion();
			}
			else {
				transferencias.edit().putString("Mostrar sección", "Editar").commit();
				_mostrarseccion();
				transferencias.edit().putString("Mostrar opción", "Editar").commit();
				_mostraropcion();
			}
		}
		else {
			
		}
		if (transferencias.getString("Sección", "").equals("Editar")) {
			if (transferencias.getString("Editando", "").equals("Si")) {
				if (transferencias.getString("Cambiado", "").equals("Si")) {
					if (transferencias.getString("Guardar en segundo plano", "").equals("Si")) {
						transferencias.edit().putString("Editando", "Si").commit();
						transferencias.edit().putString("Cargado", "Si").commit();
						transferencias.edit().putString("Sección", "Editar").commit();
						_guardar();
					}
					else {
						
					}
					aviso.setTitle("Aviso");
					aviso.setMessage("No se ha guardado el último cambio. Si sale de la aplicación se perderán los cambios. ¿Desea salir? ".concat(""));
					aviso.setPositiveButton("Si", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							transferencias.edit().putString("Cambiado", "No").commit();
							transferencias.edit().putString("Cargado", "Si").commit();
							transferencias.edit().putString("Sección", "Notas").commit();
							transferencias.edit().putString("Mostrar sección", "Lista de notas").commit();
							_mostrarseccion();
							transferencias.edit().putString("Mostrar opción", "Lista de notas").commit();
							_mostraropcion();
							texto.setText("");
							nombre.setText("");
							transferencias.edit().putString("Nombre nota", "").commit();
						}
					});
					aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
				}
				else {
					if (editando) {
						
					}
					else {
						
					}
					editando = false;
					transferencias.edit().putString("Cargado", "Si").commit();
					transferencias.edit().putString("Editando", "No").commit();
					transferencias.edit().putString("Sección", "Notas").commit();
					transferencias.edit().putString("Mostrar sección", "Lista de notas").commit();
					_mostrarseccion();
					transferencias.edit().putString("Mostrar opción", "Lista de notas").commit();
					_mostraropcion();
					texto.setText("");
					nombre.setText("");
					transferencias.edit().putString("Nombre nota", "").commit();
					if (listview1.getTranslationY() == 0) {
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Método", "").equals("2")) {
							listview1.setTranslationY((float)(listview1.getTranslationY() - 900));
							_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), principal1.getHeight(), principal1);
						}
						else {
							
						}
					}
					else {
						
					}
				}
			}
			else {
				
			}
		}
		else {
			
		}
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, 1, 0, "Organizar pantalla");
		menu.add(0, 2, 0, "Cargar configuración de pantalla");
		menu.add(0, 3, 0, "Barra de herramientas");
		menu.add(0, 4, 0, "Calendario");
		menu.add(0, 5, 0, "Ficheros");
		menu.add(0, 6, 0, "Nueva nota");
		menu.add(0, 7, 0, "Abrir fichero");
		menu.add(0, 8, 0, "Buscar");
		menu.add(0, 9, 0, "Registro");
		menu.add(0, 10, 0, "Configuración");
		menu.add(0, 11, 0, "Información");
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		final int _id = item.getItemId();
		final String _title = (String) item.getTitle();
		if (_title.equals("Organizar pantalla")) {
			transferencias.edit().putString("Mostrar opción", "Organizar").commit();
			_mostraropcion();
			cuadropantalla.setTranslationY((float)(-30));
		}
		else {
			
		}
		if (_title.equals("Barra de herramientas")) {
			_ocultaropciones();
			barraherramientas.setVisibility(View.VISIBLE);
			if (transferencias.getString("Sección", "").equals("Editar")) {
				edicion.setVisibility(View.VISIBLE);
				edicion.setTranslationY((float)(-50));
			}
			else {
				
			}
		}
		else {
			
		}
		if (_title.equals("Información")) {
			aviso.setTitle("Información");
			aviso.setMessage("22/5/23");
			aviso.setPositiveButton(" Cerrar aviso. ", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			aviso.create().show();
		}
		else {
			
		}
		if (_title.equals("Cargar configuración de pantalla")) {
			_cargarconfiguracionpantalla();
		}
		else {
			
		}
		if (_title.equals("Ficheros")) {
			transferencias.edit().putString("Mostrar sección", "Ficheros").commit();
			_mostrarseccion();
			transferencias.edit().putString("Mostrar opción", "Ficheros").commit();
			_mostraropcion();
		}
		else {
			
		}
		if (_title.equals("Registro")) {
			transferencias.edit().putString("Mostrar sección", "Registro").commit();
			_mostrarseccion();
			transferencias.edit().putString("Sección", "Registro").commit();
			SketchwareUtil.showMessage(getApplicationContext(), "Registro. ".concat(String.valueOf((long)(listviewregistro.getTranslationY()))));
			_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), SketchwareUtil.getDisplayHeightPixels(getApplicationContext()), linearregistro);
			if (listviewregistro.getTranslationY() == 0) {
				listviewregistro.setTranslationY((float)(listviewregistro.getTranslationY() - 10));
			}
			else {
				
			}
		}
		else {
			
		}
		if (_title.equals("Abrir fichero")) {
			transferencias.edit().putString("Abrir", "No").commit();
			if (transferencias.getString("Cambiado", "").equals("Si")) {
				aviso.setTitle("Aviso");
				aviso.setMessage("La nota actual ha sido modificada. Si continúa se perderán los cambios. ¿Desea continuar? ".concat("".concat("".concat(""))));
				aviso.setPositiveButton("Si", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						transferencias.edit().putString("Abrir", "Si").commit();
						transferencias.edit().putString("Cambiado", "No").commit();
					}
				});
				aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						transferencias.edit().putString("Abrir", "No").commit();
					}
				});
				aviso.create().show();
			}
			else {
				transferencias.edit().putString("Abrir", "Si").commit();
			}
			if (transferencias.getString("Abrir", "").equals("Si")) {
				startActivityForResult(fichero, REQ_CD_FICHERO);
			}
			else {
				
			}
		}
		else {
			
		}
		if (_title.equals("Buscar")) {
			transferencias.edit().putString("Mostrar opción", "Buscar").commit();
			_mostraropcion();
			transferencias.edit().putString("Tipo de búsqueda", "Texto").commit();
			if (transferencias.getString("Sección", "").equals("Calendario")) {
				opcionbuscarcalendario.setVisibility(View.VISIBLE);
			}
			else {
				
			}
		}
		else {
			
		}
		if (_title.equals("Calendario")) {
			transferencias.edit().putString("Mostrar opción", "Calendario").commit();
			_mostraropcion();
			transferencias.edit().putString("Mostrar sección", "Calendario").commit();
			_mostrarseccion();
		}
		else {
			
		}
		if (_title.equals("Configuración")) {
			transferencias.edit().putString("Mostrar opción", "Configuración").commit();
			_mostraropcion();
			transferencias.edit().putString("Mostrar sección", "Configuración").commit();
			_mostrarseccion();
		}
		else {
			
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		_proximoaviso();
	}
	public void _moverhorizonal() {
		horizontal.setTranslationX((float)(x));
	}
	
	
	public void _prueba() {
		
	}
	
	
	public void _actualizar() {
		
	}
	
	
	public void _mostrareditar() {
		editando = true;
		editar.setVisibility(View.VISIBLE);
		principal1.setVisibility(View.GONE);
	}
	
	
	public void _mostrarlista() {
		_ocultaropciones();
		barraherramientas.setVisibility(View.VISIBLE);
		cuadroficheros.setVisibility(View.VISIBLE);
		principal1.setVisibility(View.VISIBLE);
		configuracion.setVisibility(View.GONE);
		editar.setVisibility(View.GONE);
	}
	
	
	public void _actualizareditar() {
		
	}
	
	
	public void _guardarconfiguracion() {
		if (transferencias.getString("Cargando configuración", "").equals("No")) {
			transferencias.edit().putString("Configuración", "Primera línea como nombre\n".concat(transferencias.getString("Primera línea como nombre", "").concat("\n"))).commit();
			transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("Cargar configuración automáticamente\n".concat(transferencias.getString("Cargar configuración automáticamente", "").concat("\n")))).commit();
			transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("Guardar en segundo plano\n".concat(transferencias.getString("Guardar en segundo plano", "").concat("\n")))).commit();
			transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("Carga rápida a partir de datos\n".concat(transferencias.getString("Posición carga rápida a partir de datos", "").concat("\n".concat(transferencias.getString("Carga rápida a partir de datos", "").concat("\n")))))).commit();
			transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("Guardar configuración automáticamente\n".concat(transferencias.getString("Guardar configuración automáticamente", "").concat("\n")))).commit();
			transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("Cargar registro automáticamente\n".concat(transferencias.getString("Cargar registro automáticamente", "").concat("\n")))).commit();
			transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("Guardar registro automáticamente\n".concat(transferencias.getString("Guardar registro automáticamente", "").concat("\n")))).commit();
			transferencias.edit().putString("Método", "1").commit();
			if (transferencias.getString("Método", "").equals("2")) {
				transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("(Ancho editar)\n".concat(String.valueOf((long)(anchoeditar)).concat("\n")))).commit();
				transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("(Alto editar)\n".concat(String.valueOf((long)(altoeditar)).concat("\n")))).commit();
				transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("(Lista de notas)\n".concat(transferencias.getString("Posición vertical lista de notas", "").concat("\n")))).commit();
			}
			else {
				
			}
			FileUtil.writeFile(transferencias.getString("Ruta configuración", ""), transferencias.getString("Configuración", ""));
			transferencias.edit().putString("Configuración cambiada", "No").commit();
			botonguardarconfiguracion.setVisibility(View.INVISIBLE);
			listview1.setBackgroundColor(Color.TRANSPARENT);
			transferencias.edit().putString("Registro", "Guardada configuración. ".concat("")).commit();
			_actualizarregistroreciente();
			SketchwareUtil.showMessage(getApplicationContext(), "Configuración guardada ");
		}
		else {
			
		}
	}
	
	
	public void _actualizarlistanotas() {
		FileUtil.listDir(rutaficheros.concat("/"), ficheros);
		contador = 0;
		if (ficheros.size() > 0) {
			transferencias.edit().putString("Mostrar sección", "Lista de notas").commit();
			_mostrarseccion();
			listanotas.clear();
			listview1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, listanotas));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
			temporizador = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							if (contador < ficheros.size()) {
								if (Uri.parse(ficheros.get((int)(contador))).getLastPathSegment().contains(".txt")) {
									//eliminar extensión
									str = Uri.parse(ficheros.get((int)(contador))).getLastPathSegment();
									//Para realizar un right Trim
									//dato= str.replaceAll("\\s+$",Uri.parse(ficheros.get((int)(contador))).getLastPathSegment());
									//dato=  str.replaceAll("^\\s+$",Uri.parse(ficheros.get((int)(contador))).getLastPathSegment());
									
									slist.clear();
									//calcular número de caracteres. Restar 1
									//String data = "1,2,3,,5,6,,";
									String[] arr1 = str.split("");
									for (int i=0; i<arr1.length; i++){
										slist.add(arr1[i]);
										//System.out.println(split[i]);
									} 
									//System.out.println("Done");
									
									dato = "";
									caracteres = 0;
									for(int _repeat142 = 0; _repeat142 < (int)(slist.size()); _repeat142++) {
										if (caracteres < slist.size()) {
											if (slist.get((int)(caracteres)).equals(".")) {
												position = caracteres;
												if ((caracteres + 4) == slist.size()) {
													if (slist.get((int)(caracteres + 1)).equals("t") && (slist.get((int)(caracteres + 2)).equals("x") && slist.get((int)(caracteres + 3)).equals("t"))) {
														caracteres = slist.size();
													}
													else {
														
													}
												}
												else {
													
												}
											}
											else {
												dato = dato.concat(slist.get((int)(caracteres)));
											}
											caracteres++;
										}
										else {
											
										}
									}
									//fin
									listanotas.add(dato);
									listview1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, listanotas));
									((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
									textonotas.setText("Cargando notas ".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(listanotas.size())).concat("")))));
									aviso.setTitle("Aplicaciones");
									aviso.setMessage(dato.concat("".concat("".concat(""))));
									aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
										@Override
										public void onClick(DialogInterface _dialog, int _which) {
											
										}
									});
								}
								else {
									
								}
								contador++;
							}
							else {
								if (listanotas.size() == 0) {
									listanotas.add("No hay notas");
									listview1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, listanotas));
									((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
								}
								else {
									
								}
								textonotas.setText("Notas: ".concat(String.valueOf((long)(listanotas.size())).concat("".concat("".concat("")))));
								temporizador.cancel();
							}
						}
					});
				}
			};
			_timer.scheduleAtFixedRate(temporizador, (int)(1), (int)(1));
		}
		else {
			textonotas.setText("Notas: ".concat(String.valueOf((long)(listanotas.size())).concat("".concat("".concat("")))));
		}
		//fin 
		contador = 0;
	}
	
	
	public void _configurarnotas() {
		contadorconfigurarnota++;
		_fechayhora();
		veces = 0;
		registro.add("Acción nota: ".concat(transferencias.getString("Nombre nota", "").concat(". Número: ".concat(String.valueOf((long)(contadorconfigurarnota)).concat(". Cargando: ".concat(transferencias.getString("Cargando", "").concat("")))))));
		transferencias.edit().putString("Cambiado1", "No").commit();
		if (transferencias.getString("Nota", "").equals("Cargar")) {
			transferencias.edit().putString("Mostrar opción", "Cargar").commit();
			_mostraropcion();
			transferencias.edit().putString("Nota", "No").commit();
			transferencias.edit().putString("Cargado", "No").commit();
			transferencias.edit().putString("Cambiado1", "No").commit();
			transferencias.edit().putString("Cargando", "Si").commit();
			transferencias.edit().putString("Último nombre", transferencias.getString("Nombre nota", "")).commit();
			nombre.setText(transferencias.getString("Nombre nota", ""));
			progressbar1.setProgress((int)100);
			transferencias.edit().putString("Método1", "1").commit();
			if (transferencias.getString("Método1", "").equals("2")) {
				principal1.setVisibility(View.GONE);
				opcionestexto.setVisibility(View.GONE);
				linearregistro.setVisibility(View.GONE);
				configuracion.setVisibility(View.GONE);
			}
			else {
				
			}
			//cargar texto
			contador = 0;
			if (transferencias.getString("Importar", "").equals("No")) {
				
			}
			else {
				
			}
			if (transferencias.getString("Recargar", "").equals("No")) {
				
			}
			else {
				
			}
			slist.clear();
			str = FileUtil.readFile(transferencias.getString("Ruta fichero", "").concat("/".concat(transferencias.getString("Nombre nota", "").concat(".txt"))));
			String [] arr1 = str.split("\n");
			for (int i = 0; i < arr1.length; i++) {
				slist.add(arr1[i]);
			}
			parar = false;
			transferencias.edit().putString("Método", "1").commit();
			if (transferencias.getString("Método", "").equals("2")) {
				//leer archivo con barra de programación. No funciona
				temporizador = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								//String [] arr = str.split("\n");
								//for (int i = 0; i < arr.length; i++) {
								//slist.add(arr[i]);
								//Thread.sleep(10);
								//String [] arr = str.split("\n");
								//int i = 0;
								//while(parar = false) {
								//String [] arr = str.split("\n");
								//int i = 0;
								//     if(i < arr.length) {
								//           slist.add(arr[i]);
								//    }
								//    else {
								//        break;
								// }
								//   i++;
								//Thread.sleep(10);
								//}
								//else {
								//break;
								//}
								//i++;
								textoprogreso.setText("Leyendo líneas: ".concat(String.valueOf((long)(0)).concat("")));
								//Thread.sleep(10);
								//}
								parar = true;
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(temporizador, (int)(1), (int)(1));
			}
			else {
				
			}
			transferencias.edit().putString("Líneas", String.valueOf((long)(slist.size()))).commit();
			//establece número de datos en una opción de la configuración 
			textview5.setText("Carga rápida a partir de número de datos.\nEsta opción se activará a partir de 100 datos y provocará que la aplicación se bloquee hasta que termine la carga. Datos actuales: ".concat(transferencias.getString("Líneas", "").concat("")));
			transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Cargando archivo (".concat(transferencias.getString("Nombre nota", "").concat("). Líneas: ".concat(String.valueOf((long)(slist.size())).concat(". Mostrar carga a partir de líneas: ".concat(transferencias.getString("Carga rápida a partir de datos", "").concat("")))))))))).commit();
			if (slist.size() > 13) {
				transferencias.edit().putString("Tarea", "No").commit();
				progressbar1.setIndeterminate(false);
				cuadrocargar.setVisibility(View.VISIBLE);
				progressbar1.setMax((int)100);
				texto.setText("");
				textoprogreso.setText("Cargando líneas");
				lineas.clear();
				listabuscar.clear();
				listadia.clear();
				listames.clear();
				listaano.clear();
				estado.clear();
				comentarios.clear();
				listaestado.clear();
				horadesde.clear();
				horahasta.clear();
				listanombrehorario.clear();
				nombrehorariopersonalizado.clear();
				horadesdepersonalizado.clear();
				horahastapersonalizado.clear();
				horarioseleccionado.clear();
				listacriterios.clear();
				listanombrecriterios.clear();
				avisodia.clear();
				avisomes.clear();
				avisoano.clear();
				listaavisoseventospersonalizados.clear();
				listaavisosmomentospersonalizados.clear();
				listaavisosformaspersonalizadas.clear();
				listaavisosfiltrospersonalizados.clear();
				avisoseventostemporal.clear();
				avisosmomentostemporal.clear();
				avisosformastemporal.clear();
				avisosfiltrotemporal.clear();
				avisoaudiotemporal.add("No");
				avisosfiltrotemporal.add("No");
				contadorcargar = 0;
				//Esto controla que método se va a usar para cargar el archivo dependiendo del límite de datos 
				if (Double.parseDouble(transferencias.getString("Carga rápida a partir de datos", "")) > 0) {
					if ((Double.parseDouble(transferencias.getString("Líneas", "")) == Double.parseDouble(transferencias.getString("Carga rápida a partir de datos", ""))) || (Double.parseDouble(transferencias.getString("Líneas", "")) > Double.parseDouble(transferencias.getString("Carga rápida a partir de datos", "")))) {
						transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Carga rápida. Número de datos: ".concat(transferencias.getString("Líneas", "").concat(". Limite de datos: ".concat(transferencias.getString("Carga rápida a partir de datos", "").concat("".concat(""))))))))).commit();
						//registro 
						if (registro.size() > 0) {
							registro.set((int)0, transferencias.getString("Registro", ""));
						}
						else {
							registro.add(transferencias.getString("Registro", ""));
						}
						listviewregistro.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, registro));
						((BaseAdapter)listviewregistro.getAdapter()).notifyDataSetChanged();
						if (transferencias.getString("Actualizando registro", "").equals("No")) {
							transferencias.edit().putString("Actualizando registro", "Si").commit();
							transferencias.edit().putString("Registro", "").commit();
							if (transferencias.getString("Guardar registro automáticamente", "").equals("Si")) {
								transferencias.edit().putString("Datos", "").commit();
								transferencias.edit().putString("Contador registro", "0").commit();
								if (registro.size() > 0) {
									for(int _repeat3419 = 0; _repeat3419 < (int)(registro.size()); _repeat3419++) {
										if (transferencias.getString("Contador registro", "").length() < registro.size()) {
											transferencias.edit().putString("Datos", transferencias.getString("Datos", "").concat(registro.get((int)(Double.parseDouble(transferencias.getString("Contador registro", "")))).concat("\n"))).commit();
											transferencias.edit().putString("Contador registro", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador registro", "")) + 1))).commit();
										}
										else {
											
										}
									}
									FileUtil.copyFile(transferencias.getString("Datos", ""), transferencias.getString("Ruta registro", ""));
								}
								else {
									
								}
							}
							else {
								
							}
							transferencias.edit().putString("Actualizando registro", "No").commit();
						}
						else {
							
						}
						//fin de registro 
						temporizadorcargar = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										for(int _repeat3204 = 0; _repeat3204 < (int)(slist.size()); _repeat3204++) {
											if (contadorcargar < slist.size()) {
												_cargarfichero();
											}
											else {
												
											}
										}
									}
								});
							}
						};
						_timer.schedule(temporizadorcargar, (int)(1));
					}
					else {
						transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Carga con temporizador (lenta). Número de datos: ".concat(transferencias.getString("Líneas", "").concat(". Limite de datos: ".concat(transferencias.getString("Carga rápida a partir de datos", "").concat("".concat(""))))))))).commit();
						temporizadorcargar = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (contadorcargar < slist.size()) {
											_cargarfichero();
										}
										else {
											
										}
									}
								});
							}
						};
						_timer.scheduleAtFixedRate(temporizadorcargar, (int)(0), (int)(1));
					}
				}
				else {
					temporizadorcargar = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									if (contadorcargar < slist.size()) {
										_cargarfichero();
									}
									else {
										
									}
								}
							});
						}
					};
					_timer.scheduleAtFixedRate(temporizadorcargar, (int)(0), (int)(1));
					transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Carga con temporizador (lenta). Número de datos: ".concat(transferencias.getString("Líneas", "").concat(". Limite de datos: ".concat(transferencias.getString("Carga rápida a partir de datos", "").concat("".concat(""))))))))).commit();
				}
				//Fin de control de tipo de carga 
				//fin de carga 
				transferencias.edit().putString("Vueltas", "0").commit();
				_actualizarregistroreciente();
			}
			else {
				//si el archivo tiene menos de 14 datos, mostrar error 
				textobusqueda.setText("No hay eventos. Datos mínimos 14. Datos totales: ".concat(String.valueOf((long)(slist.size())).concat("")));
				texto.setText(str);
				textotemporal = texto.getText().toString();
				linearprogreso.setVisibility(View.GONE);
				opcionestexto.setVisibility(View.GONE);
				transferencias.edit().putString("Cargado", "Si").commit();
				transferencias.edit().putString("Cargando", "No").commit();
				texto.setLines(slist.size());
				if (slist.size() == 1) {
					aviso.setTitle(slist.get((int)(0)));
					aviso.setMessage("Message");
					aviso.setPositiveButton("Vale", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
				}
				else {
					transferencias.edit().putString("Contador líneas", "0").commit();
					for(int _repeat3317 = 0; _repeat3317 < (int)(slist.size()); _repeat3317++) {
						if (Double.parseDouble(transferencias.getString("Contador líneas", "")) < slist.size()) {
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("\n".concat(slist.get((int)(Double.parseDouble(transferencias.getString("Contador líneas", ""))))))).commit();
							transferencias.edit().putString("Contador líneas", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador líneas", "")) + 1))).commit();
						}
						else {
							
						}
					}
					aviso.setTitle("Error en fichero. Datos: ".concat(String.valueOf((long)(slist.size())).concat("".concat(""))));
					aviso.setMessage(transferencias.getString("Datos", "").concat(""));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
				}
			}
		}
		else {
			
		}
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			if (transferencias.getString("Nota", "").equals("Nueva")) {
				transferencias.edit().putString("Mostrar sección", "Editar").commit();
				_mostrarseccion();
				transferencias.edit().putString("Mostrar opción", "Editar").commit();
				_mostraropcion();
				transferencias.edit().putString("Cargado", "Si").commit();
				transferencias.edit().putString("Sección", "Editar").commit();
				transferencias.edit().putString("Cambiado", "No").commit();
			}
			else {
				
			}
			if (transferencias.getString("Nota", "").equals("Opciones")) {
				SketchwareUtil.showMessage(getApplicationContext(), "Opciones");
				opcionestexto.setVisibility(View.VISIBLE);
			}
			else {
				
			}
			if (textocambiado.size() == 0) {
				textocambiado.add("Restaurar nota");
				version.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, textocambiado));
				((ArrayAdapter)version.getAdapter()).notifyDataSetChanged();
				version.setSelection((int)(0));
			}
			else {
				
			}
			if (transferencias.getString("Nota", "").equals("Recargar")) {
				transferencias.edit().putString("Mostrar sección", "Cargar").commit();
				_mostrarseccion();
				transferencias.edit().putString("Mostrar opción", "Cargar").commit();
				_mostraropcion();
				transferencias.edit().putString("Cargado", "No").commit();
				transferencias.edit().putString("Cambiado", "No").commit();
				transferencias.edit().putString("Cargando", "Si").commit();
				transferencias.edit().putString("Sección", "Editar").commit();
				transferencias.edit().putString("Recargar", "No").commit();
				setTitle(transferencias.getString("Nombre nota", ""));
				transferencias.edit().putString("Último nombre", transferencias.getString("Nombre nota", "")).commit();
				nombre.setText(transferencias.getString("Nombre nota", ""));
				progressbar1.setProgress((int)100);
				_mostrarprogreso();
				//cargar texto
				contador = 0;
				parar = false;
				transferencias.edit().putString("Líneas", String.valueOf((long)(lineas.size()))).commit();
				if (lineas.size() > 0) {
					if (lineas.size() > Double.parseDouble(transferencias.getString("Mostrar progreso a partir de líneas", ""))) {
						progressbar1.setIndeterminate(false);
						transferencias.edit().putString("Mostrar sección", "Cargar").commit();
						_mostrarseccion();
						transferencias.edit().putString("Mostrar opción", "Cargar").commit();
						_mostraropcion();
						progressbar1.setMax((int)100);
						texto.setText("");
						textoprogreso.setText("Cargando líneas");
						contador = 0;
						temporizador = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (contador < lineas.size()) {
											texto.setText(texto.getText().toString().concat(lineas.get((int)(contador)).concat("\n")));
											textoprogreso.setText(String.valueOf((long)((contador / lineas.size()) * 100)).concat("%/".concat(String.valueOf((long)(slist.size())).concat(". ".concat(slist.get((int)(contador)).concat(""))))));
											progressbar1.setProgress((int)(contador / lineas.size()) * 100);
											textoprogreso.setText("Cargando".concat(transferencias.getString("Nombre nota", "").concat(". ".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(slist.size())).concat("")))))));
											contador++;
										}
										else {
											linearprogreso.setVisibility(View.GONE);
											transferencias.edit().putString("Último texto", texto.getText().toString()).commit();
											transferencias.edit().putString("Cargado", "Si").commit();
											transferencias.edit().putString("Líneas", String.valueOf((long)(lineas.size()))).commit();
											transferencias.edit().putString("Cargando", "No").commit();
											textotemporal = texto.getText().toString();
											transferencias.edit().putString("Método", "1").commit();
											if (transferencias.getString("Método", "").equals("2")) {
												posicion.add(texto.getText().toString());
												//cursorposicion.add(edittext1.getSelectionStart());
											}
											else {
												
											}
											temporizador.cancel();
										}
									}
								});
							}
						};
						_timer.scheduleAtFixedRate(temporizador, (int)(0), (int)(1));
						//
					}
					else {
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Método", "").equals("2")) {
							texto.setText(transferencias.getString("Dato", ""));
							textotemporal = texto.getText().toString();
							linearprogreso.setVisibility(View.GONE);
							opcionestexto.setVisibility(View.GONE);
							transferencias.edit().putString("Cargado", "Si").commit();
							transferencias.edit().putString("Cargando", "No").commit();
						}
						else {
							
						}
					}
				}
				else {
					texto.setText(transferencias.getString("Dato", ""));
					textotemporal = texto.getText().toString();
					linearprogreso.setVisibility(View.GONE);
					opcionestexto.setVisibility(View.GONE);
					transferencias.edit().putString("Cargado", "Si").commit();
					transferencias.edit().putString("Cargando", "No").commit();
					texto.setLines(lineas.size());
				}
			}
			else {
				
			}
		}
		else {
			
		}
	}
	
	
	public void _actualizarregistro() {
		listviewregistro.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, registro));
		((BaseAdapter)listviewregistro.getAdapter()).notifyDataSetChanged();
	}
	
	
	public void _fechayhora() {
		calendario = Calendar.getInstance();
		dia = new SimpleDateFormat("d").format(calendario.getTime());
		mes = new SimpleDateFormat("M").format(calendario.getTime());
		numeromes = Double.parseDouble(new SimpleDateFormat("M").format(calendario.getTime()));
		ano = new SimpleDateFormat("y").format(calendario.getTime());
		hora = new SimpleDateFormat("H").format(calendario.getTime());
		minutos = new SimpleDateFormat("m").format(calendario.getTime());
		segundos = new SimpleDateFormat("s").format(calendario.getTime());
		diadelasemana = new SimpleDateFormat("s").format(calendario.getTime());
		transferencias.edit().putString("Día", dia).commit();
		transferencias.edit().putString("Mes", mes).commit();
		transferencias.edit().putString("Año", ano).commit();
		transferencias.edit().putString("Hora", hora).commit();
		transferencias.edit().putString("Minuto", minutos).commit();
		transferencias.edit().putString("Segundo", segundos).commit();
		transferencias.edit().putString("Día de la semana", transferencias.getString("EEEE", "")).commit();
		transferencias.edit().putString("Hora completa", transferencias.getString("Hora", "").concat(":".concat(transferencias.getString("Minuto", "").concat(":".concat(transferencias.getString("Segundo", "")))))).commit();
		transferencias.edit().putString("Fecha completa", transferencias.getString("Día", "").concat("-".concat(transferencias.getString("Mes", "").concat("-".concat(transferencias.getString("Año", "")))))).commit();
		diasmes = calendario.getActualMaximum(Calendar.DATE);
		transferencias.edit().putString("Días del mes", String.valueOf((long)(diasmes))).commit();
	}
	
	
	public void _guardar() {
		transferencias.edit().putString("Guardar", "Si").commit();
		transferencias.edit().putString("Dato", "").commit();
		if (transferencias.getString("Nombre nota", "").equals("(No)")) {
			transferencias.edit().putString("Guardar", "No").commit();
		}
		else {
			
		}
		if (transferencias.getString("Nombre nota", "").equals("")) {
			transferencias.edit().putString("Guardar", "No").commit();
		}
		else {
			
		}
		if (transferencias.getString("Guardar", "").equals("Si")) {
			transferencias.edit().putString("Cambiado", "No").commit();
			//guardar datos
			if (fecha.size() > 0) {
				transferencias.edit().putString("Datos", fecha.get((int)0).get("Datos día").toString()).commit();
				contador = 0;
				transferencias.edit().putString("Dato", "(Calendario)").commit();
				for(int _repeat124 = 0; _repeat124 < (int)((fecha.size() - 1)); _repeat124++) {
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Día)".concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(fecha.get((int)contador).get("Día").toString().concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Mes)".concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(fecha.get((int)contador).get("Mes").toString().concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Año)".concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(fecha.get((int)contador).get("Año").toString().concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Estado)".concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(estado.get((int)contador).get("Día").toString().concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(estado.get((int)contador).get("Mes").toString().concat("\n"))).commit();
					transferencias.edit().putString("Dato", "(Hora desde)").commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(registrobidimensional.get((int)contador).get("Día").toString().concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(registrobidimensional.get((int)contador).get("Mes").toString().concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(registrobidimensional.get((int)contador).get("Año").toString().concat("\n"))).commit();
					transferencias.edit().putString("Dato", "(Hora hasta)").commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(registrobidimensional.get((int)contador).get("Día").toString().concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(registrobidimensional.get((int)contador).get("Mes").toString().concat("\n"))).commit();
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(registrobidimensional.get((int)contador).get("Año").toString().concat("\n"))).commit();
					contador++;
				}
				//fin
				FileUtil.writeFile(transferencias.getString("Ruta ficheros", "").concat("/".concat(nombre.getText().toString().concat(".txt"))), transferencias.getString("Dato", ""));
				botonguardar.setVisibility(View.GONE);
				setTitle(nombre.getText().toString());
				if (nombre.getText().toString().equals(transferencias.getString("Último nombre", ""))) {
					
				}
				else {
					aviso.setTitle("Nota con texto duplicado");
					aviso.setMessage("¿Borrar nota anterior? (".concat(transferencias.getString("Último nombre", "").concat(") ".concat(""))));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							FileUtil.deleteFile(transferencias.getString("Ruta ficheros", "").concat("/".concat(transferencias.getString("Último nombre", "").concat(".txt"))));
							SketchwareUtil.showMessage(getApplicationContext(), "Cambiado nombre de nota".concat(""));
							transferencias.edit().putString("Último nombre", transferencias.getString("Nombre nota", "")).commit();
						}
					});
					aviso.setNegativeButton("No", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
				}
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					aviso.setTitle("Nota (");
					aviso.setMessage("Nombre nota (".concat(nombre.getText().toString().concat("). Nombre anterior (".concat(transferencias.getString("Último nombre", "").concat(") ".concat(""))))));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
				}
				else {
					
				}
				_actualizarlistanotas();
			}
			else {
				
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), "Establezca nombre de nota válido");
		}
	}
	
	
	public void _calculardetalles() {
		if (transferencias.getString("Último carácter", "").equals("")) {
			transferencias.edit().putString("Caracteres", String.valueOf((long)(texto.getText().toString().length()))).commit();
		}
		else {
			transferencias.edit().putString("Cargando", "Si").commit();
			_fechayhora();
			textodetalles.setText("Calculando palabras".concat(""));
			//líneas
			slist.clear();
			str = texto.getText().toString();
			//Cargar lista a partir de un texto 
			//arr es matrix tipo array numérico 
			//str es variable tipo texto 
			//slist es matrix tipo array texto 
			//no se pueden compartir las matrices, por lo tanto, para operar con ellas hay que pasarlas a otra matriz 
			String [] arr = str.split("\n");
			for (int i = 0; i < arr.length; i++) {
				slist.add(arr[i]);
			}
			if (slist.size() > 0) {
				transferencias.edit().putString("Líneas", String.valueOf((long)(slist.size()))).commit();
				transferencias.edit().putString("Texto primera línea", slist.get((int)(0))).commit();
			}
			else {
				if (transferencias.getString("Último carácter", "").length() > 0) {
					transferencias.edit().putString("Caracteres", String.valueOf((long)(texto.getText().toString().length()))).commit();
					transferencias.edit().putString("Texto primera línea", texto.getText().toString()).commit();
				}
				else {
					transferencias.edit().putString("Líneas", "0").commit();
				}
			}
			//fin
			//caracteres
			textodetalles.setText("Calculando caracteres");
			slist.clear();
			listacaracteres.clear();
			str = texto.getText().toString();
			//calcular número de caracteres. Restar 1
			//String data = "1,2,3,,5,6,,";
			String[] arr1 = str.split("");
			for (int i=0; i<arr1.length; i++){
				slist.add(arr1[i]);
				//System.out.println(split[i]);
			} 
			//System.out.println("Done");
			
			caracteres = 0;
			transferencias.edit().putString("Caracteres", String.valueOf((long)(slist.size() - 1))).commit();
			transferencias.edit().putString("Mostrar progreso", "Si").commit();
			progressbar1.setMax((int)100);
			_mostrarprogreso();
			temporizador = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							if (caracteres < slist.size()) {
								textoprogreso.setText("Calculando caracteres");
								listacaracteres.add(slist.get((int)(caracteres)));
								progressbar1.setProgress((int)(caracteres / slist.size()) * 100);
								caracteres++;
							}
							else {
								transferencias.edit().putString("Mostrar progreso", "No").commit();
								_mostrarprogreso();
								temporizador.cancel();
							}
						}
					});
				}
			};
			_timer.scheduleAtFixedRate(temporizador, (int)(1), (int)(1));
			//fin
		}
		transferencias.edit().putString("Detalles", "Líneas: ".concat(transferencias.getString("Líneas", "").concat("\nUltimo cambio ".concat(transferencias.getString("Hora completa", "").concat("\nUltimo carácter: ".concat(transferencias.getString("Último carácter", "").concat("\n"))))))).commit();
		transferencias.edit().putString("Detalles", transferencias.getString("Detalles", "").concat("".concat(String.valueOf((long)(0)).concat("\n")))).commit();
		textodetalles.setText(transferencias.getString("Detalles", ""));
	}
	
	
	public void _buscarymarcar() {
		//meter valor del texto del cuadro de búsqueda en el evento de cambio de texto
		text = texto.getText().toString();
		col_find = "<font color = \"Red\">".concat(find.concat("</font>"));
		text = text.replace(find, col_find);
		edittext1.setText(Html.fromHtml(text));
	}
	
	
	public void _buscartexto() {
		if (edittext2.getText().toString().equals("")) {
			
		}
		else {
			if (texto.getText().toString().equals("")) {
				
			}
			else {
				//, marcar texto en un color 
				//meter valor del texto del cuadro de búsqueda en el evento de cambio de texto
				text = texto.getText().toString();
				col_find = "<font color = \"Red\">".concat(find.concat("</font>"));
				text = text.replace(find, col_find);
				edittext1.setText(Html.fromHtml(text));
				//fin
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					String map = edittext2.getText().toString().replace(texto.getText().toString(), "<font color=\"".concat("0xFF000000".concat("\">".concat(texto.getText().toString().concat("</font>")))));
					edittext2.setText(Html.fromHtml(map));
				}
				else {
					
				}
				if (transferencias.getString("Última búsqueda", "").equals(edittext2.getText().toString())) {
					//búsqueda siguiente
					if (x < posicionx.size()) {
						posicioncursor = posicioncursor;
						posicioncursor = posicionx.get((int)(x)).doubleValue();
						//colocar cursor
						//edittext1.setSelection(posicionx.get((int)(x)).doubleValue());
						((EditText)texto).setSelection((int)posicionx.get((int)(x)).doubleValue(), (int)posicionx.get((int)(x1)).doubleValue());
						encontrados.setText("Encontrados: ".concat(String.valueOf((long)(x)).concat("/".concat(String.valueOf((long)(posicionx.size()))))));
						x++;
					}
					else {
						x = 0;
						((EditText)texto).setSelection((int)posicionx.get((int)(x)).doubleValue(), (int)posicionx.get((int)(x1)).doubleValue());
						//colocar cursor
						//edittext1.setSelection(posicionx.get(x));
					}
				}
				else {
					//primera búsqueda
					transferencias.edit().putString("Última búsqueda", edittext2.getText().toString()).commit();
					//posición de texto
					textobuscar = edittext2.getText().toString();
					//buscar la posición de todos los textos
					//String textotemporal = "I love you so much";
					//String textobuscar= "love";
					Pattern palabra= Pattern.compile(textobuscar);
					Matcher match = palabra.matcher(textotemporal);
					
					while (match.find()) {
						//if (match.find()) {
						     //System.out.println("Found love at index "+ 
						textobuscar1=match.start() +" - "+ (match.end()-1);
						x=match.start();
						x1=(match.end()-1);
						
						posicionx.add(Double.valueOf(x));
						posicionx1.add(Double.valueOf(x1));
						encontrados.setText("Encontrados: ".concat(String.valueOf((long)(x)).concat("")));
					}
					x = 0;
					x1 = 0;
					//edittext1.setText(textobuscar, TextView.BufferType.EDITABLE);
					//fin posición de texto
				}
			}
		}
	}
	
	
	public void _extra() {
		//}
		//private ArrayList<integer> cursorposicion = new ArrayList<Integer>();
		//{
	}
	
	
	public void _buscartexto1() {
		if (edittext2.getText().toString().equals("")) {
			
		}
		else {
			if (texto.getText().toString().equals("")) {
				
			}
			else {
				if (transferencias.getString("Primera búsqueda", "").equals("Si")) {
					//primera búsqueda
					//, marcar texto en un color 
					//meter valor del texto del cuadro de búsqueda en el evento de cambio de texto
					text = texto.getText().toString();
					col_find = "<font color = \"Red\">".concat(find.concat("</font>"));
					text = text.replace(find, col_find);
					edittext1.setText(Html.fromHtml(text));
					//fin
					//primera búsqueda
					//posición de texto
					textobuscar = edittext2.getText().toString();
					posicionx.clear();
					posicionx1.clear();
					//buscar la posición de todos los textos
					//String textotemporal = "I love you so much";
					//String textobuscar= "love";
					Pattern palabra= Pattern.compile(textobuscar);
					Matcher match = palabra.matcher(textotemporal);
					
					while (match.find()) {
						//if (match.find()) {
						     //System.out.println("Found love at index "+ 
						textobuscar1=match.start() +" - "+ (match.end()-1);
						x=match.start();
						x1=(match.end()-1);
						
						posicionx.add(Double.valueOf(x));
						posicionx1.add(Double.valueOf(x1));
						posicion.add((int)(0), textobuscar1);
						//cursorposicion.add(0,_parametro2 +_parametro4);
					}
					x = 0;
					x1 = 0;
					//edittext1.setText(textobuscar, TextView.BufferType.EDITABLE);
					//fin posición de texto
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("2")) {
						String map = edittext2.getText().toString().replace(texto.getText().toString(), "<font color=\"".concat("0xFF000000".concat("\">".concat(texto.getText().toString().concat("</font>")))));
						edittext2.setText(Html.fromHtml(map));
					}
					else {
						
					}
					encontrados.setText("Encontrados: ".concat(String.valueOf((long)(posicionx.size())).concat("")));
					try{
						((EditText)texto).setSelection((int)posicioncursor, (int)posicionx1.get((int)(x1)).doubleValue());
					}catch(Exception e){
						SketchwareUtil.showMessage(getApplicationContext(), "Error al seleccionar");
					}
					transferencias.edit().putString("Primera búsqueda", "No").commit();
				}
				else {
					//búsqueda siguiente
					if (contadorbuscar < posicionx1.size()) {
						prueba1 = posicioncursor;
						if (posicionx1.indexOf(contadorbuscar) > texto.getText().toString().length()) {
							posicioncursor = texto.getText().toString().length() - 1;
						}
						else {
							posicioncursor = posicionx1.indexOf(contadorbuscar);
							posicioncursor = posicionx1.get((int)(contadorbuscar)).doubleValue();
						}
						if (posicionx1.get((int)(contadorbuscar)).doubleValue() > texto.getText().toString().length()) {
							posicioncursor = texto.getText().toString().length() - 1;
						}
						else {
							posicioncursor = posicionx1.indexOf(contadorbuscar);
							posicioncursor = posicionx1.get((int)(contadorbuscar)).doubleValue();
						}
						contadorbuscar++;
					}
					else {
						contadorbuscar = 0;
						posicioncursor = 0;
					}
					texto.requestFocus();
					try{
						matrizcursor.clear();
						matrizcursor.add(Double.valueOf(contadorbuscar));
						//colocar cursor. Si se usa matriz numérica, usar get at
						//edittext1.setSelection(posicionx1.indexOf(posicioncursor)); //
						//edittext1.setSelection(posicioncursor, edittext1);
						
						textoposicion.setText("");
						contador = 0;
						for(int _repeat121 = 0; _repeat121 < (int)(posicionx1.get((int)(contadorbuscar)).doubleValue()); _repeat121++) {
							if (contador < posicionx1.get((int)(contadorbuscar)).doubleValue()) {
								
							}
							else {
								
							}
							textoposicion.setText(textoposicion.getText().toString().concat("1"));
							contador++;
						}
						SketchwareUtil.showMessage(getApplicationContext(), String.valueOf((long)(posicionx1.get((int)(contadorbuscar)).doubleValue())));
						//etmsg.setText("Updated Text From another Activity"); 
						int position = textoposicion.length();
						Editable etext = edittext1.getText(); Selection.setSelection(etext, position);
						encontrados.setText("Texto ".concat(String.valueOf((long)(contadorbuscar)).concat(". Rango ".concat(String.valueOf((long)(matrizcursor.get((int)(0)).doubleValue())).concat("/".concat(String.valueOf((long)(posicionx1.get((int)(contadorbuscar)).doubleValue()))))))));
						posicioncursor = posicionx.indexOf(contadorbuscar);
						posicioncursor = posicionx.get((int)(contadorbuscar)).doubleValue();
					}catch(Exception e){
						encontrados.setText("Cursor error ".concat(String.valueOf((long)(contadorbuscar)).concat(". Rango ".concat(String.valueOf((long)(matrizcursor.get((int)(0)).doubleValue())).concat("/".concat(String.valueOf((long)(posicionx1.get((int)(contadorbuscar)).doubleValue()))))))));
					}
					//edittext1.requestFocus();
					//edittext1.setSelection(edittext2.getText().length());
					if (edittext1.getText().toString().length() > 0 ) 
					{
						//edittext1.setSelection(10,edittext2.getText().toString().length());
					}
					//sustituir palabra
					//fin
				}
			}
		}
	}
	
	
	public void _rutinas() {
		progressbar1.setProgress((int)(contador / slist.size()) * 100);
		//eliminar extensión
		str = Uri.parse(ficheros.get((int)(contador))).getLastPathSegment();
		slist.clear();
		//calcular número de caracteres. Restar 1
		//String data = "1,2,3,,5,6,,";
		String[] arr1 = str.split("");
		for (int i=0; i<arr1.length; i++){
			slist.add(arr1[i]);
			//System.out.println(split[i]);
		} 
		//System.out.println("Done");
		
		dato = "";
		caracteres = 0;
		for(int _repeat25 = 0; _repeat25 < (int)(slist.size()); _repeat25++) {
			if (caracteres < slist.size()) {
				if (slist.get((int)(caracteres)).equals(".")) {
					position = caracteres;
					//margen de error de 1 al sumar. Debería funcionar sumando 3
					if ((caracteres + 4) == slist.size()) {
						if (slist.get((int)(caracteres + 1)).equals("t") && (slist.get((int)(caracteres + 2)).equals("x") && slist.get((int)(caracteres + 3)).equals("t"))) {
							caracteres = slist.size();
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					dato = dato.concat(slist.get((int)(caracteres)));
				}
				caracteres++;
			}
			else {
				
			}
		}
		//fin
	}
	
	
	public void _mostrarprogreso() {
		
		linearprogreso.setVisibility(View.VISIBLE);
	}
	
	
	public void _ocultarprogreso() {
		
		linearprogreso.setVisibility(View.GONE);
	}
	
	
	public void _recibir() {
		// Get intent, action and MIME type
		    Intent intent = getIntent();
		    String action = intent.getAction();
		    String type = intent.getType();
		if (Intent.ACTION_SEND.equals(action) && type != null) {
			 if ("text/plain".equals(type)) {
				  shared = intent.getStringExtra(Intent.EXTRA_TEXT);
				  recibido=shared;
				 }
		}
		transferencias.edit().putString("Método", "2").commit();
		SketchwareUtil.showMessage(getApplicationContext(), share);
		if (transferencias.getString("Método", "").equals("1")) {
			textorecibir = "".concat("\n".concat(action.concat("\n".concat(type))));
			aviso.setTitle("Texto recibido");
			aviso.setMessage(textorecibir);
			aviso.setPositiveButton("Vale", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			aviso.create().show();
		}
		else {
			
		}
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			//No da error pero no funciona en Android 11
			//manifiesto
			//<intent-filter>
			//    <action android:name="android.intent.action.SEND" />
			//    <category android:name="android.intent.category.DEFAULT" />
			 //   <data android:mimeType="text/plain" />
			//   </intent-filter>
			Intent intent1 = getIntent();
			String action1 = intent1.getAction();
			String type1 = intent1.getType();
			if (Intent.ACTION_SEND.equals(action) && type != null) {if ("text/plain".equals(type)) {
					String sharedText = intent1.getStringExtra(Intent.EXTRA_TEXT);
					Log.d(Tag, "action: " + action1);
					Log.d(Tag, "type: " + type1);
					Log.d(Tag, "sharedText: " + sharedText);
					share = sharedText;
				}}
			textorecibir = textorecibir.concat("\n".concat(action.concat("\n".concat(type))));
			aviso.setTitle("Texto recibido");
			aviso.setMessage(share);
			aviso.setPositiveButton("Vale", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			aviso.create().show();
		}
		else {
			
		}
	}
	
	
	public void _cargarconfiguracion() {
		if (FileUtil.isExistFile(transferencias.getString("Ruta configuración", ""))) {
			//cargar configuración
			textocargar.setText("Cargando configuración ");
			slist.clear();
			str = FileUtil.readFile(transferencias.getString("Ruta configuración", ""));
			String [] arr = str.split("\n");
			for (int i = 0; i < arr.length; i++) {
				slist.add(arr[i]);
			}
			transferencias.edit().putString("Contador configuración", "0").commit();
			for(int _repeat26 = 0; _repeat26 < (int)(slist.size()); _repeat26++) {
				if (Double.parseDouble(transferencias.getString("Contador configuración", "")) < slist.size()) {
					if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", "")))).equals("Cargar configuración automáticamente")) {
						transferencias.edit().putString("Contador configuración", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador configuración", "")) + 1))).commit();
						transferencias.edit().putString("Cargar configuración automáticamente", slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", ""))))).commit();
						if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", "")))).equals("Si")) {
							cargaautomatica.setChecked(true);
						}
						else {
							cargaautomatica.setChecked(false);
						}
					}
					else {
						
					}
					if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", "")))).equals("Carga rápida a partir de datos")) {
						transferencias.edit().putString("Contador configuración", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador configuración", "")) + 1))).commit();
						transferencias.edit().putString("Posición carga rápida a partir de datos", slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", ""))))).commit();
						limitelineas.setSelection((int)(Double.parseDouble(transferencias.getString("Posición carga rápida a partir de datos", ""))));
						transferencias.edit().putString("Contador configuración", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador configuración", "")) + 1))).commit();
						transferencias.edit().putString("Carga rápida a partir de datos", slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", ""))))).commit();
						aviso.setTitle("Limite de datos ");
						aviso.setMessage(transferencias.getString("Carga rápida a partir de datos", "").concat("".concat("".concat(""))));
						aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
					}
					else {
						
					}
					//al parecer, la carga de archivos falla si se cargan más opciones aquí 
					if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", "")))).equals("Guardar registro automáticamente")) {
						transferencias.edit().putString("Contador configuración", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador configuración", "")) + 1))).commit();
						transferencias.edit().putString("Guardar registro automáticamente", slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", ""))))).commit();
						if (transferencias.getString("Guardar registro automáticamente", "").equals("Si")) {
							checkbox19.setChecked(true);
						}
						else {
							checkbox19.setChecked(false);
						}
					}
					else {
						
					}
					if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", "")))).equals("Cargar registro automáticamente")) {
						transferencias.edit().putString("Contador configuración", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador configuración", "")) + 1))).commit();
						transferencias.edit().putString("Cargar registro automáticamente", slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", ""))))).commit();
						if (transferencias.getString("Cargar registro automáticamente", "").equals("Si")) {
							checkbox20.setChecked(true);
						}
						else {
							checkbox20.setChecked(false);
						}
					}
					else {
						
					}
					if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", "")))).equals("Guardar configuración automáticamente")) {
						transferencias.edit().putString("Contador configuración", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador configuración", "")) + 1))).commit();
						transferencias.edit().putString("Guardar configuración automáticamente", slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", ""))))).commit();
						if (transferencias.getString("Guardar configuración automáticamente", "").equals("Si")) {
							checkbox18.setChecked(true);
						}
						else {
							checkbox18.setChecked(false);
						}
					}
					else {
						
					}
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("2")) {
						if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", "")))).equals("(Alto editar)")) {
							
						}
						else {
							
						}
						if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", "")))).equals("(Posición barra de herramientas vertical)")) {
							
						}
						else {
							
						}
						if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", "")))).equals("(Posición barra de herramientas horizontal)")) {
							
						}
						else {
							
						}
						if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador configuración", "")))).equals("(Mostrar progreso por debajo de líneas)")) {
							
						}
						else {
							
						}
					}
					else {
						
					}
					
					transferencias.edit().putString("Contador configuración", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador configuración", "")) + 1))).commit();
				}
				else {
					
				}
			}
			SketchwareUtil.showMessage(getApplicationContext(), "Configuración cargada");
			textview2.setText("Configuración cargada. ");
			button59.setVisibility(View.GONE);
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), "No existen datos de configuración");
			textview2.setText("Configuración. (no existe archivo de configuración)");
		}
		transferencias.edit().putString("Cargando configuración", "No").commit();
		transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Fin de carga de configuración. ".concat(""))))).commit();
		_actualizarregistroreciente();
	}
	
	
	public void _cerrar() {
		finish();
	}
	
	
	public void _establecerbarra() {
		//((ViewGroup)herramientas.getParent()).removeView(herramientas);
		//setSupportActionBar(opciones);
		//getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		//getSupportActionBar().setHomeButtonEnabled(true);
		//opciones.setNavigationOnClickListener(new View.OnClickListener() {
		//@Override
		//public void onClick(View_v){
		//onBackPressed();
		//} 
		//});
		
	}
	
	
	public void _establecerbarra1() {
		//_toolbar.addView(herramientas);
		//_toolbar.addView(linear45);
	}
	
	
	public void _mostraredicion() {
		_ocultarsecciones();
		barraherramientas.setVisibility(View.VISIBLE);
		deslizarherramientas.setVisibility(View.VISIBLE);
		edicion.setVisibility(View.VISIBLE);
		cuadrosecciones.setVisibility(View.VISIBLE);
		horizontal.setVisibility(View.VISIBLE);
		cuadroeditar.setVisibility(View.VISIBLE);
		deslizartexto.setVisibility(View.VISIBLE);
		_establecerdimensiones(anchoeditar, anchoeditar, cuadroeditar);
		registro.add("Establecido ancho de cuadro editar: ".concat(String.valueOf((long)(anchoeditar)).concat("")));
		_actualizarregistro();
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), SketchwareUtil.getDisplayHeightPixels(getApplicationContext()), deslizartexto);
			_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), SketchwareUtil.getDisplayHeightPixels(getApplicationContext()), cuadroeditar);
		}
		else {
			
		}
	}
	
	
	public void _ocultaropciones() {
		barraherramientas.setVisibility(View.GONE);
		cuadroficheros.setVisibility(View.GONE);
		cuadropantalla.setVisibility(View.GONE);
		edicion.setVisibility(View.GONE);
		cuadrocalendario.setVisibility(View.GONE);
		linear50.setVisibility(View.GONE);
		cuadrocargar.setVisibility(View.GONE);
		cuadrobuscar.setVisibility(View.GONE);
		cuadrocalendario.setVisibility(View.GONE);
	}
	
	
	public void _cargarinsertar() {
		listainsertar.clear();
		listainsertar.add("Insertar");
		listainsertar.add("Fecha");
		listainsertar.add("Hora");
		spinerinsertar.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listainsertar));
		((ArrayAdapter)spinerinsertar.getAdapter()).notifyDataSetChanged();
	}
	
	
	public void _mover() {
		
	}
	
	
	public void _ocultarsecciones() {
		principal1.setVisibility(View.GONE);
		buscarlista.setVisibility(View.GONE);
		cuadroeditar.setVisibility(View.GONE);
		configuracion.setVisibility(View.GONE);
		editar.setVisibility(View.GONE);
		linearnotas.setVisibility(View.GONE);
		seccioncalendario.setVisibility(View.GONE);
		linear30.setVisibility(View.GONE);
		lineardetalles.setVisibility(View.GONE);
		linearinsertar.setVisibility(View.GONE);
		
		button23.setVisibility(View.GONE);
		buscarlista.setVisibility(View.GONE);
		alarma.setVisibility(View.GONE);
		general.setVisibility(View.GONE);
		linearregistro.setVisibility(View.GONE);
	}
	
	
	public void _establecerdimensiones(final double _ancho, final double _alto, final View _vista) {
		//método 1
		//LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams((int)(getResources().getDisplayMetrics().density*_ancho), (int)(getResources).getDisplayMetrics().density*_alto));
		//Set LayoutParams to view
		//vista.setLayoutParams(lpar);
		//método 2
		//LinearLayout.LayoutParams newr = new LinearLayout.LayoutParams((int)(getResources().getDisplayMetrics().densityDouble.parseDouble(textoalto.getText().toString())), (int)(getResources().getDisplayMetrics().densityDouble.parseDouble(textoancho.getText().toString())));
		//_vista.setLayoutParams(newr);
		//método 3
		_vista.setLayoutParams(new
		LinearLayout.LayoutParams((int)_ancho,
		(int)_alto));
		
		
		
		
	}
	
	
	public void _cargarpantalla() {
		if (FileUtil.isDirectory(transferencias.getString("Ruta", ""))) {
			
		}
		else {
			FileUtil.makeDir(transferencias.getString("Ruta", ""));
			aviso.setTitle("Carpeta");
			aviso.setMessage("La carpeta principal (".concat(transferencias.getString("Ruta", "").concat(") no existe. Carpeta creada")));
			aviso.setPositiveButton(" Cerrar aviso. ", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			aviso.create().show();
		}
		if (FileUtil.isDirectory(rutaficheros)) {
			
		}
		else {
			FileUtil.makeDir(transferencias.getString("Ficheros", ""));
			aviso.setTitle("Carpeta");
			aviso.setMessage("La carpeta de ficheros (".concat(rutaficheros.concat(") no existe. Carpeta creada ")));
			aviso.setPositiveButton(" Cerrar aviso. ", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			aviso.create().show();
		}
		if (FileUtil.isDirectory(transferencias.getString("Ruta copias", ""))) {
			
		}
		else {
			FileUtil.makeDir(transferencias.getString("Ruta copias", ""));
			SketchwareUtil.showMessage(getApplicationContext(), "La carpeta de copias (".concat(transferencias.getString("Ruta copias", "").concat(") no existe. Carpeta creada ")));
		}
		//actividad
		aviso.setTitle("Aplicaciones");
		aviso.setMessage(transferencias.getString("Ruta", "").concat("/registro/registro de actividad.txt"));
		aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		//fin 
		transferencias.edit().putString("Dato", FileUtil.readFile(transferencias.getString("Ruta", "").concat("/reiniciado"))).commit();
		if (transferencias.getString("Dato", "").equals("Si")) {
			SketchwareUtil.showMessage(getApplicationContext(), "Detectado error de cierre. Reiniciando");
			FileUtil.writeFile(transferencias.getString("Ruta", "").concat("/reiniciado"), "No");
		}
		else {
			
		}
		FileUtil.writeFile(transferencias.getString("Ruta", "").concat("/activo"), "Si");
		//preparar conversión
		//char valorcaracter = ‘B’;
		//int asci = (int) valorcaracter;
		_ocultaropciones();
		_mostrarherramientas();
		cuadrocargar.setVisibility(View.VISIBLE);
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			cuadrocargar.setTranslationY((float)(cuadrocargar.getTranslationY() - 10));
			cuadropantalla.setTranslationY((float)(cuadropantalla.getTranslationY() - 10));
		}
		else {
			
		}
		_ocultar();
		_cargarpantalla1();
	}
	
	
	public void _moverabajo() {
		transferencias.edit().putString("Dirección", "Abajo").commit();
		if (transferencias.getString("Parte", "").equals("Cuadro de edición")) {
			if (transferencias.getString("Tipo configuración", "").equals("Ancho")) {
				anchoeditar = anchoeditar - 10;
				_establecerdimensiones(anchoeditar, altoeditar, cuadroeditar);
			}
			else {
				
			}
		}
		else {
			
		}
		if (transferencias.getString("Parte", "").equals("Lista de notas")) {
			if (transferencias.getString("Dimensiones", "").equals("Posición")) {
				if (transferencias.getString("Dirección", "").equals("Abajo")) {
					posicionvertical = posicionvertical + contadormover;
					listview1.setTranslationY((float)(posicionvertical));
				}
				else {
					
				}
				if (transferencias.getString("Dirección", "").equals("Arriba")) {
					posicionvertical = posicionvertical - contadormover;
					listview1.setTranslationY((float)(posicionvertical));
				}
				else {
					
				}
			}
			else {
				
			}
		}
		else {
			
		}
		contadormover = 0;
		textodimensiones.setText("Parte: ".concat(transferencias.getString("Parte", "").concat(". ".concat(transferencias.getString("Tipo configuración", "").concat(": ".concat(String.valueOf((long)(anchoeditar)).concat("")))))));
		_guardarconfiguracion();
	}
	
	
	public void _moverarriba() {
		transferencias.edit().putString("Dirección", "Arriba").commit();
		if (transferencias.getString("Parte", "").equals("Cuadro de edición")) {
			if (transferencias.getString("Tipo configuración", "").equals("Ancho")) {
				anchoeditar = anchoeditar + 10;
				_establecerdimensiones(anchoeditar, altoeditar, cuadroeditar);
				_establecerdimensiones(anchoeditar, altoeditar, deslizartexto);
			}
			else {
				
			}
			if (transferencias.getString("Tipo configuración", "").equals("Alto")) {
				altoeditar = altoeditar + 10;
				_establecerdimensiones(anchoeditar, altoeditar, cuadroeditar);
				_establecerdimensiones(anchoeditar, altoeditar, deslizartexto);
			}
			else {
				
			}
			if (transferencias.getString("Tipo configuración", "").equals("Mover")) {
				
			}
			else {
				
			}
		}
		else {
			
		}
		if (transferencias.getString("Parte", "").equals("Barra de herramientas")) {
			cuadropantalla.setTranslationY((float)(cuadropantalla.getTranslationY() - contadorarriba));
			edicion.setTranslationY((float)(edicion.getTranslationY() - contadorarriba));
			cuadroficheros.setTranslationY((float)(cuadroficheros.getTranslationY() - contadorarriba));
			cuadrobuscar.setTranslationY((float)(cuadrobuscar.getTranslationY() - contadorarriba));
			cuadrocargar.setTranslationY((float)(cuadrocargar.getTranslationY() - contadorarriba));
		}
		else {
			
		}
		textodimensiones.setText("Parte: ".concat(transferencias.getString("Parte", "").concat(". ".concat(transferencias.getString("Tipo configuración", "").concat(": ".concat(String.valueOf((long)(altoeditar)).concat("")))))));
		_guardarconfiguracion();
	}
	
	
	public void _mostrarherramientas() {
		barraherramientas.setVisibility(View.VISIBLE);
		deslizarherramientas.setVisibility(View.VISIBLE);
	}
	
	
	public void _quitarmarcasecciones() {
		cuadroeditar.setBackgroundColor(0xFFFFFFFF);
	}
	
	
	public void _controlopciones() {
		_ocultaropciones();
		barraherramientas.setVisibility(View.VISIBLE);
		if (transferencias.getString("Sección opciones", "").equals("Buscar calendario")) {
			transferencias.edit().putString("Mostrar opción", "Calendario").commit();
			_mostraropcion();
		}
		else {
			
		}
		if (transferencias.getString("Sección opciones", "").equals("Opción calendario")) {
			transferencias.edit().putString("Mostrar opción", "Organizar").commit();
			_mostraropcion();
		}
		else {
			
		}
		if (transferencias.getString("Sección opciones", "").equals("Editar")) {
			edicion.setVisibility(View.VISIBLE);
			edicion.setTranslationY((float)(-50));
			textodimensiones.setVisibility(View.GONE);
		}
		else {
			
		}
		if (transferencias.getString("Sección opciones", "").equals("Notas")) {
			cuadroficheros.setVisibility(View.VISIBLE);
			cuadroficheros.setTranslationY((float)(-50));
			textodimensiones.setVisibility(View.GONE);
		}
		else {
			
		}
		_quitarmarcasecciones();
	}
	
	
	public void _separarporlineas() {
		slist.clear();
		String [] arr = str.split("\n");
		for (int i = 0; i < arr.length; i++) {
			slist.add(arr[i]);
		}
		contador = 0;
		for(int _repeat13 = 0; _repeat13 < (int)(slist.size()); _repeat13++) {
			if (contador < slist.size()) {
				
			}
			else {
				contador++;
			}
		}
	}
	
	
	public void _encriptar() {
		if (transferencias.getString("Encriptar", "").equals("Si")) {
			
		}
		else {
			
		}
	}
	
	
	public void _moverizquierda() {
		transferencias.edit().putString("Dirección", "Arriba").commit();
		if (transferencias.getString("Parte", "").equals("Barra de herramientas")) {
			if (transferencias.getString("Tipo configuración", "").equals("Mover")) {
				textodimensiones.setText("Parte: ".concat(transferencias.getString("Parte", "").concat(". ".concat(transferencias.getString("Tipo configuración", "").concat(": ".concat(String.valueOf((long)(altoeditar)).concat("")))))));
			}
			else {
				
			}
			transferencias.edit().putString("Método", "1").commit();
			if (transferencias.getString("Método", "").equals("2")) {
				_establecerdimensiones(anchoeditar, altoeditar, cuadroeditar);
				_establecerdimensiones(anchoeditar, altoeditar, deslizartexto);
			}
			else {
				
			}
			cuadrosecciones.setTranslationX((float)(cuadrosecciones.getTranslationX() - contadorarriba));
			cuadropantalla.setTranslationX((float)(cuadrosecciones.getTranslationX() - contadorarriba));
			edicion.setTranslationX((float)(edicion.getTranslationX() - contadorarriba));
			cuadroficheros.setTranslationX((float)(cuadroficheros.getTranslationX() - contadorarriba));
			cuadrobuscar.setTranslationX((float)(cuadrobuscar.getTranslationX() - contadorarriba));
			cuadrocargar.setTranslationX((float)(cuadrocargar.getTranslationX() - contadorarriba));
			contadorarriba = 0;
		}
		else {
			
		}
		_guardarconfiguracion();
	}
	
	
	public void _establecervertical() {
		if (contadorverticalbarra > 0) {
			cuadropantalla.setTranslationY((float)(contadorverticalbarra));
			edicion.setTranslationY((float)(contadorverticalbarra));
			cuadroficheros.setTranslationY((float)(contadorverticalbarra));
			cuadrobuscar.setTranslationY((float)(contadorverticalbarra));
			cuadrocargar.setTranslationY((float)(contadorverticalbarra));
		}
		else {
			
		}
	}
	
	
	public void _establecerhorizontal() {
		if (contadorhorizontalbarra > 0) {
			cuadropantalla.setTranslationX((float)(contadorhorizontalbarra));
			edicion.setTranslationX((float)(contadorhorizontalbarra));
			cuadroficheros.setTranslationX((float)(contadorhorizontalbarra));
			cuadrobuscar.setTranslationX((float)(contadorhorizontalbarra));
			cuadrocargar.setTranslationX((float)(contadorhorizontalbarra));
		}
		else {
			
		}
	}
	
	
	public void _ventanaeditar() {
	}
	public static class CustomDialogByArabWare {
		
		private AlertDialog alertDialog;
		private View view;
		private Context context;
		private boolean isCancelable;
		private boolean isActivity;
		private Fragment fragmentContext;
		
		public CustomDialogByArabWare(Activity activity) {
			
			context = activity;
			
			alertDialog = new AlertDialog.Builder(context).create();
			
			alertDialog.getWindow().setBackgroundDrawable(null);
			
			isActivity = true;
			
		}
		
		public CustomDialogByArabWare(Fragment fragment) {
			
			fragmentContext = fragment;
			
			context = fragment.getActivity();
			
			alertDialog = new AlertDialog.Builder(context).create();
			
			alertDialog.getWindow().setBackgroundDrawable(null);
			
			isActivity = false;
			
		}
		
		public void setLayout(int layout) {
			
			if(isActivity) {
				
				view = (View) ((Activity)context).getLayoutInflater().inflate(layout, null);
				
			} else {
				
				view = (View) fragmentContext.getActivity().getLayoutInflater().inflate(layout, null);
				
			}
			
			alertDialog.setView(view);
			
		}
		
		public void show() {
			alertDialog.show();
		}
		
		public void setCancelable(boolean b) {
			alertDialog.setCancelable(b);
			isCancelable = b;
		}
		
		public boolean isCancelable() {
			return isCancelable;
		}
		
		
		public View getView(int viewId) {
			return view.findViewById(viewId);
		}
		
		public void dimiss() {
			alertDialog.dismiss();
		}
		
	}
	{
	}
	private CustomDialogByArabWare textoeditarCD;
	{
	}
	
	
	public void _encriptado() {
	}
	public String EcryptingTheTextMethod(final String _string, final String _key) {
				try{
			javax.crypto.SecretKey key = generateKey(_key);
			javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("AES");
			c.init(javax.crypto.Cipher.ENCRYPT_MODE, key);
			byte[] encVal = c.doFinal(_string.getBytes());
			return android.util.Base64.encodeToString(encVal,android.util.Base64.DEFAULT);
				} catch (Exception e) {
				}
		return "";
		}
	
		public String DecryptingTheTextMethod(final String _string, final String _key) {
				try {
			javax.crypto.spec.SecretKeySpec key = (javax.crypto.spec.SecretKeySpec) generateKey(_key);
			javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("AES");
			c.init(javax.crypto.Cipher.DECRYPT_MODE,key);
			byte[] decode = android.util.Base64.decode(_string,android.util.Base64.DEFAULT);
			byte[] decval = c.doFinal(decode);
			return new String(decval);
				} catch (Exception ex) {
				}
		return "";
		}
		public static javax.crypto.SecretKey generateKey(String pwd) throws Exception {
		final java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
		byte[] b = pwd.getBytes("UTF-8");
		digest.update(b,0,b.length);
		byte[] key = digest.digest();
		javax.crypto.spec.SecretKeySpec sec = new javax.crypto.spec.SecretKeySpec(key, "AES");
		return sec;
		}
	{
	}
	
	
	public void _copiar() {
		if (transferencias.getString("Copiar", "").equals("")) {
			SketchwareUtil.showMessage(getApplicationContext(), "Seleccione texto");
		}
		else {
			dato = transferencias.getString("Copiar", "");
			ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE); 
			ClipData clip = ClipData.newPlainText("label", dato);
			clipboard.setPrimaryClip(clip);
			SketchwareUtil.showMessage(getApplicationContext(), "Copiado");
		}
	}
	
	
	public void _ventana() {
		//Modulo creado para intentar eliminar el código que falla en el archivo java 
	}
	
	
	public void _moverposicion() {
		contadormover = 10;
		if (transferencias.getString("Parte", "").equals("Cuadro de edición")) {
			if (transferencias.getString("Tipo configuración", "").equals("Ancho")) {
				anchoeditar = anchoeditar - 10;
				_establecerdimensiones(anchoeditar, altoeditar, cuadroeditar);
				textodimensiones.setText("Parte: ".concat(transferencias.getString("Parte", "").concat(". ".concat(transferencias.getString("Tipo configuración", "").concat(": ".concat(String.valueOf((long)(anchoeditar)).concat("")))))));
			}
			else {
				
			}
		}
		else {
			
		}
		if (transferencias.getString("Parte", "").equals("Lista de notas")) {
			if (transferencias.getString("Tipo configuración", "").equals("Posición")) {
				if (transferencias.getString("Dirección", "").equals("Abajo")) {
					posicionvertical = posicionvertical + contadormover;
				}
				else {
					
				}
				if (transferencias.getString("Dirección", "").equals("Arriba")) {
					posicionvertical = posicionvertical - contadormover;
				}
				else {
					
				}
				listview1.setTranslationY((float)(posicionvertical));
				textodimensiones.setText("Parte: ".concat(transferencias.getString("Parte", "").concat(". ".concat(transferencias.getString("Tipo configuración", "").concat(": ".concat(String.valueOf((long)(posicionvertical)).concat("")))))));
				transferencias.edit().putString("Posición vertical lista de notas", String.valueOf((long)(posicionvertical))).commit();
			}
			else {
				
			}
		}
		else {
			
		}
		if (transferencias.getString("Guardar configuración automáticamente", "").equals("Si")) {
			_guardarconfiguracion();
		}
		else {
			
		}
	}
	
	
	public void _mostrarseccion() {
		//Buscarlista. Principal1. 
		if (transferencias.getString("Mostrar sección", "").equals("Ficheros")) {
			principal1.setVisibility(View.VISIBLE);
			buscarlista.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.GONE);
			editar.setVisibility(View.GONE);
			cuadroeditar.setVisibility(View.GONE);
			configuracion.setVisibility(View.GONE);
			linearnotas.setVisibility(View.GONE);
			linearregistro.setVisibility(View.GONE);
			general.setVisibility(View.GONE);
			alarma.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.GONE);
			SketchwareUtil.showMessage(getApplicationContext(), "Ficheros");
		}
		else {
			
		}
		if (transferencias.getString("Mostrar sección", "").equals("Editar")) {
			principal1.setVisibility(View.GONE);
			buscarlista.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.GONE);
			editar.setVisibility(View.GONE);
			cuadroeditar.setVisibility(View.VISIBLE);
			configuracion.setVisibility(View.GONE);
			linearnotas.setVisibility(View.GONE);
			linearregistro.setVisibility(View.GONE);
			general.setVisibility(View.GONE);
			alarma.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.GONE);
		}
		else {
			
		}
		if (transferencias.getString("Mostrar sección", "").equals("Registro")) {
			principal1.setVisibility(View.GONE);
			buscarlista.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.GONE);
			editar.setVisibility(View.GONE);
			cuadroeditar.setVisibility(View.GONE);
			configuracion.setVisibility(View.GONE);
			linearnotas.setVisibility(View.GONE);
			linearregistro.setVisibility(View.VISIBLE);
			general.setVisibility(View.GONE);
			alarma.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.GONE);
		}
		else {
			
		}
		if (transferencias.getString("Mostrar sección", "").equals("Buscar por lista")) {
			principal1.setVisibility(View.GONE);
			buscarlista.setVisibility(View.VISIBLE);
			seccioncalendario.setVisibility(View.GONE);
			editar.setVisibility(View.GONE);
			cuadroeditar.setVisibility(View.GONE);
			configuracion.setVisibility(View.GONE);
			linearnotas.setVisibility(View.GONE);
			linearregistro.setVisibility(View.GONE);
			general.setVisibility(View.GONE);
			alarma.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.GONE);
		}
		else {
			
		}
		if (transferencias.getString("Mostrar sección", "").equals("Calendario")) {
			transferencias.edit().putString("Sección", "Calendario").commit();
			principal1.setVisibility(View.GONE);
			buscarlista.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.GONE);
			editar.setVisibility(View.GONE);
			cuadroeditar.setVisibility(View.GONE);
			configuracion.setVisibility(View.GONE);
			linearnotas.setVisibility(View.GONE);
			linearregistro.setVisibility(View.GONE);
			general.setVisibility(View.GONE);
			alarma.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.VISIBLE);
		}
		else {
			
		}
		if (transferencias.getString("Mostrar sección", "").equals("Configuración")) {
			transferencias.edit().putString("Sección", "Configuración").commit();
			principal1.setVisibility(View.GONE);
			buscarlista.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.GONE);
			editar.setVisibility(View.GONE);
			cuadroeditar.setVisibility(View.GONE);
			linearnotas.setVisibility(View.GONE);
			linearregistro.setVisibility(View.GONE);
			general.setVisibility(View.GONE);
			alarma.setVisibility(View.GONE);
			seccioncalendario.setVisibility(View.GONE);
			configuracion.setVisibility(View.VISIBLE);
		}
		else {
			
		}
	}
	
	
	public void _mostraropcion() {
		cuadropantalla.setVisibility(View.GONE);
		cuadroficheros.setVisibility(View.GONE);
		cuadrobuscar.setVisibility(View.GONE);
		edicion.setVisibility(View.GONE);
		cuadrocargar.setVisibility(View.GONE);
		cuadrocalendario.setVisibility(View.GONE);
		barraherramientas.setVisibility(View.GONE);
		cuadrobuscar.setVisibility(View.GONE);
		if (transferencias.getString("Mostrar opción", "").equals("Calendario")) {
			cuadrocalendario.setVisibility(View.VISIBLE);
			barraherramientas.setVisibility(View.VISIBLE);
			if (listadia.size() > 0) {
				button63.setVisibility(View.VISIBLE);
			}
			else {
				button63.setVisibility(View.GONE);
			}
			if (transferencias.getString("Cambiado1", "").equals("Si")) {
				botonguardarcalendario.setVisibility(View.VISIBLE);
			}
			else {
				botonguardarcalendario.setVisibility(View.GONE);
			}
		}
		else {
			
		}
		if (transferencias.getString("Mostrar opción", "").equals("Ficheros")) {
			barraherramientas.setVisibility(View.VISIBLE);
			cuadropantalla.setVisibility(View.GONE);
			cuadroficheros.setVisibility(View.VISIBLE);
			cuadrobuscar.setVisibility(View.GONE);
			edicion.setVisibility(View.GONE);
			cuadrocargar.setVisibility(View.GONE);
			cuadrocalendario.setVisibility(View.GONE);
		}
		else {
			
		}
		if (transferencias.getString("Mostrar opción", "").equals("Editar")) {
			barraherramientas.setVisibility(View.VISIBLE);
			cuadropantalla.setVisibility(View.GONE);
			cuadroficheros.setVisibility(View.GONE);
			cuadrobuscar.setVisibility(View.GONE);
			edicion.setVisibility(View.VISIBLE);
			cuadrocargar.setVisibility(View.GONE);
			cuadrocalendario.setVisibility(View.GONE);
		}
		else {
			
		}
		if (transferencias.getString("Mostrar opción", "").equals("Buscar")) {
			barraherramientas.setVisibility(View.VISIBLE);
			cuadropantalla.setVisibility(View.GONE);
			cuadroficheros.setVisibility(View.GONE);
			edicion.setVisibility(View.GONE);
			cuadrocargar.setVisibility(View.GONE);
			if (transferencias.getString("Sección", "").equals("Calendario")) {
				opcionbuscarcalendario.setVisibility(View.VISIBLE);
				cuadrobuscar.setVisibility(View.VISIBLE);
			}
			else {
				opcionbuscarcalendario.setVisibility(View.GONE);
				cuadrobuscar.setVisibility(View.GONE);
			}
			cuadrocalendario.setVisibility(View.GONE);
		}
		else {
			
		}
		if (transferencias.getString("Mostrar opción", "").equals("Cargar")) {
			barraherramientas.setVisibility(View.VISIBLE);
			cuadrocargar.setVisibility(View.VISIBLE);
			cuadropantalla.setVisibility(View.GONE);
			cuadroficheros.setVisibility(View.GONE);
			cuadrobuscar.setVisibility(View.GONE);
			edicion.setVisibility(View.GONE);
			cuadrocalendario.setVisibility(View.GONE);
		}
		else {
			
		}
		if (transferencias.getString("Mostrar opción", "").equals("Organizar")) {
			barraherramientas.setVisibility(View.VISIBLE);
			cuadropantalla.setVisibility(View.VISIBLE);
			cuadroficheros.setVisibility(View.GONE);
			cuadrobuscar.setVisibility(View.GONE);
			edicion.setVisibility(View.GONE);
			cuadrocargar.setVisibility(View.GONE);
			cuadrocalendario.setVisibility(View.GONE);
		}
		else {
			
		}
		registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(" Opción ".concat(transferencias.getString("Mostrar opción", "").concat("".concat("")))))));
		_actualizarregistro();
	}
	
	
	public void _cargarfichero() {
		if (transferencias.getString("Rutina", "").equals("Fin")) {
			if (contadorcargar < slist.size()) {
				
			}
			else {
				
			}
			transferencias.edit().putString("Rutina", "Inicio").commit();
			texto.setText(texto.getText().toString().concat(slist.get((int)(contadorcargar)).concat("\n")));
			textocargar.setText(String.valueOf((long)((contadorcargar / slist.size()) * 100)).concat("%/".concat(String.valueOf((long)(slist.size())).concat(". ".concat("".concat(""))))));
			progressbar1.setProgress((int)(contadorcargar / slist.size()) * 100);
			textoprogreso.setText("Cargando".concat(transferencias.getString("Nombre nota", "").concat(". ".concat(String.valueOf((long)(contadorcargar)).concat("/".concat(String.valueOf((long)(slist.size())).concat("")))))));
			lineas.add(slist.get((int)(contadorcargar)));
			listabuscar.add("(".concat(String.valueOf((long)(contadorcargar + 1)).concat(") ".concat(slist.get((int)(contadorcargar))))));
			
			if (contadorcargar == 0) {
				
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Calendario)")) {
				transferencias.edit().putString("Horario personalizado cargado", "No").commit();
				transferencias.edit().putString("Sección", "Calendario").commit();
				transferencias.edit().putString("Tarea", slist.get((int)(contadorcargar))).commit();
				transferencias.edit().putString("Horario personalizado cargado", "No").commit();
				transferencias.edit().putString("Mostrar sección", "Calendario").commit();
				_mostrarseccion();
			}
			else {
				
			}
			if (transferencias.getString("Tarea", "").equals("(Calendario)")) {
				transferencias.edit().putString("Mostrar sección", "Calendario").commit();
				_mostrarseccion();
				if (slist.get((int)(contadorcargar)).equals("(Día)")) {
					contadorcargar++;
					listadia.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
					if (slist.get((int)(contadorcargar)).equals(transferencias.getString("Día", ""))) {
						transferencias.edit().putString("Día seleccionado", transferencias.getString("Día", "")).commit();
					}
					else {
						
					}
				}
				else {
					
				}
				if (slist.get((int)(contadorcargar)).equals("(Mes)")) {
					contadorcargar++;
					listames.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
					if (slist.get((int)(contadorcargar)).equals(transferencias.getString("Mes", ""))) {
						transferencias.edit().putString("Mes seleccionado", transferencias.getString("Mes", "")).commit();
					}
					else {
						
					}
				}
				else {
					
				}
				if (slist.get((int)(contadorcargar)).equals("(Año)")) {
					contadorcargar++;
					listaano.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
					if (slist.get((int)(contadorcargar)).equals(transferencias.getString("Año", ""))) {
						transferencias.edit().putString("Año seleccionado", transferencias.getString("Año", "")).commit();
					}
					else {
						
					}
				}
				else {
					
				}
				if (slist.get((int)(contadorcargar)).equals("(Estado)")) {
					contadorcargar++;
					listaestado.add(slist.get((int)(contadorcargar)));
					if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
						if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
							if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
								transferencias.edit().putString("Estado", slist.get((int)(contadorcargar))).commit();
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
				if (slist.get((int)(contadorcargar)).equals("(Comentario)")) {
					contadorcargar++;
					comentarios.add(slist.get((int)(contadorcargar)));
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("2")) {
						if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
							if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
								if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
									transferencias.edit().putString("Comentario", slist.get((int)(contadorcargar))).commit();
									if (transferencias.getString("Comentario", "").equals("(No)")) {
										comentario.setText("");
										comentario.setHint("Sin comentario");
									}
									else {
										comentario.setText(transferencias.getString("Comentario", ""));
									}
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
				if (slist.get((int)(contadorcargar)).equals("(Hora desde)")) {
					contadorcargar++;
					horadesde.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
					if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
						if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
							if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
								transferencias.edit().putString("Hora desde", slist.get((int)(contadorcargar))).commit();
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
				if (slist.get((int)(contadorcargar)).equals("(Hora hasta)")) {
					contadorcargar++;
					horahasta.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
					if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
						if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
							if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
								transferencias.edit().putString("Hora hasta", slist.get((int)(contadorcargar))).commit();
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
				if (slist.get((int)(contadorcargar)).equals("(Horario personalizado)")) {
					if (transferencias.getString("Horario personalizado cargado", "").equals("No")) {
						transferencias.edit().putString("Horario personalizado cargado", "Si").commit();
						contadorcargar++;
						transferencias.edit().putString("Vueltas", slist.get((int)(contadorcargar))).commit();
						if (Double.parseDouble(transferencias.getString("Vueltas", "")) > 0) {
							for(int _repeat301 = 0; _repeat301 < (int)(Double.parseDouble(transferencias.getString("Vueltas", ""))); _repeat301++) {
								contadorcargar++;
								listanombrehorario.add(slist.get((int)(contadorcargar)));
								contadorcargar++;
								nombrehorariopersonalizado.add(slist.get((int)(contadorcargar)));
								contadorcargar++;
								horadesdepersonalizado.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
								contadorcargar++;
								horahastapersonalizado.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
							}
							personalizado1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listanombrehorario));
							((ArrayAdapter)personalizado1.getAdapter()).notifyDataSetChanged();
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
				if (slist.get((int)(contadorcargar)).equals("(Horario seleccionado)")) {
					contadorcargar++;
					horarioseleccionado.add(slist.get((int)(contadorcargar)));
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("2")) {
						if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
							if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
								if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
									transferencias.edit().putString("Horario seleccionado", slist.get((int)(contadorcargar))).commit();
									if (transferencias.getString("Horario seleccionado", "").equals("No")) {
										
									}
									else {
										if (listanombrehorario.size() > 0) {
											_comprobarhorarioseleccionado();
										}
										else {
											
										}
									}
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
				if (slist.get((int)(contadorcargar)).equals("(Fin registro)")) {
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("2")) {
						if (comentarios.size() < listadia.size()) {
							comentarios.add("(No)");
							if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
								if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
									if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
										comentario.setText("");
										comentario.setHint("Sin comentario");
									}
									else {
										
									}
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
						if (horarioseleccionado.size() < listadia.size()) {
							horarioseleccionado.add("(No)");
							if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
								if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
									if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
										transferencias.edit().putString("Horario seleccionado", "(No)").commit();
										if (transferencias.getString("Horario seleccionado", "").equals("No")) {
											
										}
										else {
											if (listanombrehorario.size() > 0) {
												_comprobarhorarioseleccionado();
											}
											else {
												
											}
										}
									}
									else {
										
									}
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
				_cargarfichero1();
			}
			else {
				
			}
			
			transferencias.edit().putString("Vueltas", String.valueOf((long)(Double.parseDouble(transferencias.getString("Vueltas", "")) + 1))).commit();
			if (Double.parseDouble(transferencias.getString("Vueltas", "")) == 14) {
				transferencias.edit().putString("Vueltas", "0").commit();
			}
			else {
				
			}
			transferencias.edit().putString("Cargando", "Si").commit();
		}
		else {
			
		}
		if (transferencias.getString("Rutina", "").equals("Fin")) {
			//. Fin de carga de archivo. Comprueba si se ha leído toda la rutina de carga en esta rutina y la rutina cargar fichero 1 en cada bucle y luego si el bucle ha finalizado 
			contadorcargar++;
			if ((contadorcargar == slist.size()) || (contadorcargar > slist.size())) {
				//registro
				transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Módulo cargar fichero. Fin de carga de archivo (".concat(transferencias.getString("Nombre nota", "").concat("). Datos (".concat(String.valueOf((long)(contadorcargar + 1)).concat("/".concat(String.valueOf((long)(slist.size())).concat(") ")))))))))).commit();
				_actualizarregistroreciente();
				//fin de registro 
				if (veces < 1) {
					textocargar.setText("Cargado ");
					transferencias.edit().putString("Último texto", texto.getText().toString()).commit();
					transferencias.edit().putString("Cargado", "Si").commit();
					transferencias.edit().putString("Cargando", "No").commit();
					transferencias.edit().putString("Cambiado1", "No").commit();
					textotemporal = texto.getText().toString();
					transferencias.edit().putString("Método", "1").commit();
					if (transferencias.getString("Método", "").equals("2")) {
						posicion.add(texto.getText().toString());
						//cursorposicion.add(edittext1.getSelectionStart());
					}
					else {
						
					}
					texto.setLines(slist.size());
					veces++;
					//Comprobar si existe registro de hoy 
					if (transferencias.getString("Tarea", "").equals("(Calendario)")) {
						transferencias.edit().putString("Fecha", "Comprobar").commit();
						transferencias.edit().putString("Comprobar fecha", "Si").commit();
						//Comprobar fecha 
						transferencias.edit().putString("Día seleccionado", transferencias.getString("Día", "")).commit();
						transferencias.edit().putString("Mes seleccionado", transferencias.getString("Mes", "")).commit();
						transferencias.edit().putString("Año seleccionado", transferencias.getString("Año", "")).commit();
						_comprobarfecha();
						transferencias.edit().putString("Mostrar opción", "Calendario").commit();
						_mostraropcion();
						transferencias.edit().putString("Cambiado1", "No").commit();
						_actualizarinformeavisos();
					}
					else {
						
					}
					if (listadia.size() > 0) {
						borrarevento.setVisibility(View.VISIBLE);
					}
					else {
						borrarevento.setVisibility(View.GONE);
					}
					opciones.setVisibility(View.VISIBLE);
					_proximoaviso();
					transferencias.edit().putString("Cargando", "No").commit();
					if (Double.parseDouble(transferencias.getString("Líneas", "")) < Double.parseDouble(transferencias.getString("Carga rápida a partir de datos", ""))) {
						temporizadorcargar.cancel();
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
		}
		else {
			
		}
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			str = FileUtil.readFile(transferencias.getString("Ruta ficheros", "").concat("/".concat(transferencias.getString("Nombre fichero", "").concat(".txt"))));
			slist.clear();
			String [] arr = str.split("\n");
			for (int i = 0; i < arr.length; i++) {
				slist.add(arr[i]);
			}
			contador = 0;
			for(int _repeat24 = 0; _repeat24 < (int)(slist.size()); _repeat24++) {
				if (contador < slist.size()) {
					if (slist.get((int)(contador)).equals("Días de la semana")) {
						contador++;
					}
					else {
						
					}
					contador++;
				}
				else {
					
				}
			}
		}
		else {
			
		}
	}
	
	
	public void _copiarutinas() {
		
	}
	
	
	public void _comprobarfecha() {
		transferencias.edit().putString("Posición", "0").commit();
		transferencias.edit().putString("Fecha", "Comprobar").commit();
		transferencias.edit().putString("Cambiado", "No").commit();
		transferencias.edit().putString("Encontrado", "No").commit();
		transferencias.edit().putString("Buscando", "Si").commit();
		if (listadia.size() > 0) {
			contador = 0;
			for(int _repeat22 = 0; _repeat22 < (int)(listadia.size()); _repeat22++) {
				if (contador < listadia.size()) {
					
					if ((listadia.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Día seleccionado", ""))) && ((listames.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Mes seleccionado", ""))) && (listaano.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Año seleccionado", ""))))) {
						transferencias.edit().putString("Posición", String.valueOf((long)(contador))).commit();
						transferencias.edit().putString("Encontrado", "Si").commit();
						transferencias.edit().putString("Estado", listaestado.get((int)(contador))).commit();
						transferencias.edit().putString("Hora desde", String.valueOf((long)(horadesde.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue()))).commit();
						transferencias.edit().putString("Hora hasta", String.valueOf((long)(horahasta.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue()))).commit();
						transferencias.edit().putString("Último suceso", listaestado.get((int)(contador))).commit();
						transferencias.edit().putString("Última hora desde", String.valueOf((long)(horadesde.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue()))).commit();
						transferencias.edit().putString("Última hora hasta", String.valueOf((long)(horahasta.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue()))).commit();
						break;
					}
					else {
						
					}
				}
				else {
					
				}
				contador++;
			}
			aviso.setTitle("Posición");
			aviso.setMessage(transferencias.getString("Posición", "").concat("".concat("".concat(""))));
			aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			if (transferencias.getString("Encontrado", "").equals("No")) {
				//textview junto al textview búsqueda que muestra si existe registro del evento y cuantos hay 
				textobusqueda.setText("No existe registro. ".concat(""));
				tiposuceso.setSelection((int)(0));
				spunnerdesdehora.setSelection((int)(0));
				spinnerhastahora.setSelection((int)(0));
				opciones.setVisibility(View.GONE);
				comentario.setText("");
				comentario.setHint("Sin comentario");
				horariopersonalizado.setVisibility(View.GONE);
				cuadrohorario.setVisibility(View.GONE);
				personalizado1.setVisibility(View.GONE);
				borrarevento.setVisibility(View.GONE);
				if (transferencias.getString("Búsqueda", "").equals("No")) {
					
				}
				else {
					
				}
				registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". No existe fecha seleccionada: ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", "").concat(""))))))))));
				aviso.setTitle("Aplicaciones");
				aviso.setMessage("No hay registro ".concat("".concat("".concat(""))));
				aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
			}
			else {
				borrarevento.setVisibility(View.VISIBLE);
				textobusqueda.setText("Registro ".concat(String.valueOf((long)(Double.parseDouble(transferencias.getString("Posición", "")))).concat("/".concat(String.valueOf((long)(listadia.size())).concat("")))));
				if (transferencias.getString("Búsqueda", "").equals("No")) {
					
				}
				else {
					
				}
				opciones.setVisibility(View.VISIBLE);
				if (listaestado.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).equals("Ocupado parcial")) {
					cuadrohorario.setVisibility(View.VISIBLE);
					if (listanombrehorario.size() > 0) {
						horariopersonalizado.setVisibility(View.VISIBLE);
						personalizado1.setVisibility(View.VISIBLE);
					}
					else {
						horariopersonalizado.setVisibility(View.GONE);
						personalizado1.setVisibility(View.GONE);
					}
					aviso.setTitle("Aplicaciones");
					aviso.setMessage("Horario personalizado mostrado ".concat("".concat("".concat(""))));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
				}
				else {
					horariopersonalizado.setVisibility(View.GONE);
					cuadrohorario.setVisibility(View.GONE);
					personalizado1.setVisibility(View.GONE);
					aviso.setTitle("Aplicaciones");
					aviso.setMessage("Horario personalizado oculto".concat("".concat("".concat(""))));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
				}
				contador = 0;
				for(int _repeat113 = 0; _repeat113 < (int)(listatiposuceso.size()); _repeat113++) {
					if (contador < listatiposuceso.size()) {
						if (listatiposuceso.get((int)(contador)).equals(listaestado.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))))) {
							tiposuceso.setSelection((int)(contador));
							
						}
						else {
							
						}
						
						contador++;
					}
					else {
						
					}
				}
				if (comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).equals("(No)")) {
					comentario.setText("");
					comentario.setHint("Sin comentario");
				}
				else {
					transferencias.edit().putString("Comentario", comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición", ""))))).commit();
					transferencias.edit().putString("Último comentario", comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición", ""))))).commit();
					comentario.setText(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))));
					aviso.setTitle("Aplicaciones");
					aviso.setMessage("".concat("".concat("".concat(""))));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
				}
				if (transferencias.getString("Encontrado", "").equals("(No)")) {
					
				}
				else {
					
				}
				if (comentarios.size() == listadia.size()) {
					if (Double.parseDouble(transferencias.getString("Posición", "")) < comentarios.size()) {
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Método", "").equals("1")) {
							
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					comentario.setText("");
				}
				registro.add("Comentario: ".concat(transferencias.getString("Encontrado", "").concat(" ".concat("(".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(comentarios.size())).concat(") ".concat(". Datos totales: ".concat(String.valueOf((long)(listadia.size())).concat("".concat("".concat("")))))))))))));
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("1")) {
					
				}
				else {
					
				}
				contador = 0;
				for(int _repeat168 = 0; _repeat168 < (int)(listahorariodesde.size()); _repeat168++) {
					if (contador < listahorariodesde.size()) {
						if (listahorariodesde.get((int)(contador)).equals(String.valueOf((long)(horadesde.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())))) {
							spunnerdesdehora.setSelection((int)(Double.parseDouble(listahorariodesde.get((int)(contador)))));
							
							break;
						}
						else {
							
						}
						registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat("Hora de inicio encontrada: ".concat(transferencias.getString("Encontrado", "").concat(" ".concat("(".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(listahorariodesde.size())).concat(") ".concat(listahorariodesde.get((int)(contador)).concat(" = ".concat(String.valueOf((long)(horadesde.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat(""))))))))))))));
						
						contador++;
					}
					else {
						
					}
				}
				contador = 0;
				for(int _repeat211 = 0; _repeat211 < (int)(listahorariohasta.size()); _repeat211++) {
					if (contador < listahorariohasta.size()) {
						if (listahorariohasta.get((int)(contador)).equals(String.valueOf((long)(horahasta.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())))) {
							spinnerhastahora.setSelection((int)(Double.parseDouble(listahorariodesde.get((int)(contador)))));
							break;
						}
						else {
							
						}
						contador++;
					}
					else {
						
					}
				}
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					
				}
				else {
					
				}
				dato = transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Fecha comprobada. Día de la semana: ".concat(transferencias.getString("Día de la semana seleccionado", "").concat(". Fecha seleccionada: ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", "").concat(". ")))))))))));
				dato = dato.concat(". Fecha encontrada: ".concat(transferencias.getString("Encontrado", "").concat(" ")));
				if (transferencias.getString("Encontrado", "").equals("Si")) {
					dato = dato.concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición", "")))).doubleValue())).concat(". Posición: ".concat(transferencias.getString("Posición", "").concat("/".concat(String.valueOf((long)(listadia.size())).concat(""))))))))));
				}
				else {
					
				}
				registro.add(dato);
			}
			textobusqueda.setText(textobusqueda.getText().toString().concat("Registros: ".concat(String.valueOf((long)(listadia.size())).concat(". Avisos: ".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat("".concat("")))))));
			
			transferencias.edit().putString("Método", "1").commit();
			if (transferencias.getString("Método", "").equals("1")) {
				
			}
			else {
				
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), "Base de datos vacía".concat("".concat("".concat("".concat("".concat("".concat("".concat(""))))))));
		}
		transferencias.edit().putString("Buscando", "No").commit();
		if (transferencias.getString("Encontrado", "").equals("Si")) {
			
		}
		else {
			
		}
		_actualizarregistro();
		aviso.setTitle("Información");
		aviso.setMessage("Encontrado ".concat(transferencias.getString("Encontrado", "").concat("".concat("".concat("")))));
		aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("1")) {
			
		}
		else {
			
		}
		if (toque == 0) {
			toque++;
		}
		else {
			
		}
		transferencias.edit().putString("Cargando", "No").commit();
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			if ((0 < fecha.size()) && ((0 < fecha.size()) && (0 < fecha.size()))) {
				if (fecha.get((int)0).get("Día").toString().equals("No")) {
					aviso.setTitle("Vacio ".concat(String.valueOf((long)(0)).concat("/".concat(String.valueOf((long)(0)).concat("/".concat(String.valueOf((long)(0)).concat("".concat(""))))))));
					aviso.setMessage("Vacio");
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
					if (estado.get((int)0).get("Mes").toString().equals("No")) {
						if (estado.get((int)0).get("Año").toString().equals("No")) {
							
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					transferencias.edit().putString("Día deducido", String.valueOf((long)(0))).commit();
					transferencias.edit().putString("Mes deducido", fecha.get((int)0).get("Día").toString()).commit();
					transferencias.edit().putString("Año deducido", fecha.get((int)0).get("Mes").toString()).commit();
					registro.add("Fecha deducida ".concat(String.valueOf((long)(0)).concat("/".concat(registrobidimensional.get((int)0).get("Día").toString().concat("/".concat(registrobidimensional.get((int)0).get("Mes").toString().concat("")))))));
					contador = 0;
					for(int _repeat322 = 0; _repeat322 < (int)((listatiposuceso.size() - 1)); _repeat322++) {
						if (estado.get((int)0).get("Día").toString().equals(String.valueOf((long)(0)))) {
							if (estado.get((int)0).get("Mes").toString().equals(String.valueOf((long)(0)))) {
								if (estado.get((int)0).get("Año").toString().equals("Si")) {
									tiposuceso.setSelection((int)(Double.parseDouble(estado.get((int)contador).get("Estado").toString())));
									transferencias.edit().putString("Estado", "").commit();
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
						contador++;
					}
					contador = 0;
					for(int _repeat350 = 0; _repeat350 < (int)((ficheros.size() - 1)); _repeat350++) {
						if (registrobidimensional.get((int)0).get("Día").toString().equals(String.valueOf((long)(0)))) {
							if (registrobidimensional.get((int)0).get("Mes").toString().equals(String.valueOf((long)(0)))) {
								if (registrobidimensional.get((int)0).get("Año").toString().equals(ficheros.get((int)(contador)))) {
									spunnerdesdehora.setSelection((int)(Double.parseDouble(registrobidimensional.get((int)0).get("Año").toString())));
									transferencias.edit().putString("Hora desde", registrobidimensional.get((int)0).get("Estado").toString()).commit();
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
						contador++;
					}
					contador = 0;
					for(int _repeat380 = 0; _repeat380 < (int)((ficheros.size() - 1)); _repeat380++) {
						if (registrobidimensional.get((int)0).get("Día").toString().equals(String.valueOf((long)(0)))) {
							if (registrobidimensional.get((int)0).get("Mes").toString().equals(String.valueOf((long)(0)))) {
								if (registrobidimensional.get((int)0).get("Año").toString().equals(ficheros.get((int)(contador)))) {
									spinnerhastahora.setSelection((int)(Double.parseDouble(registrobidimensional.get((int)0).get("Estado").toString())));
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
						contador++;
					}
				}
			}
			else {
				
			}
		}
		else {
			
		}
		if (toque == 1) {
			toque = 0;
		}
		else {
			
		}
		if (transferencias.getString("Último día", "").equals(String.valueOf((long)(0)))) {
			
		}
		else {
			
		}
	}
	
	
	public void _ventanafecha() {
	} 
	public static class DatePickerFragment extends androidx.appcompat.app.AppCompatDialogFragment implements DatePickerDialog.OnDateSetListener {
		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
			final Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH);
			int day = c.get(Calendar.DAY_OF_MONTH);
			int textodia = day;
			return new DatePickerDialog(getActivity(), AlertDialog.THEME_DEVICE_DEFAULT_DARK , this, year, month, day);
		}
		public void onDateSet(DatePicker view, int year, int month, int day) {
			int mon = month +1;
			String date = day + "/" + mon + "/" + year;
			EditText separadorcalendario4 = (EditText) getActivity().findViewById(R.id.separadorcalendario4);
			separadorcalendario4.setText(date);
		} 
	}
	
	
	public void _seleccionarfecha() {
		
	}
	
	
	public void _comprobarhorarioseleccionado() {
		if (listanombrehorario.size() > 0) {
			contador = 0;
			for(int _repeat14 = 0; _repeat14 < (int)(listanombrehorario.size()); _repeat14++) {
				if (contador < listanombrehorario.size()) {
					if (transferencias.getString("Horario seleccionado", "").equals(nombrehorariopersonalizado.get((int)(contador)))) {
						transferencias.edit().putString("Encontrado", nombrehorariopersonalizado.get((int)(contador))).commit();
						break;
					}
					else {
						
					}
				}
				else {
					
				}
				contador++;
			}
			transferencias.edit().putString("Método", "2").commit();
			if (transferencias.getString("Método", "").equals("2")) {
				contador = 0;
				for(int _repeat35 = 0; _repeat35 < (int)(nombrehorariopersonalizado.size()); _repeat35++) {
					if (contador < nombrehorariopersonalizado.size()) {
						if (nombrehorariopersonalizado.get((int)(contador)).equals(transferencias.getString("Encontrado", ""))) {
							spunnerdesdehora.setSelection((int)(horadesdepersonalizado.get((int)(contador)).doubleValue()));
							spinnerhastahora.setSelection((int)(horahastapersonalizado.get((int)(contador)).doubleValue()));
							transferencias.edit().putString("Hora desde", String.valueOf((long)(horadesdepersonalizado.get((int)(contador)).doubleValue()))).commit();
							transferencias.edit().putString("Hora hasta", String.valueOf((long)(horahastapersonalizado.get((int)(contador)).doubleValue()))).commit();
						}
						else {
							
						}
						contador++;
					}
					else {
						
					}
				}
			}
			else {
				
			}
			_comprobarcambio();
		}
		else {
			
		}
	}
	
	
	public void _ventanaintroducirtexto() {
		aviso.setTitle(transferencias.getString("Título", ""));
		aviso.setMessage(transferencias.getString("Mensaje", ""));
		final EditText 
		
		
		edittext
		
		
		= new EditText(
		
		
		MainActivity
		
		
		.this);
		LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		
		
		
		edittext.setLayoutParams(lpar);
		
		
		
		aviso.setView(edittext);
		aviso.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				edittext1.setText(edittext.getText().toString());
				edittext1.setVisibility(View.VISIBLE);
				//String s = edittext.getText().toString();
				//boolean isNumeric = (s != null && s.matches("[0-9]+"));
				//System.out.println("IsNumeric: " + isNumeric);
				//if (isNumeric) {
				//numerico="Si";
				//}
				//else {
				//numerico = "No" ;
				//} 
				if (edittext.getText().toString().equals("")) {
					editartexto.setTitle("Comprobar dato");
					editartexto.setMessage("El nombre o dato no es válido ".concat("".concat("".concat(""))));
					editartexto.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					editartexto.create().show();
				}
				else {
					if (transferencias.getString("Ventana texto", "").equals("Nombre horario")) {
						transferencias.edit().putString("Encontrado", "No").commit();
						if (listanombrehorario.size() > 0) {
							//Comprobar si existe 
							contador = 0;
							for(int _repeat54 = 0; _repeat54 < (int)(listanombrehorario.size()); _repeat54++) {
								if (contador < listanombrehorario.size()) {
									if (edittext.getText().toString().equals(listanombrehorario.get((int)(contador)))) {
										transferencias.edit().putString("Encontrado", "Si").commit();
										break;
									}
									else {
										
									}
								}
								else {
									
								}
								contador++;
							}
						}
						else {
							
						}
						//
						if (transferencias.getString("Encontrado", "").equals("No")) {
							horariopersonalizado.setVisibility(View.VISIBLE);
							personalizado1.setVisibility(View.VISIBLE);
							listanombrehorario.add(edittext.getText().toString());
							personalizado1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listanombrehorario));
							((ArrayAdapter)personalizado1.getAdapter()).notifyDataSetChanged();
							nombrehorariopersonalizado.add(edittext.getText().toString());
							transferencias.edit().putString("Horario seleccionado", edittext.getText().toString()).commit();
							horadesdepersonalizado.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora desde", ""))));
							horahastapersonalizado.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora hasta", ""))));
							personalizado1.setSelection((int)(contador));
							transferencias.edit().putString("Método", "1").commit();
							if (transferencias.getString("Método", "").equals("2")) {
								
							}
							else {
								
							}
						}
						else {
							editartexto.setTitle("Nombre");
							editartexto.setMessage("El nombre (".concat(listanombrehorario.get((int)(contador)).concat(") ya existe ".concat(""))));
							editartexto.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							editartexto.create().show();
						}
					}
					else {
						
					}
				}
			}
		});
		aviso.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				edittext1.setVisibility(View.INVISIBLE);
			}
		});
		aviso.create().show();
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			//final EditText texto = new EditText(MainActivity.this);
			//LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
			//texto.setLayoutParams(lpar);
			//editartexto.setView(texto);
			texto.setText(texto.getText());
		}
		else {
			
		}
	}
	
	
	public void _ocultar() {
		_ocultaropciones();
		solodatos.setVisibility(View.GONE);
		separadorcalendario13.setVisibility(View.GONE);
		cuadrodatos.setVisibility(View.GONE);
		separadorcalendario13.setVisibility(View.GONE);
		botonguardar.setVisibility(View.GONE);
		dimensiones.setVisibility(View.GONE);
		textodimensiones.setVisibility(View.GONE);
		principal1.setVisibility(View.VISIBLE);
		tipoconfiguracion.setVisibility(View.INVISIBLE);
		separadornotas1.setVisibility(View.GONE);
		botonguardarconfiguracion.setVisibility(View.INVISIBLE);
		linearprogreso.setVisibility(View.GONE);
		tipocita.setVisibility(View.GONE);
		cuadrohorario.setVisibility(View.GONE);
		separadorcalendario25.setVisibility(View.GONE);
		cuadrodesdehasta.setVisibility(View.GONE);
		sustituir.setVisibility(View.GONE);
		linear57.setVisibility(View.GONE);
		seccionbuscartexto.setVisibility(View.GONE);
		excepciones.setVisibility(View.GONE);
		excepciones1.setVisibility(View.GONE);
		domingo.setVisibility(View.GONE);
		filtro.setVisibility(View.GONE);
		sustituir.setVisibility(View.GONE);
		solodiassemana.setVisibility(View.GONE);
		diasemanaexcepcionales.setVisibility(View.GONE);
		domingo.setVisibility(View.GONE);
		diasdelmes.setVisibility(View.GONE);
		cuadrodiasdelasemana.setVisibility(View.GONE);
		separadorcalendario5.setVisibility(View.GONE);
		separadorcalendario6.setVisibility(View.GONE);
		separadorcalendario.setVisibility(View.GONE);
		separadorcalendario10.setVisibility(View.GONE);
		separadorcalendario8.setVisibility(View.GONE);
		separadorcalendario2.setVisibility(View.GONE);
		separadorcalendario6.setVisibility(View.GONE);
		separadorcalendario7.setVisibility(View.GONE);
		separadorcalendario4.setVisibility(View.GONE);
		separadorcalendario1.setVisibility(View.GONE);
		separadorcalendario9.setVisibility(View.GONE);
		separadorcalendario11.setVisibility(View.GONE);
		separadorcalendario12.setVisibility(View.GONE);
		separadorcalendario13.setVisibility(View.GONE);
		separadorcalendario14.setVisibility(View.GONE);
		separadorcalendario15.setVisibility(View.GONE);
		separadorcalendario16.setVisibility(View.GONE);
		separadorcalendario17.setVisibility(View.GONE);
		separadorcalendario18.setVisibility(View.GONE);
		separadorcalendario19.setVisibility(View.GONE);
		separadorcalendario20.setVisibility(View.GONE);
		separadorcalendario21.setVisibility(View.GONE);
		separadorcalendario21.setVisibility(View.GONE);
		separadorcalendario22.setVisibility(View.GONE);
		separadorcalendario23.setVisibility(View.GONE);
		separadorcalendario24.setVisibility(View.GONE);
		separadorcalendario25.setVisibility(View.GONE);
		separadorcalendario26.setVisibility(View.GONE);
		separadorcalendario27.setVisibility(View.GONE);
		separadorcalendario28.setVisibility(View.GONE);
		separadorcalendario29.setVisibility(View.GONE);
		separadorcalendario30.setVisibility(View.GONE);
		separadorcalendario31.setVisibility(View.GONE);
		separadorcalendario32.setVisibility(View.GONE);
		separadorcalendario33.setVisibility(View.GONE);
		separadorcalendario34.setVisibility(View.GONE);
		separadorcalendario36.setVisibility(View.GONE);
		separadorcalendario37.setVisibility(View.GONE);
		nombrehorario.setVisibility(View.GONE);
		horariopersonalizado.setVisibility(View.GONE);
		personalizado1.setVisibility(View.GONE);
		cuadrodatos.setVisibility(View.GONE);
		cuadrodatos1.setVisibility(View.GONE);
		cuadrodatos2.setVisibility(View.GONE);
		cuadrodatos3.setVisibility(View.GONE);
		checkbox15.setVisibility(View.GONE);
		exceptodiasdelmes.setVisibility(View.GONE);
		registroizquierda.setVisibility(View.GONE);
		registroderecha.setVisibility(View.GONE);
		cuadrosolodias.setVisibility(View.GONE);
		avisoeventos.setVisibility(View.GONE);
		cuadrocriteriosgenerales.setVisibility(View.GONE);
		cuadrocriterios.setVisibility(View.GONE);
		button47.setVisibility(View.GONE);
		avisoeventos.setVisibility(View.GONE);
		cuadrocriteriosgenerales.setVisibility(View.GONE);
		formaaviso.setVisibility(View.GONE);
		cuadroformasaviso.setVisibility(View.GONE);
		cuadroeventos.setVisibility(View.GONE);
		cuadrocriteriosgenerales.setVisibility(View.GONE);
		eventoproximo.setVisibility(View.GONE);
		textofechasaviso.setVisibility(View.GONE);
		cuadromomento.setVisibility(View.GONE);
		checkcopiar.setVisibility(View.GONE);
		linear58.setVisibility(View.GONE);
		separadoropciones.setVisibility(View.GONE);
		separadoropciones1.setVisibility(View.GONE);
		button53.setVisibility(View.GONE);
		botonfinseleccion.setVisibility(View.GONE);
		borraravisoevento.setVisibility(View.GONE);
		borraravisoforma.setVisibility(View.GONE);
		borraravisomomento.setVisibility(View.GONE);
		button56.setVisibility(View.GONE);
		button57.setVisibility(View.GONE);
		cuadroaviso.setVisibility(View.GONE);
		textview20.setVisibility(View.GONE);
		textview24.setVisibility(View.GONE);
		textview25.setVisibility(View.GONE);
		textview26.setVisibility(View.GONE);
		cuadrocriteriosaviso.setVisibility(View.GONE);
		cuadrocriteriosaviso.setPadding(0, 0, 0, 0);
		linear43.setPadding(0, 0, 0, 0);
		// Supongamos que ya tienes declarado el LinearLayout con el ID "linear43"
		LinearLayout miLinearLayout = findViewById(R.id.linear43);
		
		// Obtiene los parámetros de diseño del LinearLayout
		LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) miLinearLayout.getLayoutParams();
		
		// Establece los márgenes a cero
		layoutParams.setMargins(0, 0, 0, 0);
		
		// Aplica los cambios al LinearLayout
		miLinearLayout.setLayoutParams(layoutParams);
		
		
		
		guardaraviso.setVisibility(View.GONE);
		separadorconfiguracion.setVisibility(View.GONE);
		separadorconfiguracion1.setVisibility(View.GONE);
		//, esto corrige el desplazamiento de la lista de archivos 
		// Asegúrate de que no haya márgenes o padding adicionales
		LinearLayout principal1 = findViewById(R.id.principal1);
		ListView listView = findViewById(R.id.listview1);
		
		//ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) listView.getLayoutParams();
		layoutParams.setMargins(0, 0, 0, 0);
		listView.setLayoutParams(layoutParams);
		
		listView.setPadding(0, 0, 0, 0);
		
		//este bloque debe ser el último 
		opciones.setVisibility(View.VISIBLE);
	}
	
	
	public void _guardarregistro() {
		transferencias.edit().putString("Dato", "".concat("".concat("".concat(". Registro guardado. Datos: ".concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat("".concat(""))))))))))))).commit();
		if (registro.size() > 0) {
			contador = 0;
			for(int _repeat21 = 0; _repeat21 < (int)(registro.size()); _repeat21++) {
				if (contador < registro.size()) {
					transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(registro.get((int)(contador)).concat("\n"))).commit();
				}
				else {
					
				}
				contador++;
			}
		}
		else {
			
		}
		FileUtil.writeFile(transferencias.getString("Ruta registro", "").concat("/registro general.txt"), transferencias.getString("Dato", ""));
	}
	
	
	public void _cargarregistro() {
		if (transferencias.getString("Cargar registro", "").equals("General")) {
			if (FileUtil.isExistFile(transferencias.getString("Ruta registro", "").concat("/registro general.txt"))) {
				slist.clear();
				str = FileUtil.readFile(transferencias.getString("Ruta registro", "").concat("/registro general.txt"));
				String [] arr = str.split("\n");
				for (int i = 0; i < arr.length; i++) {
					slist.add(arr[i]);
				}
			}
			else {
				
			}
		}
		else {
			
		}
		_actualizarregistro();
	}
	
	
	public void _guardaregistro() {
		
	}
	
	
	public void _comprobarcambio() {
		if (transferencias.getString("Estado", "").equals("Ocupado parcial")) {
			cuadrohorario.setVisibility(View.VISIBLE);
			if (listanombrehorario.size() > 0) {
				horariopersonalizado.setVisibility(View.VISIBLE);
				personalizado1.setVisibility(View.VISIBLE);
			}
			else {
				horariopersonalizado.setVisibility(View.GONE);
				personalizado1.setVisibility(View.GONE);
			}
		}
		else {
			cuadrohorario.setVisibility(View.GONE);
		}
		if (transferencias.getString("Estado", "").equals("Seleccione tipo de cita")) {
			cuadrohorario.setVisibility(View.GONE);
			horariopersonalizado.setVisibility(View.GONE);
			personalizado1.setVisibility(View.GONE);
			botonbuscar.setVisibility(View.GONE);
		}
		else {
			botonbuscar.setVisibility(View.VISIBLE);
		}
		if (transferencias.getString("Estado", "").equals("Ocupado")) {
			cuadrohorario.setVisibility(View.GONE);
			horariopersonalizado.setVisibility(View.GONE);
			personalizado1.setVisibility(View.GONE);
		}
		else {
			
		}
		if (transferencias.getString("Cambiado1", "").equals("Si")) {
			opciones.setVisibility(View.VISIBLE);
		}
		else {
			
		}
		if (transferencias.getString("Comentario", "").equals("")) {
			botonbuscar.setVisibility(View.GONE);
		}
		else {
			botonbuscar.setVisibility(View.VISIBLE);
		}
	}
	
	
	public void _manejarfecha() {
		if (transferencias.getString("Copiar fecha", "").equals("Si")) {
			transferencias.edit().putString("Copiar fecha", "No").commit();
			listadia.add(Double.valueOf(Double.parseDouble(transferencias.getString("Día", ""))));
			listames.add(Double.valueOf(Double.parseDouble(transferencias.getString("Mes", ""))));
			listaano.add(Double.valueOf(Double.parseDouble(transferencias.getString("Año", ""))));
			listaestado.add(transferencias.getString("Estado", ""));
			comentarios.add(transferencias.getString("Comentario", ""));
			horadesde.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora desde", ""))));
			horahasta.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora hasta", ""))));
			horarioseleccionado.add(transferencias.getString("Horario seleccionado", ""));
			registro.add(transferencias.getString("Hora completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("".concat("")))));
		}
		else {
			
		}
		if (transferencias.getString("Sustituir fecha", "").equals("Si")) {
			transferencias.edit().putString("Sustituir fecha", "No").commit();
			listadia.set((int)contador, Double.parseDouble(transferencias.getString("Día", "")));
			listames.set((int)contador, Double.parseDouble(transferencias.getString("Mes", "")));
			listaano.set((int)contador, Double.parseDouble(transferencias.getString("Año", "")));
			listaestado.set((int)contador, transferencias.getString("Estado", ""));
			comentarios.set((int)contador, transferencias.getString("Comentario", ""));
			horadesde.set((int)contador, Double.parseDouble(transferencias.getString("Hora desde", "")));
			horahasta.set((int)contador, Double.parseDouble(transferencias.getString("Hora hasta", "")));
			horarioseleccionado.set((int)contador, transferencias.getString("Horario seleccionado", ""));
			registro.add(transferencias.getString("Fecha completa", "").concat(" - ".concat(transferencias.getString("Hora completa", "").concat(". Sustituido ".concat(String.valueOf((long)(listadia.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(" por ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat("\n\n".concat("".concat("".concat("")))))))))))))))))));
		}
		else {
			
		}
	}
	
	
	public void _calcularcalendario() {
		
	}
	
	
	public void _modulosegundoplano() {
		
	}
	
	
	public void _copiarosustituir() {
		if (transferencias.getString("Sustituir", "").equals("Si")) {
			listadia.set((int)contador, Double.parseDouble(transferencias.getString("Día", "")));
			listames.set((int)contador, Double.parseDouble(transferencias.getString("Mes", "")));
			listaano.set((int)contador, Double.parseDouble(transferencias.getString("Año", "")));
			listaestado.set((int)contador, transferencias.getString("Estado", ""));
			comentarios.set((int)contador, transferencias.getString("Comentario", ""));
			horadesde.set((int)contador, Double.parseDouble(transferencias.getString("Hora desde", "")));
			horahasta.set((int)contador, Double.parseDouble(transferencias.getString("Hora hasta", "")));
			horarioseleccionado.set((int)contador, transferencias.getString("Horario seleccionado", ""));
			registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Sustituido registro ".concat(String.valueOf((long)(listadia.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(" por ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" sin filtro".concat("".concat("".concat("")))))))))))))))))));
		}
		else {
			listadia.add(Double.valueOf(Double.parseDouble(transferencias.getString("Día", ""))));
			listames.add(Double.valueOf(Double.parseDouble(transferencias.getString("Mes", ""))));
			listaano.add(Double.valueOf(Double.parseDouble(transferencias.getString("Año", ""))));
			listaestado.add(transferencias.getString("Estado", ""));
			comentarios.add(transferencias.getString("Comentario", ""));
			horadesde.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora desde", ""))));
			horahasta.add(Double.valueOf(Double.parseDouble(transferencias.getString("Hora hasta", ""))));
			horarioseleccionado.add(transferencias.getString("Horario seleccionado", ""));
			registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat("Copiado registro ".concat(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat("en fecha/s ".concat("".concat("".concat("")))))))))))));
		}
	}
	
	
	public void _myBackgroundMethod() {
		
	}
	
	
	public void _buscar() {
		transferencias.edit().putString("Día seleccionado", String.valueOf((long)(diaencontrado.get((int)(contador)).doubleValue()))).commit();
		transferencias.edit().putString("Mes seleccionado", String.valueOf((long)(mesencontrado.get((int)(contador)).doubleValue()))).commit();
		transferencias.edit().putString("Año seleccionado", String.valueOf((long)(anoencontrado.get((int)(contador)).doubleValue()))).commit();
		_comprobarfecha();
		textobusqueda.setText(String.valueOf((long)(diaencontrado.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(mesencontrado.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(anoencontrado.get((int)(contador)).doubleValue())).concat(" (".concat(String.valueOf((long)(contador)).concat(String.valueOf((long)(diaencontrado.size())).concat(") ".concat(""))))))))));
	}
	
	
	public void _notificaciones() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
			CharSequence name = "Channel name 1";
			String description = "Notification channel";
			int importance = NotificationManager.IMPORTANCE_MAX;
			NotificationChannel channel = new NotificationChannel("id 1", name, importance);
			channel.setDescription(description);
			
			NotificationManager notificationManager = getSystemService(NotificationManager.class);
			notificationManager.createNotificationChannel(channel);
			
		}
	}
	
	
	public void _proximoaviso() {
		_fechayhora();
		mensaje.clear();
		if (transferencias.getString("Aviso", "").equals("Si")) {
			if (listadia.size() > 0) {
				transferencias.edit().putString("Aviso encontrado", "No").commit();
				transferencias.edit().putString("Posición de aviso", "-1").commit();
				dato = "";
				contador = 0;
				for(int _repeat32 = 0; _repeat32 < (int)(listadia.size()); _repeat32++) {
					if (contador < listadia.size()) {
						if (listadia.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Día", ""))) {
							if (listames.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Mes", ""))) {
								if (listaano.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Año", ""))) {
									transferencias.edit().putString("Aviso encontrado", "Si").commit();
									transferencias.edit().putString("Posición de aviso", String.valueOf((long)(contador))).commit();
									break;
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
					contador++;
				}
				if (transferencias.getString("Aviso encontrado", "").equals("No")) {
					dato = transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" Hoy no hay eventos. ".concat(""))))));
					mensaje.add(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" Hoy no hay eventos. ".concat("")))))));
				}
				else {
					if (transferencias.getString("Evento próximo", "").equals("Si")) {
						dato = "Hoy. ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat(". "))))));
						mensaje.add("Hoy. ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat(". ")))))));
						if (Double.parseDouble(transferencias.getString("Posición de aviso", "")) < listaestado.size()) {
							dato = dato.concat(listaestado.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("\n")));
							mensaje.add("Estado: ".concat(listaestado.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("\n"))));
						}
						else {
							dato = dato.concat("Estado no encontrado".concat(". ".concat("")));
							mensaje.add("Estado no encontrado".concat(". ".concat("")));
						}
						if (Double.parseDouble(transferencias.getString("Posición de aviso", "")) < comentarios.size()) {
							if (comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).equals("(No)")) {
								dato = dato.concat("Sin comentario. ".concat(""));
								mensaje.add("Sin comentario. ".concat(""));
							}
							else {
								dato = dato.concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("\n")));
								mensaje.add("Comentario: ".concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("\n"))));
							}
						}
						else {
							dato = dato.concat("Comentario no encontrado. ".concat(". ".concat("")));
							mensaje.add("Comentario no encontrado. ".concat(". ".concat("")));
						}
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Método", "").equals("2")) {
							dato = dato.concat("Horario: ".concat(String.valueOf((long)(horadesde.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat(":".concat(String.valueOf((long)(horahasta.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("\n")))));
							dato = dato.concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("\n")));
						}
						else {
							
						}
					}
					else {
						
					}
				}
				transferencias.edit().putString("Aviso encontrado", "No").commit();
				contador = 0;
				transferencias.edit().putString("Posición de aviso", "-1").commit();
				for(int _repeat165 = 0; _repeat165 < (int)(listadia.size()); _repeat165++) {
					if (listadia.get((int)(contador)).doubleValue() == (Double.parseDouble(transferencias.getString("Día", "")) + 1)) {
						if (listames.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Mes", ""))) {
							if (listaano.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Año", ""))) {
								transferencias.edit().putString("Aviso encontrado", "Si").commit();
								transferencias.edit().putString("Posición de aviso", String.valueOf((long)(contador))).commit();
								break;
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
					contador++;
				}
				//Comprobar si el día es mayor que días del mes 
				if (transferencias.getString("Aviso encontrado", "").equals("No")) {
					dato = dato.concat(String.valueOf((long)(Double.parseDouble(transferencias.getString("Día", "")) + 1)).concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" Mañana no hay eventos. ".concat("")))))));
					mensaje.add(String.valueOf((long)(Double.parseDouble(transferencias.getString("Día", "")) + 1)).concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" Mañana no hay eventos. ".concat("")))))));
				}
				else {
					if (listadia.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue() > 31) {
						contador--;
					}
					else {
						
					}
					if (transferencias.getString("Evento próximo", "").equals("Si")) {
						dato = dato.concat(" Mañana. ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(". ")))))));
						mensaje.add(" Mañana. ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(". ")))))));
						if (Double.parseDouble(transferencias.getString("Posición de aviso", "")) < listaestado.size()) {
							dato = dato.concat(listaestado.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("")));
							mensaje.add("Estado: ".concat(listaestado.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat(""))));
						}
						else {
							dato = dato.concat("Estado no encontrado".concat(". ".concat("\n")));
							mensaje.add("Estado no encontrado".concat(". ".concat("")));
						}
						if (Double.parseDouble(transferencias.getString("Posición de aviso", "")) < comentarios.size()) {
							if (comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).equals("(No)")) {
								dato = dato.concat("Sin comentario. ".concat(""));
								mensaje.add("Sin comentario. ".concat(""));
							}
							else {
								dato = dato.concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("")));
								mensaje.add("Comentario: ".concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat(""))));
							}
						}
						else {
							dato = dato.concat("Comentario no encontrado. ".concat(". ".concat("\n")));
							mensaje.add("Comentario no encontrado. ".concat(""));
						}
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Método", "").equals("2")) {
							dato = dato.concat("Horario: ".concat(String.valueOf((long)(horadesde.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat(":".concat(String.valueOf((long)(horahasta.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("\n")))));
							dato = dato.concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("")));
						}
						else {
							
						}
					}
					else {
						
					}
				}
			}
			else {
				
			}
			if (eventoproximo.isChecked()) {
				if (mostraraplicacion.isChecked()) {
					if (transferencias.getString("Notificación", "").equals("Si")) {
						_notificaciones();
						Intent intent = new Intent(MainActivity.this, MainActivity.class);
						intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
						PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
						
						androidx.core.app.NotificationCompat.InboxStyle IbStyle = new androidx.core.app.NotificationCompat.InboxStyle(); 
						
						//cargar texto de matriz
						contador = 0;
						for(int _repeat675 = 0; _repeat675 < (int)(mensaje.size()); _repeat675++) {
								if (contador < mensaje.size()) {
										IbStyle.addLine(mensaje.get((int)(contador)));
										if (dato.equals(mensaje.get((int)(contador)))) {
												
										}
										else {
												
										}
								}
								else {
										
								}
								contador++;
						}
						//fin 
						//texto completo
						//IbStyle.addLine(dato);
						//IbStyle.addLine("My name is Neelu Singh");
						//IbStyle.addLine("More");
						IbStyle.setSummaryText(""); 
						IbStyle.setBigContentTitle("Calendario Espartano ");
						//fin 
						androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(MainActivity.this, "id 1")
						.setSmallIcon(R.drawable.img)
						.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
						.setContentTitle("Calendario Espartano")
						.setContentText(dato)
						.setPriority(androidx.core.app.NotificationCompat.PRIORITY_MAX)
						.setStyle(IbStyle)
						.setOngoing(true)
						.setContentIntent(pendingIntent)
						.setAutoCancel(true);
						
						androidx.core.app.NotificationManagerCompat notificationManager = androidx.core.app.NotificationManagerCompat.from(MainActivity.this);
						notificationManager.notify(1, builder.build());
						if (transferencias.getString("Aviso encontrado", "").equals("Si")) {
							
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
			if (transferencias.getString("Decir", "").equals("Si")) {
				voz.speak(dato, TextToSpeech.QUEUE_ADD, null);
			}
			else {
				
			}
			if (transferencias.getString("Ventana", "").equals("Si")) {
				principal.setClass(getApplicationContext(), MainActivity.class);
				principal.setAction(Intent.ACTION_MAIN);
				startActivity(principal);
			}
			else {
				
			}
		}
		else {
			
		}
		registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Aviso fecha: ".concat(transferencias.getString("Aviso", "").concat(". Evento próximo: ".concat(transferencias.getString("Evento próximo", "").concat(". Notificación: ".concat(transferencias.getString("Notificación", "").concat(". Aviso encontrado: ".concat(transferencias.getString("Aviso encontrado", "").concat("".concat("")))))))))))));
		_actualizarregistro();
		contador = 0;
		for(int _repeat675 = 0; _repeat675 < (int)(mensaje.size()); _repeat675++) {
			if (contador < mensaje.size()) {
				//IbStyle.addLine(mensaje.get((int)(contador)));
				if (dato.equals(mensaje.get((int)(contador)))) {
					
				}
				else {
					
				}
			}
			else {
				
			}
			contador++;
		}
	}
	
	
	public void _copias() {
		//segundo plano 
		//background executor create here
		java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();
		
		final Handler handler = new Handler(Looper.getMainLooper());
		
		  executor.execute(new Runnable() {
				
				@Override
				
				public void run() {segundoplano = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (contadorsegundos > 30) {
									cada = 0;
								}
								else {
									
								}
								if (contadorsegundos < 61) {
									contadorsegundos++;
								}
								else {
									contadorsegundos = 0;
									contadorminutos++;
									cada++;
								}
								FileUtil.writeFile(transferencias.getString("Ruta registro", "").concat("/actividad.txt".concat("")), "".concat(String.valueOf((long)(contadorminutos)).concat(":".concat(String.valueOf((long)(contadorsegundos))))));
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(segundoplano, (int)(0), (int)(1000));
				handler.post(new Runnable() {
								
								@Override
								
								public void run() { 
										
										//UI Thread work here
														
								} });
						//background task start here
						
						
						
				} });
		//buscar
		if (listadia.size() > 0) {
			transferencias.edit().putString("Mostrar opción", "Cargar").commit();
			_mostraropcion();
			transferencias.edit().putString("Buscando", "Si").commit();
			contadorbuscar = 0;
			listatemporal.clear();
			diasseleccionados.clear();
			diaencontrado.clear();
			mesencontrado.clear();
			anoencontrado.clear();
			fechasencontradas.clear();
			transferencias.edit().putString("Criterio encontrado", "No").commit();
			if (filtrocomentario.isChecked()) {
				transferencias.edit().putString("Criterios de búsqueda", "Si").commit();
			}
			else {
				
			}
			if (transferencias.getString("Criterio encontrado", "").equals("Si")) {
				transferencias.edit().putString("Criterios de búsqueda", "Si").commit();
			}
			else {
				transferencias.edit().putString("Criterios de búsqueda", "No").commit();
			}
			//buscar en base a todos los criterios 
			contadorbuscar = 0;
			for(int _repeat528 = 0; _repeat528 < (int)(listadia.size()); _repeat528++) {
				if (contadorbuscar < listadia.size()) {
					transferencias.edit().putString("Encontrado", "No").commit();
					if (transferencias.getString("Filtro", "").equals("No")) {
						transferencias.edit().putString("Encontrado", "Si").commit();
					}
					else {
						if (transferencias.getString("Filtro comentario", "").equals("Si")) {
							if (comentarios.get((int)(contadorbuscar)).contains(transferencias.getString("Comentario", ""))) {
								transferencias.edit().putString("Encontrado", "Si").commit();
							}
							else {
								
							}
						}
						else {
							
						}
					}
					if (transferencias.getString("Encontrado", "").equals("Si")) {
						diaencontrado.add(Double.valueOf(listadia.get((int)(contadorbuscar)).doubleValue()));
						mesencontrado.add(Double.valueOf(listames.get((int)(contadorbuscar)).doubleValue()));
						anoencontrado.add(Double.valueOf(listaano.get((int)(contadorbuscar)).doubleValue()));
						fechasencontradas.add(String.valueOf((long)(listadia.get((int)(contadorbuscar)).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contadorbuscar)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contadorbuscar)).doubleValue())))))));
						
						if ((listadia.get((int)(contadorbuscar)).doubleValue() == Double.parseDouble(transferencias.getString("Día seleccionado", ""))) && ((listames.get((int)(contadorbuscar)).doubleValue() == Double.parseDouble(transferencias.getString("Mes seleccionado", ""))) && (listaano.get((int)(contadorbuscar)).doubleValue() == Double.parseDouble(transferencias.getString("Año seleccionado", ""))))) {
							
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
				contadorbuscar++;
			}
			registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Buscando. Criterios: ".concat(transferencias.getString("Criterios de búsqueda", "").concat(". Criterio comentario: ".concat(transferencias.getString("Filtro comentario", "").concat(". Fechas encontradas: ".concat(String.valueOf((long)(fechasencontradas.size())).concat("".concat("".concat(""))))))))))));
			if (diaencontrado.size() > 0) {
				contadorbuscar = 0;
				spinnerbusqueda.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, fechasencontradas));
				((ArrayAdapter)spinnerbusqueda.getAdapter()).notifyDataSetChanged();
				registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Búsqueda. Encontrados: ".concat(String.valueOf((long)(diaencontrado.size())).concat(". Criterios de búsqueda: ".concat(transferencias.getString("Criterios de búsqueda", "").concat("".concat("")))))))));
				if (diaencontrado.size() > 1) {
					registroizquierda.setVisibility(View.VISIBLE);
					registroderecha.setVisibility(View.VISIBLE);
				}
				else {
					registroizquierda.setVisibility(View.GONE);
					registroderecha.setVisibility(View.GONE);
					aviso.setTitle("Aplicaciones");
					aviso.setMessage("Fechas = ".concat(String.valueOf((long)(diaencontrado.size())).concat(". Ocultar botones".concat(""))));
					aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					aviso.create().show();
				}
				spinnerbusqueda.setVisibility(View.VISIBLE);
				borrarevento.setVisibility(View.VISIBLE);
				textobusqueda.setVisibility(View.VISIBLE);
				textobusqueda.setText("".concat(String.valueOf((long)(contadorbuscar + 1)).concat("/".concat(String.valueOf((long)(diaencontrado.size())).concat("")))));
				spinnerbusqueda.setSelection((int)(contadorbuscar));
				transferencias.edit().putString("Día seleccionado", String.valueOf((long)(diaencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
				transferencias.edit().putString("Mes seleccionado", String.valueOf((long)(mesencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
				transferencias.edit().putString("Año seleccionado", String.valueOf((long)(anoencontrado.get((int)(contadorbuscar)).doubleValue()))).commit();
				_comprobarfecha();
			}
			else {
				registroizquierda.setVisibility(View.GONE);
				registroderecha.setVisibility(View.GONE);
				textobusqueda.setVisibility(View.GONE);
				borrarevento.setVisibility(View.GONE);
			}
			_actualizarregistro();
			transferencias.edit().putString("Buscando", "No").commit();
		}
		else {
			
		}
		//copia cargar datos dentro de bucle 
		if (slist.get((int)(contadorcargar)).equals("(Calendario)")) {
			transferencias.edit().putString("Horario personalizado cargado", "No").commit();
			transferencias.edit().putString("Sección", "Calendario").commit();
			transferencias.edit().putString("Tarea", slist.get((int)(contadorcargar))).commit();
			transferencias.edit().putString("Horario personalizado cargado", "No").commit();
			transferencias.edit().putString("Mostrar sección", "Calendario").commit();
			_mostrarseccion();
			aviso.setTitle("Aplicaciones");
			aviso.setMessage("Se muestra sección calendario ".concat("".concat("".concat(""))));
			aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
		}
		else {
			
		}
		if (transferencias.getString("Tarea", "").equals("(Calendario)")) {
			transferencias.edit().putString("Mostrar sección", "Calendario").commit();
			_mostrarseccion();
			if (slist.get((int)(contadorcargar)).equals("(Día)")) {
				contadorcargar++;
				listadia.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
				if (slist.get((int)(contadorcargar)).equals(transferencias.getString("Día", ""))) {
					transferencias.edit().putString("Día seleccionado", transferencias.getString("Día", "")).commit();
				}
				else {
					
				}
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Mes)")) {
				contadorcargar++;
				listames.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
				if (slist.get((int)(contadorcargar)).equals(transferencias.getString("Mes", ""))) {
					transferencias.edit().putString("Mes seleccionado", transferencias.getString("Mes", "")).commit();
				}
				else {
					
				}
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Año)")) {
				contadorcargar++;
				listaano.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
				if (slist.get((int)(contadorcargar)).equals(transferencias.getString("Año", ""))) {
					transferencias.edit().putString("Año seleccionado", transferencias.getString("Año", "")).commit();
				}
				else {
					
				}
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Estado)")) {
				contadorcargar++;
				listaestado.add(slist.get((int)(contadorcargar)));
				if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
					if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
						if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
							transferencias.edit().putString("Estado", slist.get((int)(contadorcargar))).commit();
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Comentario)")) {
				contadorcargar++;
				comentarios.add(slist.get((int)(contadorcargar)));
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
						if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
							if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
								transferencias.edit().putString("Comentario", slist.get((int)(contadorcargar))).commit();
								if (transferencias.getString("Comentario", "").equals("(No)")) {
									comentario.setText("");
									comentario.setHint("Sin comentario");
								}
								else {
									comentario.setText(transferencias.getString("Comentario", ""));
								}
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Hora desde)")) {
				contadorcargar++;
				horadesde.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
				if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
					if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
						if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
							transferencias.edit().putString("Hora desde", slist.get((int)(contadorcargar))).commit();
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Hora hasta)")) {
				contadorcargar++;
				horahasta.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
				if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
					if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
						if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
							transferencias.edit().putString("Hora hasta", slist.get((int)(contadorcargar))).commit();
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Horario personalizado)")) {
				aviso.setTitle("Aplicaciones");
				aviso.setMessage("Horario personalizado cargado ".concat(transferencias.getString("Horario personalizado cargado", "").concat("".concat(""))));
				aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				if (transferencias.getString("Horario personalizado cargado", "").equals("No")) {
					transferencias.edit().putString("Horario personalizado cargado", "Si").commit();
					contadorcargar++;
					transferencias.edit().putString("Vueltas", slist.get((int)(contadorcargar))).commit();
					if (Double.parseDouble(transferencias.getString("Vueltas", "")) > 0) {
						for(int _repeat209 = 0; _repeat209 < (int)(Double.parseDouble(transferencias.getString("Vueltas", ""))); _repeat209++) {
							contadorcargar++;
							listanombrehorario.add(slist.get((int)(contadorcargar)));
							contadorcargar++;
							nombrehorariopersonalizado.add(slist.get((int)(contadorcargar)));
							contadorcargar++;
							horadesdepersonalizado.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
							contadorcargar++;
							horahastapersonalizado.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
						}
						personalizado1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listanombrehorario));
						((ArrayAdapter)personalizado1.getAdapter()).notifyDataSetChanged();
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Horario seleccionado)")) {
				contadorcargar++;
				horarioseleccionado.add(slist.get((int)(contadorcargar)));
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
						if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
							if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
								transferencias.edit().putString("Horario seleccionado", slist.get((int)(contadorcargar))).commit();
								if (transferencias.getString("Horario seleccionado", "").equals("No")) {
									
								}
								else {
									if (listanombrehorario.size() > 0) {
										_comprobarhorarioseleccionado();
									}
									else {
										
									}
								}
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Fin registro)")) {
				transferencias.edit().putString("Método", "1").commit();
				if (transferencias.getString("Método", "").equals("2")) {
					if (comentarios.size() < listadia.size()) {
						comentarios.add("(No)");
						if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
							if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
								if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
									comentario.setText("");
									comentario.setHint("Sin comentario");
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
					if (horarioseleccionado.size() < listadia.size()) {
						horarioseleccionado.add("(No)");
						if (transferencias.getString("Día seleccionado", "").equals(transferencias.getString("Día", ""))) {
							if (transferencias.getString("Mes seleccionado", "").equals(transferencias.getString("Mes", ""))) {
								if (transferencias.getString("Año seleccionado", "").equals(transferencias.getString("Año", ""))) {
									transferencias.edit().putString("Horario seleccionado", "(No)").commit();
									if (transferencias.getString("Horario seleccionado", "").equals("No")) {
										
									}
									else {
										if (listanombrehorario.size() > 0) {
											_comprobarhorarioseleccionado();
										}
										else {
											
										}
									}
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
			transferencias.edit().putString("Método", "1").commit();
			if (transferencias.getString("Método", "").equals("2")) {
				if (slist.get((int)(contadorcargar)).equals("(Aviso)")) {
					if (transferencias.getString("Aviso cargado", "").equals("No")) {
						transferencias.edit().putString("Aviso cargado", "Si").commit();
						contadorcargar++;
						transferencias.edit().putString("Aviso", slist.get((int)(contadorcargar))).commit();
						if (transferencias.getString("Aviso", "").equals("Si")) {
							avisoeventos.setChecked(true);
						}
						else {
							avisoeventos.setChecked(false);
						}
						if (slist.get((int)(contadorcargar)).equals("(Criterio aviso)")) {
							contadorcargar++;
							transferencias.edit().putString("Criterio de aviso", slist.get((int)(contadorcargar))).commit();
							if (transferencias.getString("Criterio aviso", "").equals("Próximo")) {
								proximoevento.setChecked(true);
								seguncriterio.setChecked(false);
							}
							else {
								seguncriterio.setChecked(true);
								proximoevento.setChecked(false);
							}
						}
						else {
							
						}
						if (slist.get((int)(contadorcargar)).equals("(Notificación)")) {
							contadorcargar++;
							transferencias.edit().putString("Notificación", slist.get((int)(contadorcargar))).commit();
							if (transferencias.getString("Notificación", "").equals("Si")) {
								notificacion.setChecked(true);
							}
							else {
								notificacion.setChecked(false);
							}
						}
						else {
							
						}
						if (slist.get((int)(contadorcargar)).equals("(Ventana)")) {
							contadorcargar++;
							transferencias.edit().putString("Ventana", slist.get((int)(contadorcargar))).commit();
							if (transferencias.getString("Ventana", "").equals("Si")) {
								checkbox17.setChecked(true);
							}
							else {
								checkbox17.setChecked(false);
							}
						}
						else {
							
						}
						if (slist.get((int)(contadorcargar)).equals("(Decir)")) {
							contadorcargar++;
							transferencias.edit().putString("Decir", slist.get((int)(contadorcargar))).commit();
							if (transferencias.getString("Decir", "").equals("Si")) {
								decir.setChecked(true);
							}
							else {
								decir.setChecked(false);
							}
						}
						else {
							
						}
						if (slist.get((int)(contadorcargar)).equals("(Datos)")) {
							contadorcargar++;
							contador = 0;
							transferencias.edit().putString("Criterios", slist.get((int)(contadorcargar))).commit();
							if (Double.parseDouble(transferencias.getString("Criterios", "")) > 0) {
								for(int _repeat418 = 0; _repeat418 < (int)(Double.parseDouble(transferencias.getString("Criterios", ""))); _repeat418++) {
									if (contadorcargar < slist.size()) {
										contadorcargar++;
										listacriterios.add(slist.get((int)(contadorcargar)));
										contadorcargar++;
										listanombrecriterios.add(slist.get((int)(contadorcargar)));
									}
									else {
										
									}
								}
								criterios.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listanombrecriterios));
								((ArrayAdapter)criterios.getAdapter()).notifyDataSetChanged();
								proximoevento.setChecked(true);
							}
							else {
								
							}
						}
						else {
							proximoevento.setChecked(false);
						}
						registro.add("(".concat(transferencias.getString("Fecha completa", "").concat(" - ".concat(transferencias.getString("Hora completa", "").concat(") Aviso: ".concat(transferencias.getString("Aviso", "").concat(". Criterio de aviso: ".concat(transferencias.getString("Criterio aviso", "").concat(". Notificación: ".concat(transferencias.getString("Notificación", "").concat(". Ventana: ".concat(transferencias.getString("Ventana", "").concat(". Número de criterios: ".concat(transferencias.getString("Criterios", "").concat("".concat(""))))))))))))))));
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
			if (slist.get((int)(contadorcargar)).equals("(Fin)")) {
				
			}
			else {
				
			}
			transferencias.edit().putString("Método", "1").commit();
			if (transferencias.getString("Método", "").equals("2")) {
				
			}
			else {
				
			}
		}
		else {
			
		}
		registro.add("(".concat(transferencias.getString("Fecha completa", "").concat(" - ".concat(transferencias.getString("Hora completa", "").concat(") Cargando dato: (".concat(String.valueOf((long)(contadorcargar)).concat("/".concat(String.valueOf((long)(slist.size())).concat(") ".concat(slist.get((int)(contadorcargar)).concat("".concat("".concat("")))))))))))));
		_actualizarregistro();
		transferencias.edit().putString("Vueltas", String.valueOf((long)(Double.parseDouble(transferencias.getString("Vueltas", "")) + 1))).commit();
		if (Double.parseDouble(transferencias.getString("Vueltas", "")) == 14) {
			transferencias.edit().putString("Vueltas", "0").commit();
		}
		else {
			
		}
	}
	
	
	public void _cargarfichero1() {
		if (slist.get((int)(contadorcargar)).equals("(Aviso)")) {
			if (transferencias.getString("Aviso cargado", "").equals("No")) {
				transferencias.edit().putString("Aviso cargado", "Si").commit();
				contadorcargar++;
				transferencias.edit().putString("Aviso", slist.get((int)(contadorcargar))).commit();
				if (transferencias.getString("Aviso", "").equals("Si")) {
					avisoeventos.setChecked(true);
					avisoeventos.setVisibility(View.VISIBLE);
				}
				else {
					avisoeventos.setChecked(false);
					avisoeventos.setVisibility(View.GONE);
				}
			}
			else {
				
			}
		}
		else {
			
		}
		if (slist.get((int)(contadorcargar)).equals("(Cuando mostrar aviso)")) {
			contadorcargar++;
			transferencias.edit().putString("Cuando mostrar aviso", slist.get((int)(contadorcargar))).commit();
			if (transferencias.getString("Cuando mostrar aviso", "").equals("Mostrar aplicación")) {
				mostraraplicacion.setChecked(true);
			}
			else {
				mostraraplicacion.setChecked(true);
			}
		}
		else {
			
		}
		if (slist.get((int)(contadorcargar)).equals("(Notificación)")) {
			contadorcargar++;
			transferencias.edit().putString("Notificación", slist.get((int)(contadorcargar))).commit();
			if (transferencias.getString("Notificación", "").equals("Si")) {
				notificacion.setChecked(true);
				cuadroformasaviso.setVisibility(View.VISIBLE);
			}
			else {
				notificacion.setChecked(false);
				cuadroformasaviso.setVisibility(View.GONE);
			}
		}
		else {
			
		}
		if (slist.get((int)(contadorcargar)).equals("(Ventana)")) {
			contadorcargar++;
			transferencias.edit().putString("Ventana", slist.get((int)(contadorcargar))).commit();
			if (transferencias.getString("Ventana", "").equals("Si")) {
				checkbox17.setChecked(true);
				cuadroformasaviso.setVisibility(View.VISIBLE);
			}
			else {
				checkbox17.setChecked(false);
				cuadroformasaviso.setVisibility(View.GONE);
			}
		}
		else {
			
		}
		if (slist.get((int)(contadorcargar)).equals("(Decir)")) {
			contadorcargar++;
			transferencias.edit().putString("Decir", slist.get((int)(contadorcargar))).commit();
			if (transferencias.getString("Decir", "").equals("Si")) {
				decir.setChecked(true);
				cuadroformasaviso.setVisibility(View.VISIBLE);
			}
			else {
				decir.setChecked(false);
				cuadroformasaviso.setVisibility(View.GONE);
			}
		}
		else {
			
		}
		if (slist.get((int)(contadorcargar)).equals("(Criterio evento)")) {
			contadorcargar++;
			transferencias.edit().putString("Criterio evento", slist.get((int)(contadorcargar))).commit();
			if (slist.get((int)(contadorcargar)).equals("Seleccionados")) {
				cuadroeventos.setVisibility(View.VISIBLE);
				eventosseleccionados.setChecked(true);
				textofechasaviso.setText("");
				contadorcargar++;
				if (slist.get((int)(contadorcargar)).equals("(Datos)")) {
					contadorcargar++;
					transferencias.edit().putString("Criterios", slist.get((int)(contadorcargar))).commit();
					if (Double.parseDouble(transferencias.getString("Criterios", "")) > 0) {
						textofechasaviso.setVisibility(View.VISIBLE);
						for(int _repeat1149 = 0; _repeat1149 < (int)(Double.parseDouble(transferencias.getString("Criterios", ""))); _repeat1149++) {
							contadorcargar++;
							avisodia.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
							contadorcargar++;
							avisomes.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
							contadorcargar++;
							avisoano.add(Double.valueOf(Double.parseDouble(slist.get((int)(contadorcargar)))));
							if (textofechasaviso.getText().toString().equals("")) {
								textofechasaviso.setText(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))));
							}
							else {
								textofechasaviso.setText(textofechasaviso.getText().toString().concat(", ".concat(transferencias.getString("Día seleccionado", "").concat("/".concat(transferencias.getString("Mes seleccionado", "").concat("/".concat(transferencias.getString("Año seleccionado", ""))))))));
							}
						}
					}
					else {
						textofechasaviso.setVisibility(View.GONE);
					}
				}
				else {
					
				}
			}
			else {
				eventosseleccionados.setChecked(false);
			}
		}
		else {
			
		}
		if (slist.get((int)(contadorcargar)).equals("(Evento próximo)")) {
			contadorcargar++;
			transferencias.edit().putString("Evento próximo", slist.get((int)(contadorcargar))).commit();
			if (transferencias.getString("Evento próximo", "").equals("Si")) {
				eventoproximo.setChecked(true);
				eventoproximo.setVisibility(View.VISIBLE);
			}
			else {
				eventoproximo.setChecked(false);
				eventoproximo.setVisibility(View.GONE);
			}
		}
		else {
			
		}
		if (slist.get((int)(contadorcargar)).equals("(Tipo criterio)")) {
			contadorcargar++;
			transferencias.edit().putString("Tipo criterio", slist.get((int)(contadorcargar))).commit();
			if (slist.get((int)(contadorcargar)).equals("(Datos)")) {
				contadorcargar++;
				transferencias.edit().putString("Criterios", slist.get((int)(contadorcargar))).commit();
				if (Double.parseDouble(transferencias.getString("Criterios", "")) > 0) {
					for(int _repeat2260 = 0; _repeat2260 < (int)(Double.parseDouble(transferencias.getString("Criterios", ""))); _repeat2260++) {
						contadorcargar++;
						listacriterios.add(slist.get((int)(contadorcargar)));
						contadorcargar++;
						listanombrecriterios.add(slist.get((int)(contadorcargar)));
					}
					criterios.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listanombrecriterios));
					((ArrayAdapter)criterios.getAdapter()).notifyDataSetChanged();
					proximoevento.setChecked(true);
				}
				else {
					contadorcargar++;
				}
			}
			else {
				proximoevento.setChecked(false);
			}
		}
		else {
			
		}
		if (slist.get((int)(contadorcargar)).equals("(Criterio aviso)")) {
			contadorcargar++;
			transferencias.edit().putString("Criterio aviso", slist.get((int)(contadorcargar))).commit();
			if (transferencias.getString("Criterio aviso", "").equals("Próximo")) {
				proximoevento.setChecked(true);
				seguncriterio.setChecked(false);
			}
			else {
				seguncriterio.setChecked(true);
				proximoevento.setChecked(false);
			}
		}
		else {
			
		}
		//Carga de avisos nuevos
		if (slist.get((int)(contadorcargar)).equals("(Avisos1)")) {
			contadorcargar++;
			//(Eventos)
			contadorcargar++;
			//número de avisos 
			transferencias.edit().putString("Eventos aviso", slist.get((int)(contadorcargar))).commit();
			if (Double.parseDouble(transferencias.getString("Eventos aviso", "")) > 0) {
				transferencias.edit().putString("Contador avisos evento", "0").commit();
				transferencias.edit().putString("Tipo de carga de datos", "Avisos evento").commit();
			}
			else {
				
			}
		}
		else {
			
		}
		if (transferencias.getString("Tipo de carga de datos", "").equals("Avisos evento")) {
			if (slist.get((int)(contadorcargar)).equals("(Momentos)")) {
				transferencias.edit().putString("Tipo de carga de datos", "Avisos momento").commit();
			}
			else {
				listaavisoseventospersonalizados.add(slist.get((int)(contadorcargar)));
			}
		}
		else {
			
		}
		if (transferencias.getString("Tipo de carga de datos", "").equals("Avisos momento")) {
			if (slist.get((int)(contadorcargar)).equals("(Formas)")) {
				transferencias.edit().putString("Tipo de carga de datos", "Avisos forma").commit();
			}
			else {
				listaavisosmomentospersonalizados.add(slist.get((int)(contadorcargar)));
			}
		}
		else {
			
		}
		if (transferencias.getString("Tipo de carga de datos", "").equals("Avisos forma")) {
			if (slist.get((int)(contadorcargar)).equals("(Filtros)")) {
				transferencias.edit().putString("Tipo de carga de datos", "Avisos filtros").commit();
			}
			else {
				listaavisosformaspersonalizadas.add(slist.get((int)(contadorcargar)));
			}
		}
		else {
			
		}
		if (transferencias.getString("Tipo de carga de datos", "").equals("Avisos filtro")) {
			if (slist.get((int)(contadorcargar)).equals("(Audio)")) {
				transferencias.edit().putString("Tipo de carga de datos", "Avisos audio").commit();
			}
			else {
				listaavisosfiltrospersonalizados.add(slist.get((int)(contadorcargar)));
			}
		}
		else {
			
		}
		if (transferencias.getString("Tipo de carga de datos", "").equals("Avisos audio")) {
			if (slist.get((int)(contadorcargar)).equals("(Fin de avisos)")) {
				transferencias.edit().putString("Tipo de carga de datos", "No").commit();
			}
			else {
				listaavisosaudiopersonalizados.add(slist.get((int)(contadorcargar)));
			}
		}
		else {
			
		}
		//fin de carga de avisos nuevos
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			if (Double.parseDouble(transferencias.getString("Eventos aviso", "")) > 0) {
				transferencias.edit().putString("Contador cargar", "0").commit();
				transferencias.edit().putString("Fase", "1").commit();
				contadorcargar++;
				//Cargar en cada matriz de avisos el mismo número de elementos que se eventos 
				for(int _repeat2359 = 0; _repeat2359 < (int)(5); _repeat2359++) {
					for(int _repeat2340 = 0; _repeat2340 < (int)(Double.parseDouble(transferencias.getString("Eventos aviso", ""))); _repeat2340++) {
						if (transferencias.getString("Fase", "").equals("1")) {
							listaavisoseventospersonalizados.add(slist.get((int)(contadorcargar)));
							contadorcargar++;
						}
						else {
							
						}
						if (transferencias.getString("Fase", "").equals("2")) {
							listaavisosmomentospersonalizados.add(slist.get((int)(contadorcargar)));
							contadorcargar++;
						}
						else {
							
						}
						if (transferencias.getString("Fase", "").equals("3")) {
							listaavisosformaspersonalizadas.add(slist.get((int)(contadorcargar)));
							contadorcargar++;
						}
						else {
							
						}
						if (transferencias.getString("Fase", "").equals("4")) {
							listaavisosfiltrospersonalizados.add(slist.get((int)(contadorcargar)));
							contadorcargar++;
						}
						else {
							
						}
						if (transferencias.getString("Fase", "").equals("5")) {
							listaavisosaudiopersonalizados.add(slist.get((int)(contadorcargar)));
							contadorcargar++;
						}
						else {
							
						}
					}
					if (slist.get((int)(contadorcargar)).equals("(Momentos)")) {
						transferencias.edit().putString("Fase", String.valueOf((long)(Double.parseDouble(transferencias.getString("Fase", "")) + 1))).commit();
						contadorcargar++;
					}
					else {
						
					}
					if (slist.get((int)(contadorcargar)).equals("(Formas)")) {
						transferencias.edit().putString("Fase", String.valueOf((long)(Double.parseDouble(transferencias.getString("Fase", "")) + 1))).commit();
						contadorcargar++;
					}
					else {
						
					}
					if (slist.get((int)(contadorcargar)).equals("(Filtros)")) {
						transferencias.edit().putString("Fase", String.valueOf((long)(Double.parseDouble(transferencias.getString("Fase", "")) + 1))).commit();
						contadorcargar++;
					}
					else {
						
					}
					if (slist.get((int)(contadorcargar)).equals("(Audios)")) {
						transferencias.edit().putString("Fase", String.valueOf((long)(Double.parseDouble(transferencias.getString("Fase", "")) + 1))).commit();
						contadorcargar++;
					}
					else {
						
					}
				}
			}
			else {
				
			}
			listaavisoeventos.add("Seleccione tipo de evento/s");
			listaavisoeventos.add("Todos");
			listaavisoeventos.add("Siguiente");
			listaavisoeventos.add("Día siguiente");
			listaavisoeventos.add("Seleccionados");
			listaavisoeventos.add("Coinciden con texto personalizado");
			listaavisomomento.add("Seleccione momento/s de aviso");
			listaavisomomento.add("Al inicio");
			listaavisomomento.add("Al mostrar aplicación");
			listaavisomomento.add("A la hora de inicio del evento");
			listaavisomomento.add("A la hora de fin del evento");
			listaavisoformas.add("Seleccione forma/s de aviso");
			listaavisoformas.add("Notificación completa");
			listaavisoformas.add("Ventana emergente");
			listaavisosfiltros.add("Seleccione filtro/s de aviso");
			listaavisosfiltros.add("Solo días de la semana");
			listaavisosfiltros.add("Excepto días de la semana");
			//avisos nuevo. 18/7/24
			transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Avisos1)\n".concat("(Eventos)\n".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat("\n"))))).commit();
			transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Número de eventos: ".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat("")))))).commit();
			_actualizarregistroreciente();
			if (listaavisoseventospersonalizados.size() > 0) {
				//no es necesario leer el número de eventos
				transferencias.edit().putString("Fase", "1").commit();
				for(int _repeat2697 = 0; _repeat2697 < (int)(5); _repeat2697++) {
					if (transferencias.getString("Fase", "").equals("2")) {
						transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Momentos)".concat("\n"))).commit();
					}
					else {
						
					}
					if (transferencias.getString("Fase", "").equals("3")) {
						transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Formas)".concat("\n"))).commit();
					}
					else {
						
					}
					if (transferencias.getString("Fase", "").equals("4")) {
						transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Filtros)".concat("\n"))).commit();
					}
					else {
						
					}
					if (transferencias.getString("Fase", "").equals("5")) {
						transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Audios)".concat("\n"))).commit();
					}
					else {
						
					}
					contador1 = 0;
					for(int _repeat2727 = 0; _repeat2727 < (int)(listaavisoseventospersonalizados.size()); _repeat2727++) {
						if (contador1 < listaavisoseventospersonalizados.size()) {
							if (contador1 < listaavisosmomentospersonalizados.size()) {
								if (contador1 < listaavisosformaspersonalizadas.size()) {
									if (contador1 < listaavisosfiltrospersonalizados.size()) {
										if (transferencias.getString("Fase", "").equals("1")) {
											transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisoseventospersonalizados.get((int)(contador1)).concat("\n"))).commit();
										}
										else {
											
										}
										if (transferencias.getString("Fase", "").equals("2")) {
											transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosmomentospersonalizados.get((int)(contador1)).concat("\n"))).commit();
										}
										else {
											
										}
										if (transferencias.getString("Fase", "").equals("3")) {
											transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosmomentospersonalizados.get((int)(contador1)).concat("\n"))).commit();
										}
										else {
											
										}
										if (transferencias.getString("Fase", "").equals("4")) {
											transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosfiltrospersonalizados.get((int)(contador1)).concat("\n"))).commit();
										}
										else {
											
										}
										if (transferencias.getString("Fase", "").equals("5")) {
											transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosaudiopersonalizados.get((int)(contador1)).concat("\n"))).commit();
										}
										else {
											
										}
									}
									else {
										
									}
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
						contador1++;
					}
					transferencias.edit().putString("Fase", String.valueOf((long)(Double.parseDouble(transferencias.getString("Fase", "")) + 1))).commit();
				}
			}
			else {
				
			}
			//fin 
			transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Fin de avisos)".concat("\n"))).commit();
			transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Fin)".concat("\n"))).commit();
			transferencias.edit().putString("Método", "1").commit();
			if (transferencias.getString("Método", "").equals("2")) {
				//avisos nuevo. 18/7/24
				transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Avisos1)\n".concat("(Eventos)\n".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat("\n"))))).commit();
				transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat(". Número de eventos: ".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat("")))))).commit();
				_actualizarregistroreciente();
				if (listaavisoseventospersonalizados.size() > 0) {
					//no es necesario leer el número de eventos
					transferencias.edit().putString("Fase", "1").commit();
					for(int _repeat2849 = 0; _repeat2849 < (int)(5); _repeat2849++) {
						if (transferencias.getString("Fase", "").equals("2")) {
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Momentos)".concat("\n"))).commit();
						}
						else {
							
						}
						if (transferencias.getString("Fase", "").equals("3")) {
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Formas)".concat("\n"))).commit();
						}
						else {
							
						}
						if (transferencias.getString("Fase", "").equals("4")) {
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Filtros)".concat("\n"))).commit();
						}
						else {
							
						}
						if (transferencias.getString("Fase", "").equals("5")) {
							transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Audios)".concat("\n"))).commit();
						}
						else {
							
						}
						contador1 = 0;
						for(int _repeat2879 = 0; _repeat2879 < (int)(listaavisoseventospersonalizados.size()); _repeat2879++) {
							if (contador1 < listaavisoseventospersonalizados.size()) {
								if (contador1 < listaavisosmomentospersonalizados.size()) {
									if (contador1 < listaavisosformaspersonalizadas.size()) {
										if (contador1 < listaavisosfiltrospersonalizados.size()) {
											if (transferencias.getString("Fase", "").equals("1")) {
												transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisoseventospersonalizados.get((int)(contador1)).concat("\n"))).commit();
											}
											else {
												
											}
											if (transferencias.getString("Fase", "").equals("2")) {
												transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosmomentospersonalizados.get((int)(contador1)).concat("\n"))).commit();
											}
											else {
												
											}
											if (transferencias.getString("Fase", "").equals("3")) {
												transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosmomentospersonalizados.get((int)(contador1)).concat("\n"))).commit();
											}
											else {
												
											}
											if (transferencias.getString("Fase", "").equals("4")) {
												transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosfiltrospersonalizados.get((int)(contador1)).concat("\n"))).commit();
											}
											else {
												
											}
											if (transferencias.getString("Fase", "").equals("5")) {
												transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat(listaavisosaudiopersonalizados.get((int)(contador1)).concat("\n"))).commit();
											}
											else {
												
											}
										}
										else {
											
										}
									}
									else {
										
									}
								}
								else {
									
								}
							}
							else {
								
							}
							contador1++;
						}
						transferencias.edit().putString("Fase", String.valueOf((long)(Double.parseDouble(transferencias.getString("Fase", "")) + 1))).commit();
					}
				}
				else {
					
				}
				//fin 
				transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Fin de avisos)".concat("\n"))).commit();
				transferencias.edit().putString("Dato", transferencias.getString("Dato", "").concat("(Fin)".concat("\n"))).commit();
			}
			else {
				
			}
			//fin de almacenamiento de datos en variables 
		}
		else {
			
		}
		
		if (slist.get((int)(contadorcargar)).equals("(Fin)")) {
			
		}
		else {
			
		}
		transferencias.edit().putString("Rutina", "Fin").commit();
	}
	
	
	public void _cargarpantalla1() {
		transferencias.edit().putString("Editando", "No").commit();
		transferencias.edit().putString("Cambiado1", "No").commit();
		transferencias.edit().putString("Nota", "No").commit();
		transferencias.edit().putString("Enviado", "Si").commit();
		transferencias.edit().putString("Primera línea como nombre", "No").commit();
		transferencias.edit().putString("Ruta notas temporales", notatemporal).commit();
		transferencias.edit().putString("Cambiado", "No").commit();
		transferencias.edit().putString("Guardar en segundo plano", "No").commit();
		transferencias.edit().putString("Último texto", texto.getText().toString()).commit();
		transferencias.edit().putString("Buscando", "No").commit();
		transferencias.edit().putString("Última búsqueda", "").commit();
		transferencias.edit().putString("Primera búsqueda", "Si").commit();
		transferencias.edit().putString("Ruta convertir fichero", notas).commit();
		transferencias.edit().putString("Cargando", "No").commit();
		transferencias.edit().putString("Reiniciado", "No").commit();
		transferencias.edit().putString("Mostrar progreso a partir de líneas", "5000").commit();
		transferencias.edit().putString("Sección", "Principal").commit();
		transferencias.edit().putString("Importar", "No").commit();
		transferencias.edit().putString("Ruta", ruta).commit();
		transferencias.edit().putString("Método", "1").commit();
		transferencias.edit().putString("Cargando", "No").commit();
		transferencias.edit().putString("Recargar", "No").commit();
		transferencias.edit().putString("Texto seleccionado", "").commit();
		transferencias.edit().putString("Última búsqueda", "").commit();
		transferencias.edit().putString("Marcar", "No").commit();
		transferencias.edit().putString("Nombre nota", "(No)").commit();
		transferencias.edit().putString("Encriptado", "(No)").commit();
		transferencias.edit().putString("Encriptar", "No").commit();
		transferencias.edit().putString("Guardar configuración automáticamente", "No").commit();
		transferencias.edit().putString("Configuración", "").commit();
		transferencias.edit().putString("Cargar automáticamente", "No").commit();
		transferencias.edit().putString("Configuración cambiada", "No").commit();
		transferencias.edit().putString("Estado", "No").commit();
		transferencias.edit().putString("Hora desde", "0").commit();
		transferencias.edit().putString("Hora hasta", "0").commit();
		transferencias.edit().putString("Último día", "0").commit();
		transferencias.edit().putString("Último mes", "0").commit();
		transferencias.edit().putString("Último año", "0").commit();
		transferencias.edit().putString("Encontrado", "No").commit();
		transferencias.edit().putString("Enero", "31").commit();
		transferencias.edit().putString("Febrero", "28").commit();
		transferencias.edit().putString("Marzo", "31").commit();
		transferencias.edit().putString("Abril", "30").commit();
		transferencias.edit().putString("Mayo", "31").commit();
		transferencias.edit().putString("Junio", "30").commit();
		transferencias.edit().putString("Julio", "31").commit();
		transferencias.edit().putString("Agosto", "31").commit();
		transferencias.edit().putString("Septiembre", "30").commit();
		transferencias.edit().putString("Octubre", "31").commit();
		transferencias.edit().putString("Noviembre", "30").commit();
		transferencias.edit().putString("Diciembre", "31").commit();
		transferencias.edit().putString("Días totales", String.valueOf((long)(transferencias.getString("Enero", "").length() + (transferencias.getString("Febrero", "").length() + (transferencias.getString("Marzo", "").length() + (transferencias.getString("Abril", "").length() + (transferencias.getString("Mayo", "").length() + (transferencias.getString("Junio", "").length() + (transferencias.getString("Julio", "").length() + (transferencias.getString("Agosto", "").length() + (transferencias.getString("Septiembre", "").length() + (transferencias.getString("Octubre", "").length() + (transferencias.getString("Noviembre", "").length() + transferencias.getString("Diciembre", "").length()))))))))))))).commit();
		_fechayhora();
		transferencias.edit().putString("Día seleccionado", transferencias.getString("Día", "")).commit();
		transferencias.edit().putString("Mes seleccionado", transferencias.getString("Mes", "")).commit();
		transferencias.edit().putString("Año seleccionado", transferencias.getString("Año", "")).commit();
		transferencias.edit().putString("Sustituir", "No").commit();
		transferencias.edit().putString("Horario seleccionado", "No").commit();
		transferencias.edit().putString("Comentario", "(No)").commit();
		transferencias.edit().putString("Filtro", "No").commit();
		transferencias.edit().putString("Solo días de la semana", "No").commit();
		transferencias.edit().putString("Fecha", "Comprobar").commit();
		transferencias.edit().putString("Criterio día de la semana", "No").commit();
		transferencias.edit().putString("Día de la semana encontrado", "No").commit();
		transferencias.edit().putString("Criterio lunes", "No").commit();
		transferencias.edit().putString("Criterio martes", "No").commit();
		transferencias.edit().putString("Criterio miércoles", "No").commit();
		transferencias.edit().putString("Criterio jueves", "No").commit();
		transferencias.edit().putString("Criterio viernes", "No").commit();
		transferencias.edit().putString("Criterio sábado", "No").commit();
		transferencias.edit().putString("Criterio domingo", "No").commit();
		transferencias.edit().putString("Día excepcional", "No").commit();
		transferencias.edit().putString("Criterios de búsqueda", "No").commit();
		transferencias.edit().putString("Aviso", "No").commit();
		transferencias.edit().putString("Criterio aviso", "No").commit();
		transferencias.edit().putString("Notificación", "No").commit();
		transferencias.edit().putString("Ventana", "No").commit();
		transferencias.edit().putString("Aviso cargado", "No").commit();
		transferencias.edit().putString("Decir", "No").commit();
		transferencias.edit().putString("Tipo evento", "No").commit();
		transferencias.edit().putString("Cuando mostrar aviso", "No").commit();
		transferencias.edit().putString("Evento próximo", "No").commit();
		transferencias.edit().putString("Filtro comentario", "No").commit();
		transferencias.edit().putString("Opción", "No").commit();
		transferencias.edit().putString("Aviso eventos", "No").commit();
		transferencias.edit().putString("Nombre aviso", "(No)").commit();
		transferencias.edit().putString("Aviso guardado", "Si").commit();
		_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) - barraherramientas.getHeight(), principal1);
		_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) - barraherramientas.getHeight(), cuadroeditar);
		altoeditar = SketchwareUtil.getDisplayHeightPixels(getApplicationContext());
		ancho = SketchwareUtil.getDisplayWidthPixels(getApplicationContext());
		contadorizquierda = 10;
		contadorarriba = 10;
		if (transferencias.getString("Método", "").equals("2")) {
			alto1 = SketchwareUtil.getDisplayHeightPixels(getApplicationContext());
			ancho1 = SketchwareUtil.getDisplayWidthPixels(getApplicationContext());
			_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), SketchwareUtil.getDisplayHeightPixels(getApplicationContext()), cuadrosecciones);
			_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), SketchwareUtil.getDisplayHeightPixels(getApplicationContext()), principal1);
			anchoeditar = SketchwareUtil.getDisplayHeightPixels(getApplicationContext());
			_establecerdimensiones(anchoeditar, altoeditar, cuadroeditar);
			_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), SketchwareUtil.getDisplayHeightPixels(getApplicationContext()), deslizartexto);
			transferencias.edit().putString("Método", "1").commit();
			if (transferencias.getString("Método", "").equals("2")) {
				//método 3. //Cambiar tamaño de linear y teóricamente cualquier herramienta. Crear en un Módulo. Nombre. Variable numérica etiqueta : ancho. Añadir. Ancho. Añadir. Etiqueta alto. Añadir. Nombre variable alto. Añadir. Variable vista. Nombre variable vista. Añadir.
				//restar 100 para ser preciso
				cuadrosecciones.setLayoutParams(new
				LinearLayout.LayoutParams((int)ancho1,(int)alto1));
				
				
				
				
			}
			else {
				
			}
			transferencias.edit().putString("Método", "1").commit();
			if (transferencias.getString("Método", "").equals("2")) {
				_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), cuadrosecciones.getHeight(), cuadrosecciones);
				_establecerdimensiones(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()) - 100, horizontal.getHeight(), horizontal);
			}
			else {
				
			}
		}
		else {
			
		}
		//cargar datos
		if (FileUtil.isExistFile(transferencias.getString("Ruta", "").concat("/datos.txt"))) {
			str = FileUtil.readFile(transferencias.getString("Ruta", "").concat("/datos.txt"));
			String [] arr = str.split("\n");
			for (int i = 0; i < arr.length; i++) {
				slist.add(arr[i]);
			}
			contador = 0;
			for(int _repeat202 = 0; _repeat202 < (int)(slist.size()); _repeat202++) {
				if (contador < slist.size()) {
					if (slist.get((int)(contador)).equals("Día")) {
						contador++;
					}
					else {
						
					}
					contador++;
				}
				else {
					
				}
			}
		}
		else {
			
		}
		//fin de carga
		//comprobar si el fichero de configuración establece carga automática 
		if (FileUtil.isExistFile(transferencias.getString("Ruta", "").concat("/configuración.txt"))) {
			slist.clear();
			str = FileUtil.readFile(transferencias.getString("Ruta", "").concat("/configuración.txt"));
			String [] arr = str.split("\n");
			for (int i = 0; i < arr.length; i++) {
				slist.add(arr[i]);
			}
			contador = 0;
			for(int _repeat227 = 0; _repeat227 < (int)(slist.size()); _repeat227++) {
				if (contador < slist.size()) {
					if (slist.get((int)(contador)).equals("(Cargar automáticamente)")) {
						contador++;
						if (slist.get((int)(contador)).equals("Si")) {
							cargaautomatica.setChecked(true);
							_cargarconfiguracion();
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
				contador++;
			}
		}
		else {
			textocargar.setText("Cargado. No se encuentra fichero de configuración (".concat(transferencias.getString("Ruta", "").concat("/configuración.txt) ".concat(""))));
			registro.add("Cargado. No se encuentra fichero de configuración (".concat(transferencias.getString("Ruta", "").concat("/configuración.txt) ".concat(""))));
		}
		_actualizarlistanotas();
		transferencias.edit().putString("Mostrar opción", "Organizar").commit();
		_mostraropcion();
		transferencias.edit().putString("Mostrar sección", "Ficheros").commit();
		_mostrarseccion();
		setTitle("Calculador general");
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			_cargarconfiguracion();
		}
		else {
			
		}
		registro.add("".concat("".concat("".concat(". Fin de módulo carga de pantalla. ".concat("".concat(""))))));
		_actualizarregistro();
		_cargarlistas();
	}
	
	
	public void _actualizarinformeavisos() {
		transferencias.edit().putString("Contador1", "0").commit();
		if (avisoseventostemporal.size() > 0) {
			if (avisosmomentostemporal.size() > 0) {
				if (avisosformastemporal.size() > 0) {
					if (avisosfiltrotemporal.size() > 0) {
						if (avisoaudiotemporal.size() > 0) {
							if (separadoravisos.getText().toString().equals("No")) {
								separadoravisos.setText("Criterios nuevos del aviso\n\n".concat("".concat("")));
							}
							else {
								separadoravisos.setText("Criterios nuevos del aviso. Eventos: ".concat(String.valueOf((long)(avisoseventostemporal.size())).concat("".concat("".concat("\n\n".concat("".concat("".concat(""))))))));
							}
							for(int _repeat10 = 0; _repeat10 < (int)(avisoseventostemporal.size()); _repeat10++) {
								if (Double.parseDouble(transferencias.getString("Contador1", "")) < avisoseventostemporal.size()) {
									separadoravisos.setText(separadoravisos.getText().toString().concat("Evento (".concat(String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1)).concat("/".concat(String.valueOf((long)(avisoseventostemporal.size())).concat(") \n".concat(avisoseventostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". \nMomento: ".concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". \nForma: ".concat(avisosformastemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". \nFiltro: ".concat(avisosfiltrotemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat("\n\n".concat("")))))))))))))));
									
								}
								else {
									
								}
								transferencias.edit().putString("Contador1", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1))).commit();
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
		}
		else {
			
		}
		transferencias.edit().putString("Contador1", "0").commit();
		if (listaavisoseventospersonalizados.size() > 0) {
			if (listaavisosmomentospersonalizados.size() > 0) {
				if (listaavisosformaspersonalizadas.size() > 0) {
					if (listaavisosfiltrospersonalizados.size() > 0) {
						if (listaavisosaudiopersonalizados.size() > 0) {
							if (separadoravisos.getText().toString().equals("No")) {
								separadoravisos.setText("Últimos criterios del aviso\n\n".concat("".concat("")));
							}
							else {
								separadoravisos.setText(separadoravisos.getText().toString().concat("\n\nÚltimos criterios del aviso. Eventos: ".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat("".concat("".concat("\n\n".concat("".concat("".concat("")))))))));
								
							}
							for(int _repeat228 = 0; _repeat228 < (int)(listaavisoseventospersonalizados.size()); _repeat228++) {
								if (Double.parseDouble(transferencias.getString("Contador1", "")) < listaavisoseventospersonalizados.size()) {
									separadoravisos.setText(separadoravisos.getText().toString().concat("Evento (".concat(String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1)).concat("/".concat(String.valueOf((long)(listaavisoseventospersonalizados.size())).concat(") \n".concat(listaavisoseventospersonalizados.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". \nMomento: ".concat(listaavisosmomentospersonalizados.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". \nForma: ".concat(listaavisosformaspersonalizadas.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". \nFiltro: ".concat(listaavisosfiltrospersonalizados.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat("\nAudio: ".concat(listaavisosaudiopersonalizados.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat("\n\n".concat("")))))))))))))))));
									
								}
								else {
									
								}
								transferencias.edit().putString("Contador1", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1))).commit();
							}
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
		}
		else {
			
		}
	}
	
	
	public void _comprobaravisosrepetidos() {
		transferencias.edit().putString("Aviso repetido", "No").commit();
		transferencias.edit().putString("Contador", "0").commit();
		transferencias.edit().putString("Avisos repetidos", "0").commit();
		if (avisoseventostemporal.size() > 0) {
			for(int _repeat10 = 0; _repeat10 < (int)(avisoseventostemporal.size()); _repeat10++) {
				if (Double.parseDouble(transferencias.getString("Contador", "")) < avisoseventostemporal.size()) {
					if (Double.parseDouble(transferencias.getString("Contador", "")) < avisosmomentostemporal.size()) {
						if (Double.parseDouble(transferencias.getString("Contador", "")) < avisosformastemporal.size()) {
							if (Double.parseDouble(transferencias.getString("Contador", "")) < avisosfiltrotemporal.size()) {
								transferencias.edit().putString("Contador1", "0").commit();
								for(int _repeat47 = 0; _repeat47 < (int)(avisoseventostemporal.size()); _repeat47++) {
									if (Double.parseDouble(transferencias.getString("Contador1", "")) < avisoseventostemporal.size()) {
										if (Double.parseDouble(transferencias.getString("Contador1", "")) < avisosmomentostemporal.size()) {
											if (Double.parseDouble(transferencias.getString("Contador1", "")) < avisosformastemporal.size()) {
												if (Double.parseDouble(transferencias.getString("Contador1", "")) < avisosfiltrotemporal.size()) {
													if (avisoseventostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))).concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))).concat(avisosformastemporal.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))).concat(avisosfiltrotemporal.get((int)(Double.parseDouble(transferencias.getString("Contador", ""))))))).equals(avisoseventostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(avisosformastemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(avisosfiltrotemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", ""))))))))) {
														transferencias.edit().putString("Aviso repetidos", String.valueOf((long)(Double.parseDouble(transferencias.getString("Avisos repetidos", "")) + 1))).commit();
														if (transferencias.getString("Aviso repetido", "").equals("No")) {
															transferencias.edit().putString("Aviso repetido", "(".concat(String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1)).concat("/".concat(String.valueOf((long)(avisoseventostemporal.size())).concat("). Evento: ".concat(avisoseventostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". Momento: ".concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". Forma: ".concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat("\n".concat("".concat(""))))))))))))).commit();
														}
														else {
															transferencias.edit().putString("Aviso repetido", transferencias.getString("Aviso repetido", "").concat("(".concat(String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1)).concat("/".concat(String.valueOf((long)(avisoseventostemporal.size())).concat("). Evento: ".concat(avisoseventostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". Momento: ".concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". Forma: ".concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". Filtro: ".concat(avisosfiltrotemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat("\n".concat("".concat("")))))))))))))))).commit();
														}
													}
													else {
														
													}
													transferencias.edit().putString("Contador1", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1))).commit();
													if (Double.parseDouble(transferencias.getString("Contador1", "")) == Double.parseDouble(transferencias.getString("Contador", ""))) {
														transferencias.edit().putString("Contador1", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1))).commit();
													}
													else {
														
													}
													if (Double.parseDouble(transferencias.getString("Contador1", "")) == avisoseventostemporal.size()) {
														
													}
													else {
														
													}
													avisoseventostemporal.remove((int)(Double.parseDouble(transferencias.getString("Aviso repetidos", ""))));
													avisosmomentostemporal.remove((int)(Double.parseDouble(transferencias.getString("Aviso repetidos", ""))));
													avisosformastemporal.remove((int)(Double.parseDouble(transferencias.getString("Aviso repetidos", ""))));
													avisosfiltrotemporal.remove((int)(Double.parseDouble(transferencias.getString("Aviso repetidos", ""))));
												}
												else {
													
												}
											}
											else {
												
											}
										}
										else {
											
										}
									}
									else {
										
									}
								}
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
					transferencias.edit().putString("Contador", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador", "")) + 1))).commit();
					if (Double.parseDouble(transferencias.getString("Contador", "")) == avisoseventostemporal.size()) {
						
					}
					else {
						
					}
				}
				else {
					
				}
			}
		}
		else {
			
		}
		if (transferencias.getString("Aviso repetido", "").equals("No")) {
			
		}
		else {
			aviso.setTitle("Criterio/s repetido/s: ".concat(transferencias.getString("Aviso repetidos", "").concat("".concat("".concat("".concat(""))))));
			aviso.setMessage(transferencias.getString("Aviso repetido", ""));
			aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			aviso.create().show();
			_actualizarinformeavisos();
		}
	}
	
	
	public void _cargarvariables() {
		//textos de calendario
		textobusqueda.setText("No hay datos. ");
		//fin
		transferencias.edit().putString("Aviso evento", "Seleccione tipo de evento/s").commit();
		transferencias.edit().putString("Aviso momento", "Seleccione momento/s de aviso").commit();
		transferencias.edit().putString("Aviso forma", "Seleccione forma/s de aviso").commit();
		transferencias.edit().putString("Aviso filtro", "Seleccione filtro/s de aviso").commit();
		transferencias.edit().putString("Avisos 1", "(No)").commit();
		transferencias.edit().putString("Aviso evento correcto", "No").commit();
		transferencias.edit().putString("Aviso momento correcto", "No").commit();
		transferencias.edit().putString("Aviso forma correcto", "No").commit();
		transferencias.edit().putString("Aviso filtro correcto", "No").commit();
		transferencias.edit().putString("Último criterio de aviso", "No").commit();
		transferencias.edit().putString("Último criterio", "No").commit();
		transferencias.edit().putString("Estado evento", "Terminado").commit();
		transferencias.edit().putString("Estado momento", "Terminado").commit();
		transferencias.edit().putString("Estado forma", "Terminado").commit();
		transferencias.edit().putString("Estado filtro", "Terminado").commit();
		transferencias.edit().putString("Carga rápida a partir de datos", "0").commit();
		transferencias.edit().putString("Rutina", "Fin").commit();
		transferencias.edit().putString("Posición carga rápida de datos", "0").commit();
		transferencias.edit().putString("Aviso audio", "Ninguno").commit();
		transferencias.edit().putString("Datos", "").commit();
		transferencias.edit().putString("Dato", "No hay datos\n (Fin)").commit();
		transferencias.edit().putString("Cargando configuración", "No").commit();
		transferencias.edit().putString("Eventos aviso", "0").commit();
		transferencias.edit().putString("Tipo de carga de datos", "No").commit();
		transferencias.edit().putString("Cargar registro automáticamente", "No").commit();
		transferencias.edit().putString("Guardar registro automáticamente", "No").commit();
		transferencias.edit().putString("Cargar configuración automáticamente", "No").commit();
		transferencias.edit().putString("Guardar configuración automáticamente", "No").commit();
		transferencias.edit().putString("Guardando registro", "No").commit();
		transferencias.edit().putString("Registrar en archivo", "No").commit();
		_cargarpantalla();
		//Comprobar si el archivo de configuración requiere cargarlo automáticamente 
		if (FileUtil.isExistFile(transferencias.getString("Ruta configuración", ""))) {
			slist.clear();
			str = FileUtil.readFile(transferencias.getString("Ruta configuración", ""));
			String [] arr = str.split("\n");
			for (int i = 0; i < arr.length; i++) {
				slist.add(arr[i]);
			}
			if (slist.size() > 0) {
				transferencias.edit().putString("Contador", "0").commit();
				for(int _repeat42 = 0; _repeat42 < (int)(slist.size()); _repeat42++) {
					if (Double.parseDouble(transferencias.getString("Contador", "")) < slist.size()) {
						if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))).equals("Cargar configuración automáticamente")) {
							transferencias.edit().putString("Contador", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador", "")) + 1))).commit();
							if (slist.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))).equals("Si")) {
								transferencias.edit().putString("Cargando configuración", "Si").commit();
								_cargarconfiguracion();
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
					transferencias.edit().putString("Contador", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador", "")) + 1))).commit();
				}
			}
			else {
				
			}
		}
		else {
			
		}
	}
	
	
	public void _actualizarregistroreciente() {
		if (registro.size() > 0) {
			registro.set((int)0, transferencias.getString("Registro", ""));
		}
		else {
			registro.add(transferencias.getString("Registro", ""));
		}
		/*
import android.content.SharedPreferences;
import java.io.FileOutputStream;
import java.io.IOException;

// Obtener las preferencias compartidas
SharedPreferences preferencias = getSharedPreferences("transferencias", MODE_PRIVATE);

// Verificar que la ruta del archivo no esté vacía
if (!preferencias.getString("ruta archivo", "").isEmpty()) {
    try {
        // Añadir los datos al final del archivo
        FileOutputStream fos = new FileOutputStream(preferencias.getString("ruta archivo", ""), true); // 'true' para modo append
        fos.write((preferencias.getString("datos", "") + "\n").getBytes());
        fos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
} else {
    // Manejar el caso en que la ruta esté vacía
    textview3.setText("La ruta del archivo no está especificada en las preferencias.");
}

*/
		if (transferencias.getString("Guardando registro", "").equals("No")) {
			transferencias.edit().putString("Guardando registro", "Si").commit();
			if (transferencias.getString("Guardar registro automáticamente", "").equals("Si") || transferencias.getString("Registrar en archivo", "").equals("Si")) {
				if (FileUtil.isFile(transferencias.getString("Ruta registros", "").concat("/registro general.txt"))) {
					transferencias.edit().putString("Datos", transferencias.getString("Registro", "")).commit();
					// añadir dato a archivo de registro m. Verificar que la ruta del archivo no esté vacía
					//if (!transferencias.getString("Ruta archivo", "").isEmpty()) {
					    try {
						        // Añadir los datos al final del archivo
						        FileOutputStream fos = new FileOutputStream(transferencias.getString("Ruta registros", "")+"/registro general.txt", true); // 'true' para modo append
						        fos.write((transferencias.getString("Datos", "") + "\n").getBytes());
						        fos.close();
						    } catch (IOException e) {
						        e.printStackTrace();
						    }
					/*} else {
    // Manejar el caso en que la ruta esté vacía
    textview3.setText("La ruta del archivo no está especificada en las preferencias.");
}
*/
				}
				else {
					FileUtil.writeFile(transferencias.getString("Ruta registros", "").concat("/registro general.txt"), transferencias.getString("Datos", ""));
				}
			}
			else {
				
			}
			listviewregistro.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, registro));
			((BaseAdapter)listviewregistro.getAdapter()).notifyDataSetChanged();
			transferencias.edit().putString("Guardando registro", "No").commit();
		}
		else {
			
		}
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			
		}
		else {
			
		}
		transferencias.edit().putString("Registro", "").commit();
	}
	
	
	public void _cargarlistas() {
		listaavisoeventos.clear();
		listaavisoeventos.add("Seleccione tipo de evento/s");
		listaavisoeventos.add("Todos");
		listaavisoeventos.add("Siguiente");
		listaavisoeventos.add("Día siguiente");
		listaavisoeventos.add("Seleccionados");
		listaavisoeventos.add("Coinciden con texto personalizado");
		avisosfiltrotemporal.add("No");
		avisoaudiotemporal.add("No");
		spinneravisoeventos.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listaavisoeventos));
		((ArrayAdapter)spinneravisoeventos.getAdapter()).notifyDataSetChanged();
		listaavisomomento.clear();
		listaavisomomento.add("Seleccione momento/s de aviso");
		listaavisomomento.add("Al inicio");
		listaavisomomento.add("Al mostrar aplicación");
		listaavisomomento.add("A la hora de inicio del evento");
		listaavisomomento.add("A la hora de fin del evento");
		spinneravisomomento.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listaavisomomento));
		((ArrayAdapter)spinneravisomomento.getAdapter()).notifyDataSetChanged();
		listaavisoformas.clear();
		listaavisoformas.add("Seleccione forma/s de aviso");
		listaavisoformas.add("Notificación completa");
		listaavisoformas.add("Ventana emergente");
		listaavisoformas.add("");
		spinneravisoforma.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listaavisoformas));
		((ArrayAdapter)spinneravisoforma.getAdapter()).notifyDataSetChanged();
		listaavisosfiltros.clear();
		listaavisosfiltros.add("Seleccione filtro/s de aviso");
		listaavisosfiltros.add("Solo días de la semana");
		listaavisosfiltros.add("Excepto días de la semana");
		listaavisosfiltros.add("");
		spinnerfiltrosaviso.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listaavisosfiltros));
		((ArrayAdapter)spinnerfiltrosaviso.getAdapter()).notifyDataSetChanged();
		listalimitelineas.add("0");
		contador = 100;
		for(int _repeat68 = 0; _repeat68 < (int)(100); _repeat68++) {
			listalimitelineas.add(String.valueOf((long)(contador)));
			contador = contador + 100;
		}
		limitelineas.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listalimitelineas));
		((ArrayAdapter)limitelineas.getAdapter()).notifyDataSetChanged();
		listaaudio.add("Ninguno");
		listaaudio.add("Decir");
		listaaudio.add("Reproducir archivo");
		spinneraudioaviso.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listaaudio));
		((ArrayAdapter)spinneraudioaviso.getAdapter()).notifyDataSetChanged();
		listasecciones.clear();
		listasecciones.add("Parte");
		listasecciones.add("Barra de herramientas");
		listasecciones.add("Secciones");
		listasecciones.add("Lista de notas");
		listasecciones.add("Cuadro de edición");
		listasecciones.add("Lista de notas");
		parte.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listasecciones));
		((ArrayAdapter)parte.getAdapter()).notifyDataSetChanged();
		listatipoconfiguracion.clear();
		listatipoconfiguracion.add("Dimensiones");
		listatipoconfiguracion.add("Ancho");
		listatipoconfiguracion.add("Alto");
		listatipoconfiguracion.add("Posición");
		tipoconfiguracion.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listatipoconfiguracion));
		((ArrayAdapter)tipoconfiguracion.getAdapter()).notifyDataSetChanged();
		dimensiones.setVisibility(View.GONE);
		transferencias.edit().putString("Método2", "1").commit();
		if (transferencias.getString("Método2", "").equals("2")) {
			listaorden.clear();
			listaorden.add("Orden de lista");
			
			
		}
		else {
			
		}
		listaedicion.clear();
		listaedicion.add("Mostrar fecha actual");
		listaedicion.add("");
		listaedicion.add("");
		listaedicion.add("");
		listaedicion.add("");
		listaedicion.add("");
		listaedicion.add("");
		listaedicion.add("");
		listaedicion.add("");
		listaedicion.add("");
		masopcionesedicion.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listaedicion));
		((ArrayAdapter)masopcionesedicion.getAdapter()).notifyDataSetChanged();
		listabuscar.clear();
		buscarporlista.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, listabuscar));
		((BaseAdapter)buscarporlista.getAdapter()).notifyDataSetChanged();
		listatiporegistro.clear();
		listatiporegistro.add("Registro general");
		listatiporegistro.add("Registro de filtro de texto");
		tiporegistro.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listatiporegistro));
		((ArrayAdapter)tiporegistro.getAdapter()).notifyDataSetChanged();
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("Registros de filtro de texto", "0");
			registrobidimensional.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("Filtro de texto", "0");
			registrobidimensional.add(_item);
		}
		
		listatipocita.clear();
		listatipocita.add("Seleccione tipo de cita");
		listatipocita.add("Días del mes");
		listatipocita.add("Días de la semana");
		tipocita.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listatipocita));
		((ArrayAdapter)tipocita.getAdapter()).notifyDataSetChanged();
		listatiposuceso.clear();
		listatiposuceso.add("Seleccione tipo de suceso");
		listatiposuceso.add("Ocupado");
		listatiposuceso.add("Ocupado parcial");
		listatiposuceso.add("Libre");
		tiposuceso.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listatiposuceso));
		((ArrayAdapter)tiposuceso.getAdapter()).notifyDataSetChanged();
		listahorariodesde.clear();
		listahorariohasta.clear();
		contador = 0;
		for(int _repeat196 = 0; _repeat196 < (int)(25); _repeat196++) {
			listahorariodesde.add(String.valueOf((long)(contador)));
			listahorariohasta.add(String.valueOf((long)(contador)));
			contador++;
		}
		spunnerdesdehora.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listahorariodesde));
		((ArrayAdapter)spunnerdesdehora.getAdapter()).notifyDataSetChanged();
		spinnerhastahora.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, listahorariohasta));
		((ArrayAdapter)spinnerhastahora.getAdapter()).notifyDataSetChanged();
		objetivos.clear();
		objetivos.add("Seleccione función");
		objetivos.add("Aviso");
		spinnerfiltroobjetivo.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, objetivos));
		((ArrayAdapter)spinnerfiltroobjetivo.getAdapter()).notifyDataSetChanged();
		transferencias.edit().putString("Registro", "(".concat(transferencias.getString("Hora completa", "").concat(") - (".concat(transferencias.getString("Fecha completa", "").concat("). Fin de carga de listas. ".concat("".concat("".concat("")))))))).commit();
		_actualizarregistroreciente();
	}
	
	
	public void _filtroaviso1() {
		_fechayhora();
		vecesseleccionaviso++;
		transferencias.edit().putString("Aviso correcto", "Si").commit();
		if (transferencias.getString("Estado evento", "").equals("Terminado")) {
			
		}
		else {
			transferencias.edit().putString("Aviso correcto", "No").commit();
		}
		if (transferencias.getString("Estado momento", "").equals("Terminado")) {
			
		}
		else {
			transferencias.edit().putString("Aviso correcto", "No").commit();
		}
		if (transferencias.getString("Estado forma", "").equals("Terminado")) {
			
		}
		else {
			transferencias.edit().putString("Aviso correcto", "No").commit();
		}
		if (transferencias.getString("Estado filtro", "").equals("Terminado")) {
			
		}
		else {
			transferencias.edit().putString("Aviso correcto", "No").commit();
		}
		if (transferencias.getString("Último criterio", "").equals("No")) {
			transferencias.edit().putString("Aviso correcto", "No").commit();
		}
		else {
			
		}
		if (transferencias.getString("Aviso correcto", "").equals("Si")) {
			transferencias.edit().putString("Añadir", "Si").commit();
			if (transferencias.getString("Último criterio", "").equals("Filtro")) {
				if (transferencias.getString("Aviso filtro", "").equals("Seleccione filtro/s de aviso")) {
					transferencias.edit().putString("Añadir", "Si").commit();
				}
				else {
					
				}
			}
			else {
				
			}
			if (transferencias.getString("Último criterio", "").equals("Momento")) {
				if (transferencias.getString("Aviso momento", "").equals("Seleccione momento/s de aviso")) {
					transferencias.edit().putString("Añadir", "No").commit();
				}
				else {
					
				}
			}
			else {
				
			}
			if (transferencias.getString("Último criterio", "").equals("Forma")) {
				if (transferencias.getString("Aviso forma", "").equals("Seleccione forma/s de aviso")) {
					transferencias.edit().putString("Añadir", "No").commit();
				}
				else {
					
				}
			}
			else {
				
			}
			if (transferencias.getString("Último criterio", "").equals("Evento")) {
				if (transferencias.getString("Aviso evento", "").equals("Seleccione tipo de evento/s")) {
					transferencias.edit().putString("Añadir", "No").commit();
				}
				else {
					
				}
				if (transferencias.getString("Aviso evento", "").equals("Todos")) {
					transferencias.edit().putString("Añadir", "Si").commit();
				}
				else {
					
				}
				if (transferencias.getString("Aviso evento", "").equals("Siguiente")) {
					transferencias.edit().putString("Añadir", "Si").commit();
				}
				else {
					
				}
			}
			else {
				
			}
			if (transferencias.getString("Último criterio", "").equals("Aviso audio")) {
				transferencias.edit().putString("Añadir", "Si").commit();
			}
			else {
				
			}
			if (transferencias.getString("Añadir", "").equals("Si")) {
				if (transferencias.getString("Último criterio", "").equals("Evento")) {
					transferencias.edit().putString("Estado evento", "Terminado").commit();
					avisoseventostemporal.clear();
					avisoseventostemporal.add(transferencias.getString("Aviso evento", ""));
				}
				else {
					
				}
				if (transferencias.getString("Último criterio", "").equals("Momento")) {
					avisosmomentostemporal.clear();
					avisosmomentostemporal.add(transferencias.getString("Aviso momento", ""));
					transferencias.edit().putString("Estado momento", "Terminado").commit();
					transferencias.edit().putString("Registro", transferencias.getString("Hora completa", "").concat(" - ".concat(transferencias.getString("Fecha completa", "").concat("Añadir momento. Eventos: ".concat(String.valueOf((long)(avisoseventostemporal.size())).concat(". Momentos: ".concat(String.valueOf((long)(avisosmomentostemporal.size())).concat(". Formas: ".concat(String.valueOf((long)(avisosformastemporal.size())).concat("".concat(". Aviso correcto: ".concat(transferencias.getString("Aviso correcto", "").concat(". Añadir: ".concat(transferencias.getString("Añadir", "").concat(". Evento: ".concat(transferencias.getString("Aviso evento", "").concat(". Momento: ".concat(transferencias.getString("Aviso momento", "").concat(". Forma: ".concat(transferencias.getString("Aviso forma", "").concat(". Último criterio: ".concat(transferencias.getString("Último criterio", "").concat(". Añadir: ".concat(transferencias.getString("Añadir", "").concat("".concat("")))))))))))))))))))))))))).commit();
					
				}
				else {
					
				}
				if (transferencias.getString("Último criterio", "").equals("Forma")) {
					transferencias.edit().putString("Estado momento", "Terminado").commit();
					avisosformastemporal.clear();
					avisosformastemporal.add(transferencias.getString("Aviso forma", ""));
				}
				else {
					
				}
				if (transferencias.getString("Último criterio", "").equals("Filtro")) {
					if (transferencias.getString("Aviso filtro", "").equals("Seleccione filtro/s de aviso")) {
						transferencias.edit().putString("Estado filtro", "Terminado").commit();
						avisosfiltrotemporal.clear();
						avisosfiltrotemporal.add("No");
					}
					else {
						
					}
				}
				else {
					
				}
				if (transferencias.getString("Último criterio", "").equals("Aviso audio")) {
					transferencias.edit().putString("Estado audio", "Terminado").commit();
					avisoaudiotemporal.clear();
					if (transferencias.getString("Aviso audio", "").equals("Ninguno")) {
						avisoaudiotemporal.add("No");
					}
					else {
						avisoaudiotemporal.add(transferencias.getString("Aviso audio", ""));
					}
				}
				else {
					
				}
				//comprobar si hay avisos repetidos en los últimos elegidos y si alguno de los elegidos son iguales que los que existen. Falta comparar con los avisos establecidos y con el criterio audio 
				transferencias.edit().putString("Aviso repetido", "No").commit();
				//asegurar que todas las matrices tengan el mismo número de datos 
				if ((avisosmomentostemporal.size() == avisosmomentostemporal.size()) && ((avisoseventostemporal.size() == avisosformastemporal.size()) && (avisoseventostemporal.size() == avisosfiltrotemporal.size()))) {
					transferencias.edit().putString("Contador", "0").commit();
					transferencias.edit().putString("Avisos repetidos", "0").commit();
					repetidos.clear();
					for(int _repeat327 = 0; _repeat327 < (int)(avisoseventostemporal.size()); _repeat327++) {
						if (Double.parseDouble(transferencias.getString("Contador", "")) < avisoseventostemporal.size()) {
							if (Double.parseDouble(transferencias.getString("Contador", "")) < avisosmomentostemporal.size()) {
								if (Double.parseDouble(transferencias.getString("Contador", "")) < avisosformastemporal.size()) {
									if (Double.parseDouble(transferencias.getString("Contador", "")) < avisosfiltrotemporal.size()) {
										transferencias.edit().putString("Contador1", "1").commit();
										for(int _repeat350 = 0; _repeat350 < (int)(avisoseventostemporal.size()); _repeat350++) {
											if (Double.parseDouble(transferencias.getString("Contador1", "")) < avisoseventostemporal.size()) {
												if (Double.parseDouble(transferencias.getString("Contador1", "")) < avisosmomentostemporal.size()) {
													if (Double.parseDouble(transferencias.getString("Contador1", "")) < avisosformastemporal.size()) {
														if (Double.parseDouble(transferencias.getString("Contador1", "")) < avisosfiltrotemporal.size()) {
															if (avisoseventostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))).concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))).concat(avisosformastemporal.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))).concat(avisosfiltrotemporal.get((int)(Double.parseDouble(transferencias.getString("Contador", ""))))))).equals(avisoseventostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(avisosformastemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(avisosfiltrotemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", ""))))))))) {
																repetidos.add(transferencias.getString("Contador1", ""));
																transferencias.edit().putString("Aviso repetidos", String.valueOf((long)(Double.parseDouble(transferencias.getString("Avisos repetidos", "")) + 1))).commit();
																if (transferencias.getString("Aviso repetido", "").equals("No")) {
																	transferencias.edit().putString("Aviso repetido", "(".concat(String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1)).concat("/".concat(String.valueOf((long)(avisoseventostemporal.size())).concat("). Evento: ".concat(avisoseventostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". Momento: ".concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". Forma: ".concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat("\n".concat("".concat(""))))))))))))).commit();
																}
																else {
																	transferencias.edit().putString("Aviso repetido", transferencias.getString("Aviso repetido", "").concat("(".concat(String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1)).concat("/".concat(String.valueOf((long)(avisoseventostemporal.size())).concat("). Evento: ".concat(avisoseventostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". Momento: ".concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". Forma: ".concat(avisosmomentostemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat(". Filtro: ".concat(avisosfiltrotemporal.get((int)(Double.parseDouble(transferencias.getString("Contador1", "")))).concat("\n".concat("".concat("")))))))))))))))).commit();
																}
															}
															else {
																
															}
															transferencias.edit().putString("Contador1", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1))).commit();
														}
														else {
															
														}
													}
													else {
														
													}
												}
												else {
													
												}
											}
											else {
												
											}
										}
									}
									else {
										
									}
								}
								else {
									
								}
							}
							else {
								
							}
							transferencias.edit().putString("Contador", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador", "")) + 1))).commit();
							if (Double.parseDouble(transferencias.getString("Contador", "")) == Double.parseDouble(transferencias.getString("Contador1", ""))) {
								transferencias.edit().putString("Contador1", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador1", "")) + 1))).commit();
							}
							else {
								
							}
						}
						else {
							
						}
					}
					//fin 
					if (transferencias.getString("Aviso repetido", "").equals("No")) {
						guardaraviso.setVisibility(View.VISIBLE);
						_actualizarinformeavisos();
					}
					else {
						avisoseventostemporal.clear();
						avisosmomentostemporal.clear();
						avisosformastemporal.clear();
						avisosfiltrotemporal.clear();
						avisoaudiotemporal.clear();
						guardaraviso.setVisibility(View.GONE);
						aviso.setTitle("Aviso repetido");
						aviso.setMessage(transferencias.getString("Aviso repetido", "").concat("".concat("".concat(""))));
						aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								transferencias.edit().putString("Método", "1").commit();
								if (transferencias.getString("Método", "").equals("2")) {
									transferencias.edit().putString("Contador", "0").commit();
									for(int _repeat547 = 0; _repeat547 < (int)(repetidos.size()); _repeat547++) {
										if (Double.parseDouble(transferencias.getString("Contador", "")) < repetidos.size()) {
											avisoseventostemporal.remove((int)(Double.parseDouble(repetidos.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))))));
											avisosmomentostemporal.remove((int)(Double.parseDouble(repetidos.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))))));
											avisosformastemporal.remove((int)(Double.parseDouble(repetidos.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))))));
											avisosfiltrotemporal.remove((int)(Double.parseDouble(repetidos.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))))));
											avisoaudiotemporal.remove((int)(Double.parseDouble(repetidos.get((int)(Double.parseDouble(transferencias.getString("Contador", "")))))));
											transferencias.edit().putString("Contador", String.valueOf((long)(Double.parseDouble(transferencias.getString("Contador", "")) + 1))).commit();
										}
										else {
											
										}
									}
								}
								else {
									
								}
							}
						});
						aviso.create().show();
					}
				}
				else {
					
				}
			}
			else {
				
			}
			_actualizarregistroreciente();
		}
		else {
			aviso.setTitle("Title");
			aviso.setMessage("Complete o cancele el evento antes de seleccionar otro criterio. ".concat("".concat("".concat(""))));
			aviso.setPositiveButton("Vale ", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			aviso.create().show();
		}
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			listaavisoeventos.add("Seleccione tipo de evento/s");
			listaavisoeventos.add("Todos");
			listaavisoeventos.add("Siguiente");
			listaavisoeventos.add("Día siguiente");
			listaavisoeventos.add("Seleccionados");
			listaavisoeventos.add("Coinciden con texto personalizado");
			listaavisomomento.add("Seleccione momento/s de aviso");
			listaavisomomento.add("Al inicio");
			listaavisomomento.add("Al mostrar aplicación");
			listaavisomomento.add("A la hora de inicio del evento");
			listaavisomomento.add("A la hora de fin del evento");
			listaavisoformas.add("Seleccione forma/s de aviso");
			listaavisoformas.add("Notificación completa");
			listaavisoformas.add("Ventana emergente");
			listaavisosfiltros.add("Seleccione filtro/s de aviso");
			listaavisosfiltros.add("Solo días de la semana");
			listaavisosfiltros.add("Excepto días de la semana");
		}
		else {
			
		}
	}
	
	
	public void _cargarconfiguracionpantalla() {
		if (FileUtil.isExistFile(transferencias.getString("Ruta configuración pantalla", ""))) {
			//cargar configuración
			textocargar.setText("Cargando configuración ");
			slist.clear();
			str = FileUtil.readFile(transferencias.getString("Ruta configuración pantalla", ""));
			String [] arr = str.split("\n");
			for (int i = 0; i < arr.length; i++) {
				slist.add(arr[i]);
			}
			contador = 0;
			for(int _repeat22 = 0; _repeat22 < (int)(slist.size()); _repeat22++) {
				if (contador < slist.size()) {
					if (slist.get((int)(contador)).equals("(Ancho editar)")) {
						contador++;
						_establecerdimensiones(Double.parseDouble(slist.get((int)(contador))), altoeditar, cuadroeditar);
						transferencias.edit().putString("Ancho editar", slist.get((int)(contador))).commit();
						registro.add("Ancho de cuadro de edición establecido: ".concat(slist.get((int)(contador)).concat("")));
					}
					else {
						
					}
					if (slist.get((int)(contador)).equals("(Lista de notas)")) {
						contador++;
						listview1.setTranslationY((float)(Double.parseDouble(slist.get((int)(contador)))));
						transferencias.edit().putString("Posición vertical lista de notas", slist.get((int)(contador))).commit();
						registro.add("Posición vertical de lista de notas establecido: ".concat(slist.get((int)(contador)).concat("")));
					}
					else {
						
					}
					if (slist.get((int)(contador)).equals("(Alto editar)")) {
						contador++;
						_establecerdimensiones(Double.parseDouble(slist.get((int)(contador))), altoeditar, cuadroeditar);
						altoeditar = Double.parseDouble(slist.get((int)(contador)));
						transferencias.edit().putString("Alto editar", slist.get((int)(contador))).commit();
						registro.add("Alto de cuadro de edición establecido: ".concat(slist.get((int)(contador)).concat("")));
					}
					else {
						
					}
					if (slist.get((int)(contador)).equals("(Posición barra de herramientas vertical)")) {
						contador++;
						registro.add("Ancho de cuadro de edición establecido: ".concat(slist.get((int)(contador)).concat("")));
						contadorverticalbarra = Double.parseDouble(slist.get((int)(contador)));
						transferencias.edit().putString("Posición barra de herramientas vertical", slist.get((int)(contador))).commit();
						registro.add("Posición barra de herramientas vertical establecido: ".concat(slist.get((int)(contador)).concat("")));
					}
					else {
						
					}
					if (slist.get((int)(contador)).equals("(Posición barra de herramientas horizontal)")) {
						contador++;
						registro.add("Ancho de cuadro de edición establecido: ".concat(slist.get((int)(contador)).concat("")));
						contadorhorizontalbarra = Double.parseDouble(slist.get((int)(contador)));
						transferencias.edit().putString("Posición barra de herramientas horizontal", slist.get((int)(contador))).commit();
					}
					else {
						
					}
					if (slist.get((int)(contador)).equals("(Mostrar progreso por debajo de líneas)")) {
						
					}
					else {
						
					}
					registro.add("Cargando configuración de pantalla . (".concat(String.valueOf((long)(contador)).concat("/".concat(String.valueOf((long)(slist.size())).concat(") ".concat(slist.get((int)(contador)).concat("".concat(""))))))));
					contador++;
				}
				else {
					
				}
			}
			textocargar.setText("Cargado");
			SketchwareUtil.showMessage(getApplicationContext(), "Configuración de pantalla cargada");
			_actualizarregistro();
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), "No existen datos de configuración de pantalla ");
		}
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("1")) {
			
		}
		else {
			
		}
	}
	
	
	public void _guardarconfiguracionpantalla() {
		transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("(Ancho editar)\n".concat(String.valueOf((long)(anchoeditar)).concat("\n")))).commit();
		transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("(Alto editar)\n".concat(String.valueOf((long)(altoeditar)).concat("\n")))).commit();
		transferencias.edit().putString("Configuración", transferencias.getString("Configuración", "").concat("(Lista de notas)\n".concat(transferencias.getString("Posición vertical lista de notas", "").concat("\n")))).commit();
		FileUtil.writeFile(transferencias.getString("Ruta configuración pantalla", ""), transferencias.getString("Configuración", ""));
		transferencias.edit().putString("Configuración cambiada", "No").commit();
		registro.add("Guardada configuración de pantalla en fichero (".concat(transferencias.getString("Ruta 1", "").concat("/configuración \n".concat(dato.concat("")))));
		_actualizarregistro();
		botonguardarconfiguracion.setVisibility(View.INVISIBLE);
		listview1.setBackgroundColor(Color.TRANSPARENT);
	}
	
	
	public void _avisar() {
		if (listadia.size() > 0) {
			if (true) {
				_fechayhora();
				transferencias.edit().putString("Aviso encontrado", "No").commit();
				transferencias.edit().putString("Posición de aviso", "-1").commit();
				dato = "";
				contador = 0;
				for(int _repeat22 = 0; _repeat22 < (int)(listadia.size()); _repeat22++) {
					if (contador < listadia.size()) {
						if (listadia.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Día", ""))) {
							if (listames.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Mes", ""))) {
								if (listaano.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Año", ""))) {
									transferencias.edit().putString("Aviso encontrado", "Si").commit();
									transferencias.edit().putString("Posición de aviso", String.valueOf((long)(contador))).commit();
									break;
								}
								else {
									
								}
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
					contador++;
				}
				if (transferencias.getString("Aviso encontrado", "").equals("No")) {
					dato = transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" Hoy no hay eventos. ".concat(""))))));
					mensaje.add(transferencias.getString("Día", "").concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" Hoy no hay eventos. ".concat("")))))));
				}
				else {
					if (transferencias.getString("Evento próximo", "").equals("Si")) {
						dato = "Hoy. ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat(". "))))));
						mensaje.add("Hoy. ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat(". ")))))));
						if (Double.parseDouble(transferencias.getString("Posición de aviso", "")) < listaestado.size()) {
							dato = dato.concat(listaestado.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("\n")));
							mensaje.add("Estado: ".concat(listaestado.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("\n"))));
						}
						else {
							dato = dato.concat("Estado no encontrado".concat(". ".concat("")));
							mensaje.add("Estado no encontrado".concat(". ".concat("")));
						}
						if (Double.parseDouble(transferencias.getString("Posición de aviso", "")) < comentarios.size()) {
							if (comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).equals("(No)")) {
								dato = dato.concat("Sin comentario. ".concat(""));
								mensaje.add("Sin comentario. ".concat(""));
							}
							else {
								dato = dato.concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("\n")));
								mensaje.add("Comentario: ".concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("\n"))));
							}
						}
						else {
							dato = dato.concat("Comentario no encontrado. ".concat(". ".concat("")));
							mensaje.add("Comentario no encontrado. ".concat(". ".concat("")));
						}
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Método", "").equals("2")) {
							dato = dato.concat("Horario: ".concat(String.valueOf((long)(horadesde.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat(":".concat(String.valueOf((long)(horahasta.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("\n")))));
							dato = dato.concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("\n")));
						}
						else {
							
						}
					}
					else {
						
					}
				}
				transferencias.edit().putString("Aviso encontrado", "No").commit();
				contador = 0;
				transferencias.edit().putString("Posición de aviso", "-1").commit();
				for(int _repeat213 = 0; _repeat213 < (int)(listadia.size()); _repeat213++) {
					if (listadia.get((int)(contador)).doubleValue() == (Double.parseDouble(transferencias.getString("Día", "")) + 1)) {
						if (listames.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Mes", ""))) {
							if (listaano.get((int)(contador)).doubleValue() == Double.parseDouble(transferencias.getString("Año", ""))) {
								transferencias.edit().putString("Aviso encontrado", "Si").commit();
								transferencias.edit().putString("Posición de aviso", String.valueOf((long)(contador))).commit();
								break;
							}
							else {
								
							}
						}
						else {
							
						}
					}
					else {
						
					}
					contador++;
				}
				//Comprobar si el día es mayor que días del mes 
				if (transferencias.getString("Aviso encontrado", "").equals("No")) {
					dato = dato.concat(String.valueOf((long)(Double.parseDouble(transferencias.getString("Día", "")) + 1)).concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" Mañana no hay eventos. ".concat("")))))));
					mensaje.add(String.valueOf((long)(Double.parseDouble(transferencias.getString("Día", "")) + 1)).concat("/".concat(transferencias.getString("Mes", "").concat("/".concat(transferencias.getString("Año", "").concat(" Mañana no hay eventos. ".concat("")))))));
				}
				else {
					mensaje.clear();
					if (listadia.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue() > 31) {
						contador--;
					}
					else {
						
					}
					if (transferencias.getString("Evento próximo", "").equals("Si")) {
						dato = dato.concat(" Mañana. ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(". ")))))));
						mensaje.add(" Mañana. ".concat(String.valueOf((long)(listadia.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("/".concat(String.valueOf((long)(listames.get((int)(contador)).doubleValue())).concat("/".concat(String.valueOf((long)(listaano.get((int)(contador)).doubleValue())).concat(". ")))))));
						if (Double.parseDouble(transferencias.getString("Posición de aviso", "")) < listaestado.size()) {
							dato = dato.concat(listaestado.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("")));
							mensaje.add("Estado: ".concat(listaestado.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat(""))));
						}
						else {
							dato = dato.concat("Estado no encontrado".concat(". ".concat("\n")));
							mensaje.add("Estado no encontrado".concat(". ".concat("")));
						}
						if (Double.parseDouble(transferencias.getString("Posición de aviso", "")) < comentarios.size()) {
							if (comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).equals("(No)")) {
								dato = dato.concat("Sin comentario. ".concat(""));
								mensaje.add("Sin comentario. ".concat(""));
							}
							else {
								dato = dato.concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("")));
								mensaje.add("Comentario: ".concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat(""))));
							}
						}
						else {
							dato = dato.concat("Comentario no encontrado. ".concat(". ".concat("\n")));
							mensaje.add("Comentario no encontrado. ".concat(""));
						}
						transferencias.edit().putString("Método", "1").commit();
						if (transferencias.getString("Método", "").equals("2")) {
							dato = dato.concat("Horario: ".concat(String.valueOf((long)(horadesde.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat(":".concat(String.valueOf((long)(horahasta.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).doubleValue())).concat("\n")))));
							dato = dato.concat(comentarios.get((int)(Double.parseDouble(transferencias.getString("Posición de aviso", "")))).concat(". ".concat("")));
						}
						else {
							
						}
					}
					else {
						
					}
				}
			}
			else {
				
			}
		}
		else {
			
		}
		transferencias.edit().putString("Método", "1").commit();
		if (transferencias.getString("Método", "").equals("2")) {
			if (eventoproximo.isChecked()) {
				if (mostraraplicacion.isChecked()) {
					if (transferencias.getString("Notificación", "").equals("Si")) {
						_notificaciones();
						Intent intent = new Intent(MainActivity.this, MainActivity.class);
						intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
						PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
						
						androidx.core.app.NotificationCompat.InboxStyle IbStyle = new androidx.core.app.NotificationCompat.InboxStyle(); 
						
						//cargar texto de matriz
						contador = 0;
						for(int _repeat675 = 0; _repeat675 < (int)(mensaje.size()); _repeat675++) {
								if (contador < mensaje.size()) {
										IbStyle.addLine(mensaje.get((int)(contador)));
										if (dato.equals(mensaje.get((int)(contador)))) {
												
										}
										else {
												
										}
								}
								else {
										
								}
								contador++;
						}
						//fin 
						//texto completo
						//IbStyle.addLine(dato);
						//IbStyle.addLine("My name is Neelu Singh");
						//IbStyle.addLine("More");
						IbStyle.setSummaryText(""); 
						IbStyle.setBigContentTitle("Calendario Espartano ");
						//fin 
						androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(MainActivity.this, "id 1")
						.setSmallIcon(R.drawable.img)
						.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
						.setContentTitle("Calendario Espartano")
						.setContentText(dato)
						.setPriority(androidx.core.app.NotificationCompat.PRIORITY_MAX)
						.setStyle(IbStyle)
						.setOngoing(true)
						.setContentIntent(pendingIntent)
						.setAutoCancel(true);
						
						androidx.core.app.NotificationManagerCompat notificationManager = androidx.core.app.NotificationManagerCompat.from(MainActivity.this);
						notificationManager.notify(1, builder.build());
						if (transferencias.getString("Aviso encontrado", "").equals("Si")) {
							
						}
						else {
							
						}
					}
					else {
						
					}
				}
				else {
					
				}
			}
			else {
				
			}
			if (transferencias.getString("Decir", "").equals("Si")) {
				voz.speak(dato, TextToSpeech.QUEUE_ADD, null);
			}
			else {
				
			}
			if (transferencias.getString("Ventana", "").equals("Si")) {
				principal.setClass(getApplicationContext(), MainActivity.class);
				principal.setAction(Intent.ACTION_MAIN);
				startActivity(principal);
			}
			else {
				
			}
			if (transferencias.getString("Aviso", "").equals("Si")) {
				
			}
			else {
				
			}
			registro.add(transferencias.getString("Fecha completa", "").concat(". ".concat(transferencias.getString("Hora completa", "").concat(". Aviso fecha: ".concat(transferencias.getString("Aviso", "").concat(". Evento próximo: ".concat(transferencias.getString("Evento próximo", "").concat(". Notificación: ".concat(transferencias.getString("Notificación", "").concat(". Aviso encontrado: ".concat(transferencias.getString("Aviso encontrado", "").concat("".concat("")))))))))))));
			_actualizarregistro();
			contador = 0;
			for(int _repeat454 = 0; _repeat454 < (int)(mensaje.size()); _repeat454++) {
				if (contador < mensaje.size()) {
					//IbStyle.addLine(mensaje.get((int)(contador)));
					if (dato.equals(mensaje.get((int)(contador)))) {
						
					}
					else {
						
					}
				}
				else {
					
				}
				contador++;
			}
		}
		else {
			
		}
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}