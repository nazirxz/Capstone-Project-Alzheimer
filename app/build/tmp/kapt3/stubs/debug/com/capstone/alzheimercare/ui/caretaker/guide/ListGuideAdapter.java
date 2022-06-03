package com.capstone.alzheimercare.ui.caretaker.guide;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0014\u0015B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/capstone/alzheimercare/ui/caretaker/guide/ListGuideAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/capstone/alzheimercare/ui/caretaker/guide/ListGuideAdapter$ListViewHolder;", "resultGuides", "", "Lcom/capstone/alzheimercare/ui/caretaker/guide/DataClassGuide;", "(Ljava/util/List;)V", "onItemClickCallback", "Lcom/capstone/alzheimercare/ui/caretaker/guide/ListGuideAdapter$OnItemClickCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickCallback", "ListViewHolder", "OnItemClickCallback", "app_debug"})
public final class ListGuideAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.capstone.alzheimercare.ui.caretaker.guide.ListGuideAdapter.ListViewHolder> {
    private com.capstone.alzheimercare.ui.caretaker.guide.ListGuideAdapter.OnItemClickCallback onItemClickCallback;
    private final java.util.List<com.capstone.alzheimercare.ui.caretaker.guide.DataClassGuide> resultGuides = null;
    
    public final void setOnItemClickCallback(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.ui.caretaker.guide.ListGuideAdapter.OnItemClickCallback onItemClickCallback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.capstone.alzheimercare.ui.caretaker.guide.ListGuideAdapter.ListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.ui.caretaker.guide.ListGuideAdapter.ListViewHolder holder, int position) {
    }
    
    public ListGuideAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.capstone.alzheimercare.ui.caretaker.guide.DataClassGuide> resultGuides) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/capstone/alzheimercare/ui/caretaker/guide/ListGuideAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/capstone/alzheimercare/ui/caretaker/guide/ListGuideAdapter;Landroid/view/View;)V", "ivPicture", "Landroid/widget/ImageView;", "getIvPicture", "()Landroid/widget/ImageView;", "setIvPicture", "(Landroid/widget/ImageView;)V", "tvDescription", "Landroid/widget/TextView;", "getTvDescription", "()Landroid/widget/TextView;", "setTvDescription", "(Landroid/widget/TextView;)V", "tvName", "getTvName", "setTvName", "app_debug"})
    public final class ListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvDescription;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView ivPicture;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvName() {
            return null;
        }
        
        public final void setTvName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDescription() {
            return null;
        }
        
        public final void setTvDescription(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvPicture() {
            return null;
        }
        
        public final void setIvPicture(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public ListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/capstone/alzheimercare/ui/caretaker/guide/ListGuideAdapter$OnItemClickCallback;", "", "onItemClicked", "", "data", "Lcom/capstone/alzheimercare/ui/caretaker/guide/DataClassGuide;", "app_debug"})
    public static abstract interface OnItemClickCallback {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.capstone.alzheimercare.ui.caretaker.guide.DataClassGuide data);
    }
}