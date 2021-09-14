package co.za.fat.assessment_3.data

import co.za.fat.assessment_3.R
import co.za.fat.assessment_3.model.Show

class Datasource {
    fun loadShows(): List<Show>{
        return listOf<Show>(
            Show(R.string.liseysstory, R.mipmap.lisey_foreground),
            Show(R.string.Servant, R.mipmap.servant_foreground),
            Show(R.string.see, R.mipmap.see_foreground),
            Show(R.string.truthbetold, R.mipmap.tbt_foreground)
        )
    }
}