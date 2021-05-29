package iterator.pattern;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {
    private ArrayList<IProject> projectList;
    private int currentItem;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
        this.currentItem = 0;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }
}
