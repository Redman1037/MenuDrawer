# MenuDrawer
This library is a helper to place navigation drawer in activity

#Usage

       @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        MenuDrawer menuDrawer = new MenuDrawer().attach(this);
        menuDrawer.setContentView(R.layout.activity_main);
        menuDrawer.setMenuView(R.layout.menu_view);
        menuDrawer.setToolBar(R.id.toolBar, "MainActivity");
  
         }
         
         
   ToolBar works only with activities which extend `AppCompatActivity`  and theme set to NoActionBar theme
