package com.nashipaechepkurui.agri_mark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;


import java.util.ArrayList;
import java.util.List;


public class ListOfProduceActivity extends AppCompatActivity {
    private ImageView Ivbackdrop,Ivbackdrop1,Ivbackdrop2,Ivbackdrop3,Ivbackdrop4,Ivbackdrop5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_produce);
        Ivbackdrop = (ImageView) findViewById(R.id.Ivbackdrop);
        Ivbackdrop1 = (ImageView) findViewById(R.id.Ivbackdrop1);
        Ivbackdrop2 = (ImageView) findViewById(R.id.Ivbackdrop2);
        Ivbackdrop3 = (ImageView) findViewById(R.id.Ivbackdrop3);
        Ivbackdrop4 = (ImageView) findViewById(R.id.Ivbackdrop4);
        Ivbackdrop5 = (ImageView) findViewById(R.id.Ivbackdrop5);

        Ivbackdrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListOfProduceActivity.this, PotatoeFarmsActivity.class));
            }
        });
    }


//        RecyclerView recyclerView;
//        ProduceAdapter adapter;
//        List<Produce>produceList;
        
//            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//            setSupportActionBar(toolbar);
//
//            initCollapsingToolbar();
//
//            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

//            produceList = new ArrayList<>();
//            adapter = new ProduceAdapter(this, produceList);
//
//            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
//            recyclerView.setLayoutManager(mLayoutManager);
//            recyclerView.addItemDecoration(new GridSpacingItemDecoration(2,  true));
//            recyclerView.setItemAnimator(new DefaultItemAnimator());
//            recyclerView.setAdapter(adapter);
//
//            prepareProduce();
//
////            try {
////                Glide.with(this).load(R.drawable.cover).into((ImageView) findViewById(R.id.backdrop));
////            } catch (Exception e) {
////                e.printStackTrace();
////            }
//        }
//

        /**
         * Initializing collapsing toolbar
         * Will show and hide the toolbar title on scroll
         */

    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }

    /**
     * Adding few albums for testing
     */
    private void prepareProduce() {
        int[] covers = new int[]{
                R.drawable.potatoes,
                R.drawable.cabbages,
                R.drawable.maize,
                R.drawable.kalespinach,
                R.drawable.carrots,
                R.drawable.onions,};

//        Album a = new Album("True Romance", 13, covers[0]);
//        albumList.add(a);
//
//        a = new Album("Xscpae", 8, covers[1]);
//        albumList.add(a);
//
//        a = new Album("Maroon 5", 11, covers[2]);
//        albumList.add(a);
//
//        a = new Album("Born to Die", 12, covers[3]);
//        albumList.add(a);
//
//        a = new Album("Honeymoon", 14, covers[4]);
//        albumList.add(a);
//
//        a = new Album("I Need a Doctor", 1, covers[5]);
//        albumList.add(a);
//
//        a = new Album("Loud", 11, covers[6]);
//        albumList.add(a);
//
//        a = new Album("Legend", 14, covers[7]);
//        albumList.add(a);
//
//        a = new Album("Hello", 11, covers[8]);
//        albumList.add(a);
//
//        a = new Album("Greatest Hits", 17, covers[9]);
//        albumList.add(a);
//
//        adapter.notifyDataSetChanged();
//    }

        /**
         * RecyclerView item decoration - give equal margin around grid item
         */
        class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

            private int spanCount;
            private int spacing;
            private boolean includeEdge;

            public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
                this.spanCount = spanCount;
                this.spacing = spacing;
                this.includeEdge = includeEdge;
            }

            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                int position = parent.getChildAdapterPosition(view); // item position
                int column = position % spanCount; // item column

                if (includeEdge) {
                    outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                    outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                    if (position < spanCount) { // top edge
                        outRect.top = spacing;
                    }
                    outRect.bottom = spacing; // item bottom
                } else {
                    outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                    outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                    if (position >= spanCount) {
                        outRect.top = spacing; // item top
                    }
                }
            }


            /**
             * Converting dp to pixel
             */

            private int dpToPx(int dp) {
                Resources r = getResources();
                return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
            }
        }
    }

    private class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
        public GridSpacingItemDecoration(int i, Object dpToPx) {
        }
    }
}



