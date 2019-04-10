package bridge.Impl;

import bridge.IResource;
import bridge.View;

public class LongFormView extends View {
    public LongFormView(IResource r) {
        super(r);
    }

    @Override
    public String show() {
        return this.resource.snippet() + this.resource.image() + this.resource.url();

    }
}
