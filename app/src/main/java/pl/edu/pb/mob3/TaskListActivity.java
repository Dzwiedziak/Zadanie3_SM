package pl.edu.pb.mob3;

import androidx.fragment.app.Fragment;

public class TaskListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new TaskListFragment();
    }
}