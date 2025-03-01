.class final Lcom/saterskog/a/b$3$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/a/b$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/saterskog/a/b$3;


# direct methods
.method constructor <init>(Lcom/saterskog/a/b$3;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 1095
    iput-object p1, p0, Lcom/saterskog/a/b$3$2;->b:Lcom/saterskog/a/b$3;

    iput-object p2, p0, Lcom/saterskog/a/b$3$2;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    .prologue
    .line 1098
    return-void
.end method
