package br.utp.sustentabilidade.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import br.utp.sustentabilidade.R;
import br.utp.sustentabilidade.databinding.ActivityMainBinding;
import br.utp.sustentabilidade.fragments.OrganicoFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    private OrganicoFragment mFragmentoOrganico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Inicializa os fragmentos
        mFragmentoOrganico = OrganicoFragment.newInstance();

        // Cadastra os eventos da bottom navigation
        mBinding.mainBottomNavigation.setOnNavigationItemSelectedListener(this::onSelecionarFragmento);

        // Define o primeiro fragmento a ser visualizado
        trocarFragmentos(mFragmentoOrganico);
    }

    private boolean onSelecionarFragmento(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.action_organicos:
                trocarFragmentos(mFragmentoOrganico);
                return true;
        }
        return false;
    }

    private void trocarFragmentos(final Fragment fragmento) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.replace(R.id.main_content, fragmento);
        transaction.commit();
    }
}
