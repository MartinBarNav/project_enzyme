.class public final Lcom/google/android/gms/b/ad;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/an;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/ad$1;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lorg/apache/http/client/HttpClient;

.field private final c:Landroid/content/Context;

.field private d:Ljava/net/URL;

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lcom/google/android/gms/b/ae;

.field private k:Lcom/google/android/gms/b/ah;

.field private l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private m:Z

.field private n:J

.field private o:J

.field private p:Lcom/google/android/gms/b/ak;

.field private volatile q:Z


# direct methods
.method constructor <init>(Lorg/apache/http/client/HttpClient;Landroid/content/Context;Lcom/google/android/gms/b/ak;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/ad;->l:Ljava/util/Set;

    iput-boolean v8, p0, Lcom/google/android/gms/b/ad;->m:Z

    iput-boolean v8, p0, Lcom/google/android/gms/b/ad;->q:Z

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ad;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/b/ad;->p:Lcom/google/android/gms/b/ak;

    const-string v0, "GoogleAnalytics"

    const-string v1, "4.0"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/b/w;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v5, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 1000
    const-string v6, "%s/%s (Linux; U; Android %s; %s; %s Build/%s)"

    const/4 v7, 0x6

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v0, v7, v8

    const/4 v0, 0x1

    aput-object v1, v7, v0

    const/4 v0, 0x2

    aput-object v2, v7, v0

    const/4 v0, 0x3

    aput-object v3, v7, v0

    const/4 v0, 0x4

    aput-object v4, v7, v0

    const/4 v0, 0x5

    aput-object v5, v7, v0

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 0
    iput-object v0, p0, Lcom/google/android/gms/b/ad;->a:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/b/ad;->b:Lorg/apache/http/client/HttpClient;

    return-void
.end method

.method private static a(Ljava/util/List;I)I
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/k;",
            ">;I)I"
        }
    .end annotation

    .prologue
    const-wide/16 v6, 0x0

    .line 0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v5, 0x0

    :cond_0
    return v5

    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-le p1, v0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    :cond_2
    add-int/lit8 v4, p1, -0x1

    move-wide v2, v6

    move v5, p1

    :goto_0
    if-lez v4, :cond_0

    add-int/lit8 v0, v4, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/k;

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/b/k;

    .line 2000
    iget-wide v8, v0, Lcom/google/android/gms/b/k;->c:J

    .line 3000
    iget-wide v0, v1, Lcom/google/android/gms/b/k;->c:J

    .line 0
    cmp-long v10, v8, v6

    if-eqz v10, :cond_3

    cmp-long v10, v0, v6

    if-eqz v10, :cond_3

    sub-long v10, v0, v8

    cmp-long v10, v10, v2

    if-lez v10, :cond_3

    sub-long/2addr v0, v8

    move v2, v4

    :goto_1
    add-int/lit8 v4, v4, -0x1

    move v5, v2

    move-wide v2, v0

    goto :goto_0

    :cond_3
    move-wide v0, v2

    move v2, v5

    goto :goto_1
.end method

.method private static a(Lcom/google/android/gms/b/k;Ljava/util/List;Lcom/google/android/gms/b/ae;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/k;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/b/ae;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 0
    sget-object v0, Lcom/google/android/gms/b/ae;->a:Lcom/google/android/gms/b/ae;

    if-ne p2, v0, :cond_3

    .line 6000
    iget-object v0, p0, Lcom/google/android/gms/b/k;->a:Ljava/lang/String;

    .line 0
    if-eqz v0, :cond_0

    .line 7000
    iget-object v0, p0, Lcom/google/android/gms/b/k;->a:Ljava/lang/String;

    .line 0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, ""

    :goto_1
    return-object v0

    .line 8000
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/k;->a:Ljava/lang/String;

    goto :goto_0

    .line 0
    :cond_2
    invoke-static {p0, v2, v3}, Lcom/google/android/gms/b/l;->a(Lcom/google/android/gms/b/k;J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    const-string v1, ""

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_6
    move-object v0, v1

    goto :goto_1
.end method

.method private a(Lcom/google/android/gms/b/k;)Ljava/net/URL;
    .locals 3

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/ad;->d:Ljava/net/URL;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ad;->d:Ljava/net/URL;

    :goto_0
    return-object v0

    .line 11000
    :cond_0
    iget-object v1, p1, Lcom/google/android/gms/b/k;->e:Ljava/lang/String;

    .line 0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    const-string v2, "http:"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "http://www.google-analytics.com/collect"

    :goto_1
    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Error trying to parse the hardcoded host url. This really shouldn\'t happen."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    :try_start_1
    const-string v1, "https://ssl.google-analytics.com/collect"
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method private a(Lcom/google/android/gms/b/o;Lorg/apache/http/HttpHost;Lcom/google/android/gms/b/ae;Lcom/google/android/gms/b/ah;)V
    .locals 6

    .prologue
    .line 0
    const-string v0, "_bs"

    invoke-virtual {p3}, Lcom/google/android/gms/b/ae;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_cs"

    invoke-virtual {p4}, Lcom/google/android/gms/b/ah;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10000
    iget-boolean v0, p1, Lcom/google/android/gms/b/o;->c:Z

    if-nez v0, :cond_0

    const-string v1, ""

    .line 0
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    return-void

    .line 10000
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/b/o;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p1, Lcom/google/android/gms/b/o;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "&"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Lcom/google/android/gms/b/o;->a:Ljava/util/Map;

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/b/o;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "&"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Lcom/google/android/gms/b/o;->b:Ljava/util/Map;

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 0
    :cond_3
    if-nez p2, :cond_4

    :try_start_0
    new-instance v0, Ljava/net/URL;

    const-string v2, "https://ssl.google-analytics.com"

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    new-instance v2, Lorg/apache/http/HttpHost;

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/net/URL;->getPort()I

    move-result v4

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_4
    const/4 v3, 0x1

    sget-object v5, Lcom/google/android/gms/b/ah;->a:Lcom/google/android/gms/b/ah;

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/ad;->a(Ljava/lang/String;Lorg/apache/http/HttpHost;ILcom/google/android/gms/b/o;Lcom/google/android/gms/b/ah;)Z

    goto/16 :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_1

    :cond_4
    move-object v2, p2

    goto :goto_4
.end method

.method private static a(Lorg/apache/http/HttpEntityEnclosingRequest;)V
    .locals 6

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-interface {p0}, Lorg/apache/http/HttpEntityEnclosingRequest;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v4

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lorg/apache/http/HttpEntityEnclosingRequest;->getRequestLine()Lorg/apache/http/RequestLine;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, Lorg/apache/http/HttpEntityEnclosingRequest;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-interface {p0}, Lorg/apache/http/HttpEntityEnclosingRequest;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v2

    if-lez v2, :cond_1

    new-array v2, v2, [B

    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    const-string v0, "POST:\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->b(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    const-string v0, "Error Writing hit to log..."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Lorg/apache/http/HttpHost;ILcom/google/android/gms/b/o;Lcom/google/android/gms/b/ah;)Z
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 0
    if-le p3, v1, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v3, v3

    iget v4, p0, Lcom/google/android/gms/b/ad;->g:I

    if-gt v3, v4, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v3, v3

    iget v4, p0, Lcom/google/android/gms/b/ad;->f:I

    if-le v3, v4, :cond_3

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Request too long (> "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/google/android/gms/b/ad;->f:I

    iget v3, p0, Lcom/google/android/gms/b/ad;->g:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " bytes)--not sent"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    :cond_1
    :goto_1
    return v1

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    iget-boolean v3, p0, Lcom/google/android/gms/b/ad;->q:Z

    if-eqz v3, :cond_4

    const-string v0, "Dry run enabled. Hit not actually sent."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 5000
    :cond_4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v4, "Empty hit, discarding."

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v3, 0x0

    move-object v5, v3

    .line 0
    :goto_2
    if-eqz v5, :cond_1

    invoke-interface {v5}, Lorg/apache/http/HttpEntityEnclosingRequest;->getRequestLine()Lorg/apache/http/RequestLine;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/RequestLine;->getMethod()Ljava/lang/String;

    move-result-object v3

    const-string v4, "GET"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v4, v3

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v3, v3

    :goto_3
    const-string v6, "Host"

    invoke-virtual {p2}, Lorg/apache/http/HttpHost;->toHostString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Lorg/apache/http/HttpEntityEnclosingRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/b/n;->a()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-static {v5}, Lcom/google/android/gms/b/ad;->a(Lorg/apache/http/HttpEntityEnclosingRequest;)V

    :cond_5
    :try_start_0
    iget-object v6, p0, Lcom/google/android/gms/b/ad;->b:Lorg/apache/http/client/HttpClient;

    invoke-interface {v6, p2, v5}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v5

    const-string v6, "_td"

    invoke-virtual {p4, v6, v4}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;I)V

    const-string v4, "_cd"

    invoke-virtual {p4, v4, v3}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;I)V

    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v3

    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-interface {v4}, Lorg/apache/http/HttpEntity;->consumeContent()V

    :cond_6
    const/16 v4, 0xc8

    if-eq v3, v4, :cond_1

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/b/ad;->l:Ljava/util/Set;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "Falling back to single hit per request mode."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->b(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/ad;->m:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/gms/b/ad;->n:J
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    move v1, v2

    goto/16 :goto_1

    .line 5000
    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/google/android/gms/b/ad;->h:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "?"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    iget v5, p0, Lcom/google/android/gms/b/ad;->e:I

    if-ge v3, v5, :cond_8

    if-nez v0, :cond_8

    new-instance v3, Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;

    const-string v5, "GET"

    invoke-direct {v3, v5, v4}, Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    const-string v4, "User-Agent"

    iget-object v5, p0, Lcom/google/android/gms/b/ad;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lorg/apache/http/HttpEntityEnclosingRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    move-object v5, v3

    goto/16 :goto_2

    :cond_8
    if-eqz v0, :cond_9

    new-instance v3, Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;

    const-string v4, "POST"

    iget-object v5, p0, Lcom/google/android/gms/b/ad;->i:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_9
    new-instance v3, Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;

    const-string v4, "POST"

    iget-object v5, p0, Lcom/google/android/gms/b/ad;->h:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 0
    :cond_a
    :try_start_1
    sget-object v3, Lcom/google/android/gms/b/ad$1;->a:[I

    invoke-virtual {p5}, Lcom/google/android/gms/b/ah;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v3, v3

    new-instance v4, Lorg/apache/http/entity/StringEntity;

    invoke-direct {v4, p1}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V

    invoke-interface {v5, v4}, Lorg/apache/http/HttpEntityEnclosingRequest;->setEntity(Lorg/apache/http/HttpEntity;)V

    :goto_5
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    array-length v4, v4

    goto/16 :goto_3

    :pswitch_0
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v4, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v4, v3}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/zip/GZIPOutputStream;->write([B)V

    invoke-virtual {v4}, Ljava/util/zip/GZIPOutputStream;->close()V

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    array-length v3, v4

    add-int/lit8 v3, v3, 0x0

    new-instance v6, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v6, v4}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    invoke-interface {v5, v6}, Lorg/apache/http/HttpEntityEnclosingRequest;->setEntity(Lorg/apache/http/HttpEntity;)V

    const-string v4, "Content-Encoding"

    const-string v6, "gzip"

    invoke-interface {v5, v4, v6}, Lorg/apache/http/HttpEntityEnclosingRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_0
    move-exception v0

    const-string v0, "Encoding error, hit will be discarded"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :catch_1
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected IOException: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->a(Ljava/lang/String;)V

    const-string v0, "Request will be discarded"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_b
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Bad response: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    goto/16 :goto_1

    :catch_2
    move-exception v0

    const-string v0, "ClientProtocolException sending hit; discarding hit..."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    :catch_3
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Exception sending hit: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    move v1, v2

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private static b(Ljava/util/List;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/k;",
            ">;I)I"
        }
    .end annotation

    .prologue
    .line 0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    :cond_0
    :goto_0
    return p1

    :cond_1
    add-int/lit8 v1, p1, -0x1

    :goto_1
    if-lez v1, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/k;

    .line 4000
    iget-object v0, v0, Lcom/google/android/gms/b/k;->a:Ljava/lang/String;

    .line 0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "sc=start"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    move p1, v1

    goto :goto_0

    :cond_2
    const-string v2, "sc=end"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    add-int/lit8 p1, v1, 0x1

    goto :goto_0

    :cond_3
    add-int/lit8 v1, v1, -0x1

    goto :goto_1
.end method


# virtual methods
.method public final a(Ljava/util/List;Lcom/google/android/gms/b/o;Z)I
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/k;",
            ">;",
            "Lcom/google/android/gms/b/o;",
            "Z)I"
        }
    .end annotation

    .prologue
    .line 0
    const/16 v2, 0x7f4

    move-object/from16 v0, p0

    iput v2, v0, Lcom/google/android/gms/b/ad;->e:I

    const/16 v2, 0x2000

    move-object/from16 v0, p0

    iput v2, v0, Lcom/google/android/gms/b/ad;->f:I

    const/16 v2, 0x2000

    move-object/from16 v0, p0

    iput v2, v0, Lcom/google/android/gms/b/ad;->g:I

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/b/ad;->p:Lcom/google/android/gms/b/ak;

    invoke-interface {v2}, Lcom/google/android/gms/b/ak;->a()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/google/android/gms/b/ad;->h:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/b/ad;->p:Lcom/google/android/gms/b/ak;

    invoke-interface {v2}, Lcom/google/android/gms/b/ak;->b()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/google/android/gms/b/ad;->i:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/b/ad;->p:Lcom/google/android/gms/b/ak;

    invoke-interface {v2}, Lcom/google/android/gms/b/ak;->c()Lcom/google/android/gms/b/ae;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/google/android/gms/b/ad;->j:Lcom/google/android/gms/b/ae;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/b/ad;->p:Lcom/google/android/gms/b/ak;

    invoke-interface {v2}, Lcom/google/android/gms/b/ak;->d()Lcom/google/android/gms/b/ah;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/google/android/gms/b/ad;->k:Lcom/google/android/gms/b/ah;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/b/ad;->l:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/b/ad;->l:Ljava/util/Set;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/b/ad;->p:Lcom/google/android/gms/b/ak;

    invoke-interface {v3}, Lcom/google/android/gms/b/ak;->e()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    const-wide/16 v2, 0xe10

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/google/android/gms/b/ad;->o:J

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/google/android/gms/b/ad;->m:Z

    if-nez v2, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/b/ad;->l:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/google/android/gms/b/ad;->m:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/google/android/gms/b/ad;->n:J

    :cond_0
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/google/android/gms/b/ad;->m:Z

    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/google/android/gms/b/ad;->n:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    move-object/from16 v0, p0

    iget-wide v6, v0, Lcom/google/android/gms/b/ad;->o:J

    mul-long/2addr v4, v6

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/google/android/gms/b/ad;->m:Z

    :cond_1
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/google/android/gms/b/ad;->m:Z

    if-eqz v2, :cond_4

    sget-object v2, Lcom/google/android/gms/b/ae;->a:Lcom/google/android/gms/b/ae;

    sget-object v7, Lcom/google/android/gms/b/ah;->a:Lcom/google/android/gms/b/ah;

    move-object v8, v2

    :goto_0
    const/4 v11, 0x0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    const/16 v3, 0x14

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v10

    const-string v2, "_hr"

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    move-object/from16 v0, p2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    sget-object v3, Lcom/google/android/gms/b/ae;->a:Lcom/google/android/gms/b/ae;

    if-eq v8, v3, :cond_15

    const/4 v9, 0x1

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    move v3, v2

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/k;

    .line 9000
    iget-object v0, v2, Lcom/google/android/gms/b/k;->a:Ljava/lang/String;

    move-object/from16 v16, v0

    .line 0
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-eqz v16, :cond_5

    const-string v2, ""

    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v16

    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/google/android/gms/b/ad;->f:I

    move/from16 v17, v0

    move/from16 v0, v16

    move/from16 v1, v17

    if-le v0, v1, :cond_2

    const-string v2, ""

    :cond_2
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-nez v16, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    array-length v0, v2

    move/from16 v16, v0

    if-nez v3, :cond_6

    const/4 v2, 0x0

    :goto_3
    add-int v2, v2, v16

    int-to-long v0, v2

    move-wide/from16 v16, v0

    add-long v4, v4, v16

    :cond_3
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    iget v2, v0, Lcom/google/android/gms/b/ad;->g:I

    int-to-long v0, v2

    move-wide/from16 v16, v0

    cmp-long v2, v4, v16

    if-gtz v2, :cond_13

    add-int/lit8 v2, v3, 0x1

    :goto_4
    if-ne v2, v10, :cond_12

    move v3, v2

    move v13, v9

    :goto_5
    const/4 v2, 0x1

    if-le v3, v2, :cond_7

    add-int/lit8 v2, v3, -0x1

    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    move-object/from16 v0, p0

    iget v2, v0, Lcom/google/android/gms/b/ad;->g:I

    int-to-long v0, v2

    move-wide/from16 v18, v0

    cmp-long v2, v16, v18

    if-lez v2, :cond_7

    add-int/lit8 v3, v3, -0x1

    goto :goto_5

    :cond_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/b/ad;->j:Lcom/google/android/gms/b/ae;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/b/ad;->k:Lcom/google/android/gms/b/ah;

    move-object v8, v2

    goto/16 :goto_0

    :cond_5
    invoke-static {v2, v12, v13}, Lcom/google/android/gms/b/l;->a(Lcom/google/android/gms/b/k;J)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_6
    const/4 v2, 0x1

    goto :goto_3

    :cond_7
    move-object/from16 v0, p0

    iget v2, v0, Lcom/google/android/gms/b/ad;->g:I

    int-to-long v0, v2

    move-wide/from16 v16, v0

    cmp-long v2, v4, v16

    if-lez v2, :cond_11

    sget-object v2, Lcom/google/android/gms/b/ad$1;->b:[I

    invoke-virtual {v8}, Lcom/google/android/gms/b/ae;->ordinal()I

    move-result v9

    aget v2, v2, v9

    packed-switch v2, :pswitch_data_0

    const-string v2, "Unexpected batching strategy encountered; sending a single hit."

    invoke-static {v2}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/List;->clear()V

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v2, v3

    :cond_8
    :goto_6
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_11

    const/4 v3, 0x0

    invoke-interface {v6, v3, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    move-object v9, v2

    :goto_7
    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    move v12, v2

    :goto_8
    if-ge v12, v13, :cond_e

    move-object/from16 v0, p1

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/k;

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/google/android/gms/b/ad;->a(Lcom/google/android/gms/b/k;)Ljava/net/URL;

    move-result-object v3

    const/4 v5, 0x1

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    if-nez v3, :cond_b

    const-string v2, "No destination: discarding hit."

    invoke-static {v2}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    add-int v3, v10, v5

    add-int v2, v11, v5

    :goto_9
    add-int/lit8 v5, v12, 0x1

    move v12, v5

    move v10, v3

    move v11, v2

    goto :goto_8

    :pswitch_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    if-gt v3, v2, :cond_8

    move v2, v3

    goto :goto_6

    :pswitch_1
    move-object/from16 v0, p1

    invoke-static {v0, v3}, Lcom/google/android/gms/b/ad;->a(Ljava/util/List;I)I

    move-result v2

    goto :goto_6

    :pswitch_2
    move-object/from16 v0, p1

    invoke-static {v0, v3}, Lcom/google/android/gms/b/ad;->b(Ljava/util/List;I)I

    move-result v2

    goto :goto_6

    :pswitch_3
    move-object/from16 v0, p0

    iget v2, v0, Lcom/google/android/gms/b/ad;->g:I

    mul-int/lit8 v2, v2, 0x2

    int-to-long v0, v2

    move-wide/from16 v16, v0

    cmp-long v2, v4, v16

    if-gez v2, :cond_a

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v3, v2, -0x1

    :goto_a
    if-lez v3, :cond_9

    invoke-interface {v14, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    const-wide/16 v18, 0x2

    div-long v18, v4, v18

    cmp-long v2, v16, v18

    if-lez v2, :cond_9

    add-int/lit8 v3, v3, -0x1

    goto :goto_a

    :cond_9
    move v2, v3

    goto :goto_6

    :cond_a
    move v2, v3

    goto :goto_6

    :pswitch_4
    move v2, v3

    goto/16 :goto_6

    :cond_b
    new-instance v4, Lorg/apache/http/HttpHost;

    invoke-virtual {v3}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Ljava/net/URL;->getPort()I

    move-result v14

    invoke-virtual {v3}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v6, v14, v3}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v2, v9, v8}, Lcom/google/android/gms/b/ad;->a(Lcom/google/android/gms/b/k;Ljava/util/List;Lcom/google/android/gms/b/ae;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, p0

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/b/ad;->a(Ljava/lang/String;Lorg/apache/http/HttpHost;ILcom/google/android/gms/b/o;Lcom/google/android/gms/b/ah;)Z

    move-result v2

    if-nez v2, :cond_c

    const-string v2, "_de"

    const/4 v3, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;I)V

    const-string v2, "_hd"

    move-object/from16 v0, p2

    invoke-virtual {v0, v2, v10}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;I)V

    const-string v2, "_hs"

    move-object/from16 v0, p2

    invoke-virtual {v0, v2, v11}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;I)V

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v4, v8, v7}, Lcom/google/android/gms/b/ad;->a(Lcom/google/android/gms/b/o;Lorg/apache/http/HttpHost;Lcom/google/android/gms/b/ae;Lcom/google/android/gms/b/ah;)V

    move v2, v11

    :goto_b
    return v2

    :cond_c
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v3, v10

    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_10

    add-int/lit8 v2, v3, 0x1

    :goto_d
    move v3, v2

    goto :goto_c

    :cond_d
    const-string v2, "_rs"

    const/4 v6, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v2, v6}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;I)V

    add-int v2, v11, v5

    goto/16 :goto_9

    :cond_e
    const-string v2, "_hd"

    move-object/from16 v0, p2

    invoke-virtual {v0, v2, v10}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;I)V

    const-string v2, "_hs"

    move-object/from16 v0, p2

    invoke-virtual {v0, v2, v11}, Lcom/google/android/gms/b/o;->a(Ljava/lang/String;I)V

    if-eqz p3, :cond_f

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v4, v8, v7}, Lcom/google/android/gms/b/ad;->a(Lcom/google/android/gms/b/o;Lorg/apache/http/HttpHost;Lcom/google/android/gms/b/ae;Lcom/google/android/gms/b/ah;)V

    :cond_f
    move v2, v11

    goto :goto_b

    :cond_10
    move v2, v3

    goto :goto_d

    :cond_11
    move-object v9, v6

    goto/16 :goto_7

    :cond_12
    move v3, v2

    goto/16 :goto_1

    :cond_13
    move v2, v3

    goto/16 :goto_4

    :cond_14
    move v13, v9

    goto/16 :goto_5

    :cond_15
    move v3, v2

    move v13, v10

    goto/16 :goto_5

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/b/ad;->d:Ljava/net/URL;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/ad;->d:Ljava/net/URL;

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/b/ad;->q:Z

    return-void
.end method

.method public final a()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/ad;->c:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "...no network connectivity"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method
