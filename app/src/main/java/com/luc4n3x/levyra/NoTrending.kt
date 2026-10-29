package com.luc4n3x.levyra

/**
 * Fork switch: when true, Levyra shows only content derived from the user's own
 * listening, favorites, playlists and followed artists. It never fetches or shows:
 *  - chart / trending content (YouTube Music, editorial and Apple Music charts),
 *  - YouTube Music's generic Home feed and Home albums,
 *  - bundled starter songs, generic "top hits" searches, or genre searches when
 *    no genres were picked,
 *  - generic new-release lists or editorial Explore collections,
 *  - trending, editorial or unfollowed-artist new releases in Discovery.
 * Every cut returns the same empty/null result the network-failure path returns.
 * Set to false to restore upstream behavior.
 */
const val NO_TRENDING = true
