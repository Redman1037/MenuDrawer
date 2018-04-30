# MenuDrawer
This library is a helper to place navigation drawer in activity, This is not recommended way to use navigation drawer . Always use navigation drawer with fragments . Use this library only if you got no other choise

       compile 'in.eightfolds:menudrawer:1.0.0'

#Usage

       @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        MenuDrawer menuDrawer = new MenuDrawer().attach(this);
        menuDrawer.setContentView(R.layout.activity_main);
        menuDrawer.setMenuView(R.layout.menu_view);
        menuDrawer.setToolBar(R.id.toolBar, "MainActivity");
  
         }
         
ToolBar works only with activities which extend `AppCompatActivity`  and theme set to NoActionBar theme ,

Take ToolBar inside the content view and just pass its Id
