package jrl.jroldan.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

/**
 * OPCIÓN 1: En este ejercicio se ha visto como crear un TabLayout de forma independiente
 * al elemento ViewPager. Para ello, hay qie implementar el listener en TabLayout y el
 * listener en ViewPager y vincularlos de forma que se actualice el otro elemento.
 *
 * OPCIÓN 2: Es vincular el TabLayout al ViewPager con el método setupWithViewPager().
 * Se debe cumplir ÚNICAMENTE el siguiente requisito:
 * El título de las pestañas del Tab se inicializan mediante el método getPageTitle.
 */
public class TabLayoutActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        toolbar = findViewById(R.id.toolbar);
        // Aquí nos muestra la toolbar con el nombre de la Activity
        setSupportActionBar(toolbar);
        // Toolbar debe ser de la librería support
        viewPager = findViewById(R.id.vpgContent);
        // Se puebla con un Adapter personalizado de Fragments
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        tabLayout = findViewById(R.id.tabLayout);


        //[...]

        // OPCIÓN 2
        tabLayout.setupWithViewPager(viewPager);

        // Si se quiere personalizar las pestañas del TabLayout, siempre se debe realizar después del método setupWithTabLayout
    }
}
