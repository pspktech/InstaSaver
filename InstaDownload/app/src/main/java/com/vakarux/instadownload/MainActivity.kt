    @Composable
    fun GitHubCredit() {
        val uriHandler = LocalUriHandler.current
        val context = LocalContext.current
        val version = remember { runCatching { context.packageManager.getPackageInfo(context.packageName, 0).versionName }.getOrNull() }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            version?.let {
                Text(stringResource(R.string.version_label_format, it), style = MaterialTheme.typography.labelSmall.copy(color = Color.White.copy(alpha = 0.5f)))
            }
            TextButton(onClick = { uriHandler.openUri("https://github.com/pspktech") }, shape = RoundedCornerShape(12.dp)) {
                Box(
                    modifier = Modifier.size(28.dp).clip(CircleShape).background(Color.White.copy(alpha = 0.1f)).border(1.dp, Color.White.copy(alpha = 0.2f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(painterResource(id = R.drawable.github), contentDescription = stringResource(R.string.github_content_description), tint = Color.White, modifier = Modifier.size(16.dp))
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(stringResource(R.string.made_by_label), style = MaterialTheme.typography.labelLarge.copy(color = Color.White.copy(alpha = 0.8f)))
            }
            TextButton(onClick = { uriHandler.openUri("https://www.instagram.com/____madhu_patel____/") }, shape = RoundedCornerShape(12.dp)) {
                Box(
                    modifier = Modifier.size(28.dp).clip(CircleShape).background(Color.White.copy(alpha = 0.1f)).border(1.dp, Color.White.copy(alpha = 0.2f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text("IG", style = MaterialTheme.typography.labelLarge.copy(color = Color.White, fontWeight = FontWeight.Bold))
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(stringResource(R.string.follow_me_label), style = MaterialTheme.typography.labelLarge.copy(color = Color.White.copy(alpha = 0.8f)))
            }
            TextButton(onClick = { uriHandler.openUri("https://github.com/pspktech") }) {
                Text(stringResource(R.string.privacy_policy_label), style = MaterialTheme.typography.labelSmall.copy(color = Color.White.copy(alpha = 0.5f)))
            }
        }
    }
