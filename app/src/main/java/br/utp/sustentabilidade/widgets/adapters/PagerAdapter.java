package br.utp.sustentabilidade.widgets.adapters;

import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentos;

    public PagerAdapter(final FragmentManager fm, List<Fragment> fragmentos) {
        super(fm);
        mFragmentos = fragmentos;
    }

    @Override
    public Fragment getItem(final int position) {
        return mFragmentos.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentos.size();
    }
}
